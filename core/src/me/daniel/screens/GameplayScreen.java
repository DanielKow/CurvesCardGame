package me.daniel.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import me.daniel.game.MyGame;

public class GameplayScreen extends AbstractScreen {
	
	private Group firstPlan, secondPlan;
	
	public GameplayScreen(MyGame game) {
		super(game);
	}

	@Override
	protected void init() {
		initPlans();
		initBackground();
	}

	private void initPlans() {
		firstPlan = new Group();
		secondPlan = new Group();
		
		stage.addActor(secondPlan);
		stage.addActor(firstPlan);
	}

	private void initBackground() {
		Image img = new Image(new Texture("graphics/maps/map.png"));
		img.setSize(MyGame.WIDTH, MyGame.HEIGHT);
		secondPlan.addActor(img);
	}

}