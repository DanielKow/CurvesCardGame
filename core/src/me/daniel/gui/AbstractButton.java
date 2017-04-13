package me.daniel.gui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;

public class AbstractButton extends Image {
	
	private static String path = "graphics/buttons/";
	
	public AbstractButton(final String name) {
		super(new Texture(path+name+"Out.png"));
		
		addListener(new ClickListener() {
			
			public void enter (InputEvent event, float x, float y, int pointer, Actor fromActor) {
				setDrawable(new SpriteDrawable(new Sprite(new Texture(path+name+"In.png"))));
			}

			public void exit (InputEvent event, float x, float y, int pointer, Actor toActor) {
				setDrawable(new SpriteDrawable(new Sprite(new Texture(path+name+"Out.png"))));
			}
			
			public void clicked (InputEvent event, float x, float y) {
			
			}
			
		});
		
	}
	
}