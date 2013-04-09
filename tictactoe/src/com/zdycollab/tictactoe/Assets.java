package com.zdycollab.tictactoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Animation;
//import com.badlogic.gdx.graphics.g2d.TextureAtlas;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Assets {
	public static Texture o;
	public static Texture x;
	public static Texture backgroundTexture,anotherBackground;
	public static Skin skin;
	
	public static void load () {
		Texture.setEnforcePotImages(false);
		
		o = new Texture(Gdx.files.internal("o.png"));
		x = new Texture(Gdx.files.internal("x.png"));
		backgroundTexture = new Texture(Gdx.files.internal("back.jpg"));
		anotherBackground = new Texture(Gdx.files.internal("anotherback.jpg"));
		
		skin = new Skin(Gdx.files.internal("data/uiskin.json"));
		
	}
}
