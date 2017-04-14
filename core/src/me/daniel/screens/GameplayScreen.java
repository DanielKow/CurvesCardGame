package me.daniel.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import me.daniel.game.MyGame;
import me.daniel.gameObjects.GameBoardElement;

public class GameplayScreen extends AbstractScreen {
	
	private Group firstPlan, secondPlan;
	private GameBoardElement[][] board;
	
	public GameplayScreen(MyGame game) {
		super(game);
	}

	@Override
	protected void init() {
		initPlans();
		initBackground();
		initBoard();
	}

	private void initBoard() {
		board = new GameBoardElement[5][5];
		for(int i = 0; i < board.length;i++)
		{
			for(int j = 0; j < board[0].length; j++)
			{
				if(isGoodPositionOnTheBoard(i, j)) {
					GameBoardElement element = new GameBoardElement();
					element.setBounds((MyGame.WIDTH-5*175)/2+i*175, 20+j*210, 150, 200);
					setBoardElement(i, j, element);
					firstPlan.addActor(getBoardElement(i, j));
				}
			}
		}
	}

	private boolean isGoodPositionOnTheBoard(int i, int j) {
		if(i != 2)return true;
		else if(j == 0 || j == 4)return true;
		return false;
	}

	private void initPlans() {
		firstPlan = new Group();
		secondPlan = new Group();
		
		stage.addActor(secondPlan);
		stage.addActor(firstPlan);
	}

	private void initBackground() {
		Image img = new Image(new Texture("graphics/maps/map.jpg"));
		img.setSize(MyGame.WIDTH, MyGame.HEIGHT);
		secondPlan.addActor(img);
	}

	/*
	 * 
	 * Getters and setters
	 * 
	 */
	
	public void setBoardElement(int i, int j, GameBoardElement element) {
		board[i][j] = element;
	}
	
	public GameBoardElement getBoardElement(int i, int j) {
		return board[i][j];
	}
	
}