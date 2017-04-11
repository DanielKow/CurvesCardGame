package me.daniel.screens;

import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

import me.daniel.game.MyGame;

public class SplashScreen extends AbstractScreen {

	public SplashScreen(MyGame game) {
		super(game);
	}

	@Override
	protected void init() {
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				game.setScreen(new MenuScreen(game));
			}
			
		}, 3);
	}

}