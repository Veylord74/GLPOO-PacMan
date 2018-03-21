package fr.esiea.formes;

import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;

public class SimpleForme implements Forme{
		
	//TODO when creating a form it needs the positionx to be before the positionx1 same goes for the positiony and positiony1
	//TODO check if possible in matrice
		private String id;
		private int positionx;
		private int positiony;
		private int positionx1;
		private int positiony1;
		private FormeType formeType;
		
		public SimpleForme(String id, int positionx, int positiony, FormeType formeType, int positionx1, int positiony1) {
			super();
			this.id = id;
			this.positionx = positionx;
			this.positiony= positiony;
			this.positionx1 = positionx1;
			this.positiony1 = positiony1;
			this.formeType = formeType;
		}
		
		public void createFormOnMap(Map map)
		{
			switch (formeType)
			{
			case rectangle:
				for (int x = positionx; x <= positionx1; x++)
				{
					for (int y = positiony; y <= positiony1; y++)
					{
						map.getNodeByPos(x, y).setColor(FormeType.rectangle.couleur);
					}
				}
			case cercle:
			case triangle:
			case traine:
			}
		}

		@Override
		public String getName() {
			return this.id;
		}

		@Override
		public FormeType getFormeType()
		{
			return formeType;
		}

		@Override
		public int getPositionx() {
			return positionx;
		}

		@Override
		public int getPositiony() {
			return positiony;
		}
		
		public int getPositionx1() {
			return positionx1;
		}

		public int getPositiony2() {
			return positiony1;
		}
}
