package me.daniel.gameObjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Card extends Image {

	private int hp, armor,attack, cost;
	
	public Card(String name, String fraction, CardStats stats) {
		super(new Texture("graphics/cards/"+name+".png"));
		setHp(stats.getHp());
		setArmor(stats.getArmor());
		setAttack(stats.getAttack());
		setCost(stats.getCost());
		
		setSize(150, 200);
	}

	/*
	 * 
	 * Getters and setters
	 * 
	 */
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
}