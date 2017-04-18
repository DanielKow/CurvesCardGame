package me.daniel.gameObjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Card extends Image {

	private int hp, armor,attack, cost;
	private Image frame;
	
	public enum Fraction {
		
		CAVES_DWARF("cavesDwarf"),
		ENTHO("entho"),
		DEMONS("demons"),
		ORDER("order"),
		FORGERIN("forgerin"),
		ROBO("robo"),
		CONDEMNED("condemned"),
		ELEMENTS("elements");
		
		String fraction;
		
		private Fraction(String fraction) {
			this.fraction = fraction;
		}
		
	}
	
	public enum Type {
		
		MELEE("Melee"),
		RANGE("Range");
		
		String type;
		
		private Type(String type) {
			this.type = type;
		}
		
	}
	
	public Card(String name, CardStats stats, Fraction fraction, Type type) {
		super(new Texture("graphics/cards/"+fraction.fraction+"/"+name+".png"));
		
		frame = new Image(new Texture("graphics/cards/frames/"+fraction.fraction+type.type+".png"));
		frame.setBounds(0, 0, 200, 150);
		
		setHp(stats.getHp());
		setArmor(stats.getArmor());
		setAttack(stats.getAttack());
		setCost(stats.getCost());
		
		setSize(150, 200);
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		
		frame.draw(batch, parentAlpha);
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