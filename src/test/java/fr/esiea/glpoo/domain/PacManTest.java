package fr.esiea.glpoo.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PacManTest {

	private PacMan PacMan;
	private int positionX;
	private int positionY;
	private int directionX;
	private int directionY;
	private boolean collision;
	private String color;
	private boolean chasseur;

	@Before
	public void initialize() {
		positionX = 0;
		positionY = 0;
		directionX = 42;
		directionY = 42;
		collision = false;
		color = "yellow";
		PacMan = new PacMan(positionX, positionY, directionX, directionY, collision, color, chasseur);
		chasseur = false;
	}

	@Test
	public void testGetteurs() {
		// Arrange
		int expectedPositionX = 0;
		int expectedPositionY = 0;
		int expectedDirectoinX = 42;
		int expectedDirectionY = 42;
		boolean expectedCollision = false;
		String expectedColor = "yellow";
		boolean expectedChasseur = false;

		// Act

		// Assert
		Assert.assertEquals(expectedPositionX, PacMan.getPositionX());
		Assert.assertEquals(expectedPositionY, PacMan.getPositionY());
		Assert.assertEquals(expectedDirectoinX, PacMan.getDirectionX());
		Assert.assertEquals(expectedDirectionY, PacMan.getDirectionY());
		Assert.assertEquals(expectedCollision, PacMan.getCollision());
		Assert.assertEquals(expectedColor, PacMan.getColor());
		Assert.assertEquals(expectedChasseur, PacMan.getChasseur());
	}
	
	@Test
	public void testSetteurs() {
		// Arrange
		int expectedPositionX = 10;
		int expectedPositionY = 15;
		int expectedDirectoinX = 47;
		int expectedDirectionY = 26;
		boolean expectedCollision = true;
		boolean expectedChasseur = true;

		// Act
		PacMan.setPositionX(10);
		PacMan.setPositionY(15);
		PacMan.setDirectionX(47);
		PacMan.setDirectionY(26);
		PacMan.setCollision(true);
		PacMan.setChasseur(true);

		// Assert
		Assert.assertEquals(expectedPositionX, PacMan.getPositionX());
		Assert.assertEquals(expectedPositionY, PacMan.getPositionY());
		Assert.assertEquals(expectedDirectoinX, PacMan.getDirectionX());
		Assert.assertEquals(expectedDirectionY, PacMan.getDirectionY());
		Assert.assertEquals(expectedCollision, PacMan.getCollision());
		Assert.assertEquals(expectedChasseur, PacMan.getChasseur());
	}
}
