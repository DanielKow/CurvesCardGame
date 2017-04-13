package me.daniel.gui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;

public class MyButton extends Image {
	
	private static String path = "graphics/buttons/";
	
	public MyButton(final String name, float x, float y, float width, float height, final ClickCallback click) {
		super(new Texture(path+name+"Out.png"));
		
		setBounds(x, y, width, height);
		
		addListener(new ClickListener() {
			
			public void enter (InputEvent event, float x, float y, int pointer, Actor fromActor) {
				setDrawable(new SpriteDrawable(new Sprite(new Texture(path+name+"In.png"))));
			}

			public void exit (InputEvent event, float x, float y, int pointer, Actor toActor) {
				setDrawable(new SpriteDrawable(new Sprite(new Texture(path+name+"Out.png"))));
			}
			
			public void clicked (InputEvent event, float x, float y) {
				click.click();
			}
			
		});
		
	}
	
}