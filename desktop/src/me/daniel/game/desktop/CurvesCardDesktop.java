package me.daniel.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.daniel.game.MyGame;

public class CurvesCardDesktop {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = MyGame.WIDTH;
		config.height = MyGame.HEIGHT;
		config.title = MyGame.TITLE;
		config.resizable = false;
		config.fullscreen = true;
		config.vSyncEnabled = true;
		
		new LwjglApplication(new MyGame(), config);
	}
}
