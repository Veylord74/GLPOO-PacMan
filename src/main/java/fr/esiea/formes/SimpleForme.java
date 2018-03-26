package fr.esiea.formes;

import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;

public class SimpleForme implements Forme {

	// TODO when creating a form it needs the positionx to be before the positionx1
	// same goes for the positiony and positiony1
	// TODO check if possible in matrice
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
		this.positiony = positiony;
		this.positionx1 = positionx1;
		this.positiony1 = positiony1;
		this.formeType = formeType;

		this.dist = (int) Math.sqrt(Math.pow((positionx - positionx1), 2) + Math.pow((positiony - positiony1), 2));
	}

	public void createFormOnMap(Map map) {
		switch (formeType) {
		case rectangle:
			for (int x = positionx; x <= positionx1; x++) {
				for (int y = positiony; y <= positiony1; y++) {
					map.getNodeByPos(y, x).setColor(FormeType.rectangle.couleur);
				}
			}
			break;
		case cercle:
			for (int x = 0; x < map.getSizex(); x++) {
				for (int y = 0; y < map.getSizey(); y++) {
					System.out.println("onemore");
					// formulae equation circle
					if ((Math.pow(positionx - x, 2) + Math.pow(positiony - y, 2)) <= Math.pow(dist, 2)) {
						System.out.println("onemore");
						map.getNodeByPos(y, x).setColor(FormeType.cercle.couleur);
					}
				}
			}
			break;

		case triangle:
			for (int y = positiony; y < dist + positiony; y++) {
				for (int x = positionx; x < positionx + y - positiony + 1; x++) {
					if (map.existingNode(y, x)) {
						map.getNodeByPos(y, x).setColor(FormeType.triangle.couleur);
					}
				}
			}
			break;

		case traine:
			if (positionx1 - positionx != 0) {
				float coef = (float)((float)(positiony1 - positiony) / (float)(positionx1 - positionx));
				int posIni =  positiony1 - (int)(coef * positionx1);
				if(positionx < positionx1) {
					for (int i = positionx; i <= positionx1; i++) {
						int posY = (int) (coef * i + posIni);
						for (int j = posY; j< Math.max((int)(coef*(i+1)+posIni),posY); j++)
						{
							if (map.existingNode(j, i)) {
								map.getNodeByPos(j, i).setColor(FormeType.traine.couleur);
							}
						}
						
					}
				}
				else {
					for (int i = positionx; i >= positionx1; i--) {
						int posY = (int) (coef * i + posIni);
						for (int j = posY; j< Math.max((int)(coef*(i+1)+posIni),posY); j++)
						{
							if (map.existingNode(j, i)) {
								map.getNodeByPos(j, i).setColor(FormeType.traine.couleur);
							}
						}
						
					}
				}
			} else {
				if (positiony < positiony1) {
					for (int i = positiony; i < positiony1; i++) {
						map.getNodeByPos(i, positionx).setColor(FormeType.traine.couleur);
					}
				}
				else {
					for (int i = positiony1; i < positiony; i++)
					{
						map.getNodeByPos(i, positionx).setColor(FormeType.traine.couleur);
					}
				}
			}

		}
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public FormeType getFormeType() {
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
