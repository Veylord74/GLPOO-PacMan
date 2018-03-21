package fr.esiea.formes;

import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;

public class SimpleForme implements Forme{
		
	//TODO when creating a form it needs the positionx to be before the positionx1 same goes for the positiony and positiony1
	//TODO check if possible in matrice
		private int id;
		private int positionx;
		private int positiony;
		private int positionx1;
		private int positiony1;
		private int dist;
		
		private FormeType formeType;
		
		public SimpleForme(int id, int positionx, int positiony, FormeType formeType, int positionx1, int positiony1) {
			super();
			this.id = id;
			this.positionx = positionx;
			this.positiony= positiony;
			this.positionx1 = positionx1;
			this.positiony1 = positiony1;
			this.formeType = formeType;
			
			this.dist = (int) Math.sqrt(Math.pow((positionx-positionx1), 2)+Math.pow((positiony-positiony1),2));
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
				break;
			case cercle:
				for (int x = 0; x < map.getSizex(); x++)
				{
					for (int y = 0; y < map.getSizey(); y++)
					{
						System.out.println("onemore");
						//formulae equation circle
						if (((int)Math.pow(positionx-x,2)+Math.pow(positiony-y,2))<=(int)Math.pow(dist, 2))
						{
							System.out.println("onemore");
							map.getNodeByPos(x, y).setColor(FormeType.cercle.couleur);
						}
					}
				}
				break;
						
			case triangle:
				
			case traine:
				
			}
		}

		@Override
		public int getName() {
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
