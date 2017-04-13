package me.daniel.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

import me.daniel.game.MyGame;

public class SplashScreen extends AbstractScreen {

	public SplashScreen(final MyGame game) {
		super(game);
		
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				game.setScreen(new MenuScreen(game));
			}
			
		}, 3);
	}

	@Override
	protected void init() {
		Image img = new Image(new Texture("electrity.jpg"));
		img.setSize(MyGame.WIDTH, MyGame.HEIGHT);
		stage.addActor(img);
	}

}