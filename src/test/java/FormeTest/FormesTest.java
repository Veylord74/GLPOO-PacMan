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
	public void test()
	{
		int ExcpectedRedNodes = 9;
		
		Map map = new Map(10,10);

		SimpleForme form = new SimpleForme("lel", 1, 2, FormeType.rectangle, 3, 4);
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

}
