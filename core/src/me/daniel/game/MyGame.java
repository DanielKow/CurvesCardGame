package me.daniel.game;

import com.badlogic.gdx.Game;

import me.daniel.screens.SplashScreen;

public class MyGame extends Game {

	public static final int WIDTH = 800, HEIGHT = 600;
	public static final String TITLE = "KRZYWE KARTY 2";
	private boolean paused;
	
	@Override
	public void create() {
		setScreen(new SplashScreen(this));
	}

	/*
	 * 
	 * Getters and setters
	 * 
	 */
	
	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
	
}