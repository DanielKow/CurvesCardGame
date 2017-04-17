package me.daniel.gameObjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Card extends Image {

	public Card(String name) {
		super(new Texture("graphics/cards/"+name+".png"));
	}
	
}