package fr.esiea.glpoo.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FantomeTest {

	private Fantome Fantome;
	private int positionX;
	private int positionY;
	private int directionX;
	private int directionY;
	private boolean collision;
	private String color;

	@Before
	public void initialize() {
		positionX = 43;
		positionY = 41;
		directionX = 6;
		directionY = 7;
		collision = true;
		color = "red";
		Fantome = new Fantome(positionX, positionY, directionX, directionY, collision, color);
	}

	@Test
	public void testGetteurs() {
		// Arrange
		int expectedPositionX = 43;
		int expectedPositionY = 41;
		int expectedDirectoinX = 6;
		int expectedDirectionY = 7;
		boolean expectedCollision = true;
		String expectedColor = "red";

		// Act

		// Assert
		Assert.assertEquals(expectedPositionX, Fantome.getPositionX());
		Assert.assertEquals(expectedPositionY, Fantome.getPositionY());
		Assert.assertEquals(expectedDirectoinX, Fantome.getDirectionX());
		Assert.assertEquals(expectedDirectionY, Fantome.getDirectionY());
		Assert.assertEquals(expectedCollision, Fantome.getCollision());
		Assert.assertEquals(expectedColor, Fantome.getColor());
	}

	@Test
	public void testSetteurs() {
		// Arrange
		int expectedPositionX = 28;
		int expectedPositionY = 79;
		int expectedDirectoinX = 92;
		int expectedDirectionY = 2;
		boolean expectedCollision = false;

		// Act
		Fantome.setPositionX(28);
		Fantome.setPositionY(79);
		Fantome.setDirectionX(92);
		Fantome.setDirectionY(2);
		Fantome.setCollision(false);

		// Assert
		Assert.assertEquals(expectedPositionX, Fantome.getPositionX());
		Assert.assertEquals(expectedPositionY, Fantome.getPositionY());
		Assert.assertEquals(expectedDirectoinX, Fantome.getDirectionX());
		Assert.assertEquals(expectedDirectionY, Fantome.getDirectionY());
		Assert.assertEquals(expectedCollision, Fantome.getCollision());
	}
}
