package fr.esiea.glpoo.Map;

import org.junit.Assert;
import org.junit.Test;

import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;

public class MapTest {

	@Test
	public void testVoisins() {
		// Arrange
		int expectedEastId = 1000;
		int expectedSouthId = 1;
		int expectedWestId = -1;
		int expectedNorthId = -1;
		
		// Act
		final Map map= new Map(1000, 1000);

		// Assert
		Assert.assertEquals(map.getNodeById(0).getNodeWest(), -1);
	}

}
