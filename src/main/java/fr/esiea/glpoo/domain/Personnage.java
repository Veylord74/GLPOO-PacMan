package fr.esiea.glpoo.domain;

public interface Personnage {

	int getPositionX();

	int getPositionY();

	int getDirectionX();

	int getDirectionY();

	boolean getCollision();

	String getColor();

	boolean getChasseur();
	
}
