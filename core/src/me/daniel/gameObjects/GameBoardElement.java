package me.daniel.gameObjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;

public class GameBoardElement extends Image {

	private boolean active;
	
	public GameBoardElement() {
		super(new Texture("graphics/maps/boardElement.png"));
	
		addListener(new ClickListener() {
			
			public void enter (InputEvent event, float x, float y, int pointer, Actor fromActor) {
				setDrawable(new SpriteDrawable(new Sprite(new Texture("graphics/maps/boardElementOn.png"))));;
			}

			public void exit (InputEvent event, float x, float y, int pointer, Actor toActor) {
				setDrawable(new SpriteDrawable(new Sprite(new Texture("graphics/maps/boardElement.png"))));;
			}
			
		});
		
		addAction(new Action() {
			
			@Override
			public boolean act(float delta) {
				if(isActive())setDrawable(new SpriteDrawable(new Sprite(new Texture("graphics/maps/boardElementActive.png"))));
				else setDrawable(new SpriteDrawable(new Sprite(new Texture("graphics/maps/boardElement.png"))));; 
				return true;
			}
		
		});
	}

	/*
	 * 
	 * Getters and setters
	 * 
	 */
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}