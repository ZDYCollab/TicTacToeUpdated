package com.zdycollab.tictactoe.screens;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
//import com.zdycollab.tictactoe.screens.GameScreen.GameState;
import com.zdycollab.tictactoe.Assets;
import com.zdycollab.tictactoe.TicTacToe;

public class GameScreen implements Screen{
	//private Skin skin;
	TicTacToe game;
	Stage stage;
	TextButton startGameButton;
	
	public GameScreen(TicTacToe game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

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
		//stage = new Stage();
		stage = new Stage();
		
		//skin = new Skin(Gdx.files.internal("data/uiskin.json"));
		Table table = new Table(Assets.skin);
		Image backImage = new Image(Assets.anotherBackground);
		backImage.setHeight(Gdx.graphics.getHeight());
		backImage.setWidth(Gdx.graphics.getWidth());
		Gdx.input.setInputProcessor(stage);
		
		//create buttons
		Skin skin = new Skin(Gdx.files.internal("data/uiskin.json"));
		TextButton back = new TextButton("Back", Assets.skin);
		back.setX(0);
		back.setY(0);
	
		back.addListener(new EventListener() {

			@Override
			public boolean handle(Event event) {
				game.setScreen(MainMenuScreen);
				return true;
			}
			
		});
		
		table.setFillParent(true);
		stage.addActor(backImage);
		stage.addActor(table);
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
