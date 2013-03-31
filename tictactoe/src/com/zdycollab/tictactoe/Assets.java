package com.zdycollab.tictactoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Assets {
	public static Texture o;
	public static Texture x;
	public static Texture backgroundTexture;
	public static Skin skin;
	
	public static void load () {
		Texture.setEnforcePotImages(false);
		
		backgroundTexture = new Texture(Gdx.files.internal("o.png"));
		backgroundTexture = new Texture(Gdx.files.internal("x.png"));
		backgroundTexture = new Texture(Gdx.files.internal("back.jpg"));
		
		
	}
}
