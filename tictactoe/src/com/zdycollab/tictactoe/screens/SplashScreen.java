package com.zdycollab.tictactoe.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.zdycollab.tictactoe.screens.MainMenuScreen;
import com.zdycollab.tictactoe.Assets;
import com.zdycollab.tictactoe.TicTacToe;;

public class SplashScreen implements Screen{

	TicTacToe game;
	Stage stage;
	
	public SplashScreen(TicTacToe game) {
		this.game = game;
	}
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor( 0f, 0f, 0f, 1f );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );

		stage.act(delta);
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		stage.setViewport( width, height, true );		
	}

	@Override
	public void show() {
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		
		Image splashImage = new Image(Assets.backgroundTexture);
		splashImage.addAction( Actions.sequence( Actions.fadeOut( 0.001f ), Actions.fadeIn( 2f ), Actions.run(onSplashFinishedRunnable) ) );
		
		stage.addActor(splashImage);		
	}
	
	Runnable onSplashFinishedRunnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			game.setScreen(new MainMenuScreen(game));
		}
	};

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
		stage.dispose();
	}

}
