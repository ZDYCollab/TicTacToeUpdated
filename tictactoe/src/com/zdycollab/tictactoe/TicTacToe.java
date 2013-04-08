package com.zdycollab.tictactoe;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.zdycollab.tictactoe.Assets;
import com.zdycollab.tictactoe.screens.MainMenuScreen;
//import com.zdycollab.tictactoe.screens.SplashScreen;

public class TicTacToe extends Game {
	
	public static final String LOG = TicTacToe.class.getSimpleName();
	public void create() {
		// TODO Auto-generated method stub
		//Gdx.app.log(TicTacToe.LOG, "Creating a game");
		Assets.load();
		//Gdx.app.log(TicTacToe.LOG, "Creating a game");
		setScreen(new MainMenuScreen(this));
	}
}
