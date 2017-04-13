package me.daniel.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import me.daniel.game.MyGame;
import me.daniel.gui.ClickCallback;
import me.daniel.gui.MyButton;

public class MenuScreen extends AbstractScreen {

	private Group firstPlan, secondPlan;
	private MyButton startButton, authorButton, exitButton;
	
	public MenuScreen(MyGame game) {
		super(game);
	}

	@Override
	protected void init() {
		initPlans();
		initBackground();
		initButtons();
	}

	private void initButtons() {
		startButton = new MyButton("start", 300, 400, 200, 100, new ClickCallback() { 
			
			@Override
			public void click() {
				
			}
			
		});
		authorButton = new MyButton("author", 300, 250, 200, 100, new ClickCallback() {
			
			@Override
			public void click() {
				
			}
			
		});
		exitButton = new MyButton("exit", 300, 100, 200, 100, new ClickCallback() {
			
			@Override
			public void click() {
				dispose();
				Gdx.app.exit();
			}
			
		});
		
		firstPlan.addActor(startButton);
		firstPlan.addActor(authorButton);
		firstPlan.addActor(exitButton);
	}

	private void initBackground() {
		Image background = new Image(new Texture("wind.jpg"));
		background.setSize(MyGame.WIDTH, MyGame.HEIGHT);
		secondPlan.addActor(background);
	}

	private void initPlans() {
		firstPlan = new Group();
		secondPlan = new Group();
		
		stage.addActor(secondPlan);
		stage.addActor(firstPlan);
	}

}