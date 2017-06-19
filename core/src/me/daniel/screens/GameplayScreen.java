package me.daniel.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import me.daniel.game.MyGame;

public class GameplayScreen extends AbstractScreen {
	
	private Group firstPlan, secondPlan, battleZone;
	private Group[] graveyards, decks, shields, manaZones;
	
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
		battleZone = new Group();
		graveyards = new Group[2];
		decks = new Group[2];
		shields = new Group[2];
		manaZones = new Group[2];
		
		final int Y  = 180, X = 215; 
		
		battleZone.setBounds(0, 2*Y, MyGame.WIDTH, 2*Y);
		manaZones[0].setBounds(0, 0, MyGame.WIDTH, Y);
		manaZones[1].setBounds(0, 5*Y, MyGame.WIDTH, Y);
		shields[0].setBounds(0, Y, 5*X, Y);
		shields[1].setBounds(0, 4*Y, 5*X, Y);
		decks[0].setBounds(5*X, Y, X, Y);
		decks[1].setBounds(5*X, 4*Y, X, Y);
		graveyards[0].setBounds(6*X, Y, X, Y);
		graveyards[1].setBounds(6*X, 4*Y, X, Y);
		
		stage.addActor(secondPlan);
		stage.addActor(firstPlan);
		firstPlan.addActor(battleZone);
		firstPlan.addActor(shields[0]);
		firstPlan.addActor(shields[1]);
		firstPlan.addActor(decks[0]);
		firstPlan.addActor(decks[1]);
		firstPlan.addActor(manaZones[0]);
		firstPlan.addActor(manaZones[1]);
		firstPlan.addActor(graveyards[0]);
		firstPlan.addActor(graveyards[1]);
	}

	private void initBackground() {
		Image img = new Image(new Texture("graphics/maps/map.jpg"));
		img.setSize(MyGame.WIDTH, MyGame.HEIGHT);
		secondPlan.addActor(img);
	}
	
}