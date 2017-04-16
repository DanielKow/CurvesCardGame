package me.daniel.gameObjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class GameBoardElement extends Image {

	private boolean active, on;
	private int animationStage;
	private float animationDelay;
	private final static String PATH = "graphics/maps/";
	
	public GameBoardElement() {
		super(new Texture(PATH+"boardElement.png"));
		
		addListener(new ClickListener() {
			
			public void enter (InputEvent event, float x, float y, int pointer, Actor fromActor) {
				setOn(true);
			}

			public void exit (InputEvent event, float x, float y, int pointer, Actor toActor) {
				setOn(false);
			}
			
		});
		
		
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		Sprite on = new Sprite(new Texture(PATH+"on"+animationStage+".png")), active = new Sprite(new Texture(PATH+"active"+animationStage+".png"));
		on.setBounds(getX(), getY(), getWidth(), getHeight());
		active.setBounds(getX(), getY(), getWidth(), getHeight());
		
		if(isOn())on.draw(batch);
		if(isActive())active.draw(batch);
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		animationDelay+=delta;
		if(animationDelay >= 0.5f) {
			animationStage = animationStage == 1 ? 0 : 1;
			animationDelay = 0;
		}
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

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
}