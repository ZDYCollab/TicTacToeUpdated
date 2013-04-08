package com.zdycollab.tictactoe.screens;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.zdycollab.tictactoe.screens.GameScreen.GameState;
import com.zdycollab.tictactoe.TicTacToe;

public class GameScreen implements Screen{
	TicTacToe game;
	Stage stage;
	Stage staticStage;
	
	enum GameState {
		Play, Pause
	}
	
	GameState gameState = GameState.Play;
	
	Box2DDebugRenderer debugRenderer = new Box2DDebugRenderer();
	
	public GameScreen(TicTacToe game) {
		this.game = game;
	}
	@Override
	public void render(float delta) {				
		Gdx.gl.glClearColor(1f, 0f, 1f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		staticStage.act(delta);
        staticStage.draw();
        stage.act(delta);
        stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
