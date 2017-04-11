package me.daniel.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.daniel.game.CurvesCardGame;

public class CurvesCardDesktop {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = CurvesCardGame.WIDTH;
		config.height = CurvesCardGame.HEIGHT;
		config.resizable = false;
		
		new LwjglApplication(new CurvesCardGame(), config);
	}
}
