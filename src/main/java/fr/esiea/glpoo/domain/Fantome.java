package fr.esiea.glpoo.domain;

import fr.esiea.glpoo.domain.Personnage;

public class Fantome implements Personnage {

	private int positionX;
	private int positionY;
	private int directionX;
	private int directionY;
	private boolean collision;
	private String color;

	public Fantome(int positionX, int positionY, int directionX, int directionY, boolean collision, String color) {
		super();
		this.positionX = positionX;
		this.positionY = positionY;
		this.directionX = directionX;
		this.directionY = directionY;
		this.collision = collision;
		this.color = color;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getDirectionX() {
		return directionX;
	}

	public void setDirectionX(int directionX) {
		this.directionX = directionX;
	}

	public int getDirectionY() {
		return directionY;
	}

	public void setDirectionY(int directionY) {
		this.directionY = directionY;
	}

	public boolean getCollision() {
		return collision;
	}

	public void setCollision(boolean collision) {
		this.collision = collision;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
