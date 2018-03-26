package FormeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.esiea.formes.Couleur;
import fr.esiea.formes.FormeType;
import fr.esiea.formes.SimpleForme;
import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;
import junit.framework.Assert;

public class FormesTest {

	@Test
	public void testRectangle()
	{
		int ExcpectedRedNodes = 9;
		
		Map map = new Map(10,10);

		SimpleForme form = new SimpleForme(1, 1, 2, FormeType.rectangle, 3, 4);
		form.createFormOnMap(map);
		map.displayMapByColor();
		int testValue = 0;
		for (int x = 0; x < 10; x++)
		{
			for (Nodes node : map.getMat()[x])
			{
				if (node.getColor().getAlias().equals(Couleur.Rouge.getAlias()))
				{
					testValue++;
				}
			}
		}
		Assert.assertEquals(ExcpectedRedNodes, testValue);
	}
	
	@Test
	public void testCircle()
	{
		int ExcpectedYellowNodes = 13;
		Map map = new Map (10,10);
		int positionx = 5;
		int positionx1 = 3;
		int positiony = 5;
		int positiony1 = 3;
		FormeType formeType = FormeType.cercle;
		map.addFormeSimple(positionx, positiony, formeType, positionx1, positiony1);
		map.displayMapByColor();
		int testValue = 0;
		for (int x = 0; x < 10; x++)
		{
			for (Nodes node : map.getMat()[x])
			{
				if (node.getColor().getAlias().equals(Couleur.Jaune.getAlias()))
				{
					testValue++;
				}
			}
		}
		Assert.assertEquals(ExcpectedYellowNodes, testValue);

	}
	@Test
	public void testTraine(){
	int ExcpectedGreenNodes = 10;
	Map map = new Map(20,20);
	map.addFormeSimple(2, 1, FormeType.traine, 9, 10);
	map.displayMapByColor();
	int testValue = 0;
	for (int x = 0; x < map.getSizex(); x++)
	{
		for (int y = 0; y < map.getSizey(); y++)
		{
			if (map.getNodeByPos(y, x).getColor().getAlias().equals(Couleur.Vert.getAlias()))
			{
				testValue++;
			}
		}
	}
	map.displayMapByColor();

	Assert.assertEquals(ExcpectedGreenNodes, testValue);

	}

}
