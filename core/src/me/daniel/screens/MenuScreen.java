package me.daniel.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import me.daniel.game.MyGame;

public class MenuScreen extends AbstractScreen {

	private Group firstPlan, secondPlan;
	
	public MenuScreen(MyGame game) {
		super(game);
	}

	@Override
	protected void init() {
		initPlans();
		initBackground();
	}

	private void initBackground() {
		Image background = new Image(new Texture("wind.jpg"));
		background.setSize(MyGame.WIDTH, MyGame.HEIGHT);
		stage.addActor(background);
	}

	private void initPlans() {
		firstPlan = new Group();
		secondPlan = new Group();
		
		stage.addActor(secondPlan);
		stage.addActor(firstPlan);
	}

}