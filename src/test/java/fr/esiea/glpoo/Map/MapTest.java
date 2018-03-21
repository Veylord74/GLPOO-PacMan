package fr.esiea.glpoo.Map;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;

public class MapTest {

	private  Map map;
	int sizey;
	int sizex;
	
	@Before
	public void initialize()
	{
		sizex = 10;
		sizey = 10;
		map= new Map(sizex, sizey);
	}
	
	@Test
	public void testVoisinsNodes() {
		// Arrange
		int expectedEastId = 1;
		int expectedSouthId = sizey;
		int expectedWestId = -1;
		int expectedNorthId = -1;
		int expectedNeighborCount = 2;
		int nodeTest0 = 0;
		
		int expectedEastId2 = (int)((sizex*sizey)/2)+1;
		int expectedSouthId2 = (int)((sizex*sizey)/2)+sizey;
		int expectedWestId2 = (int)((sizex*sizey)/2)-1;
		int expectedNorthId2 = (int)((sizex*sizey)/2)-sizey;
		int expectedNeighborCount2 = 4;
		int nodeTest2 = (int)((sizex*sizey)/2);
		
		// Act
		
		// Assert
		System.out.println(map==null);
		Assert.assertEquals(map.getNodeById(nodeTest0).getNodeEast(), expectedEastId);
		Assert.assertEquals(map.getNodeById(nodeTest0).getNodeSouth(), expectedSouthId);
		Assert.assertEquals(map.getNodeById(nodeTest0).getNodeWest(), expectedWestId);
		Assert.assertEquals(map.getNodeById(nodeTest0).getNodeNorth(), expectedNorthId);

		Assert.assertEquals(map.getNodeById(nodeTest0).getNeighborCount(), expectedNeighborCount);

		Assert.assertEquals(map.getNodeById(nodeTest2).getNodeEast(), expectedEastId2);
		Assert.assertEquals(map.getNodeById(nodeTest2).getNodeSouth(), expectedSouthId2);
		Assert.assertEquals(map.getNodeById(nodeTest2).getNodeWest(), expectedWestId2);
		Assert.assertEquals(map.getNodeById(nodeTest2).getNodeNorth(), expectedNorthId2);

		Assert.assertEquals(map.getNodeById(nodeTest2).getNeighborCount(), expectedNeighborCount2);
		
	}
	
	@Test
	public void testVoisinsNodesMinMax() {
		// Arrange
		int maxNeighbor = 4;
		int minNeighbor = 2;

		// Act

		// Assert
		for (int i = 0 ; i < sizex; i++)
		{
			for (Nodes node : map.getMat()[i])
			{
				Assert.assertTrue(node.getNeighborCount()<=maxNeighbor && node.getNeighborCount()>=minNeighbor);;				
			}
		}
	}

}
