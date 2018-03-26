package fr.esiea.formes;

import java.util.List;

import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Position;

public class Polynomes implements Forme {

	private List<Position> listSommets;

	public Polynomes(List<Position> position) {
		this.listSommets = position;
	}

	public void createFormOnMap(Map map) {
		for (int k = 0; k < listSommets.size()-1; k++) {
			int positionx = listSommets.get(k).getPositionx();
			int positionx1 = listSommets.get(k + 1).getPositionx();
			int positiony = listSommets.get(k).getPositiony();
			int positiony1 = listSommets.get(k + 1).getPositiony();
			
			if (positionx1 - positionx != 0) {
				float coef = (float) ((float) (positiony1 - positiony) / (float) (positionx1 - positionx));
				int posIni = positiony1 - (int) (coef * positionx1);
				if (positionx < positionx1) {
					for (int i = positionx; i <= positionx1; i++) {
						int posY = (int) (coef * i + posIni);
						for (int j = posY; j < Math.max((int) (coef * (i + 1) + posIni), posY); j++) {
							if (map.existingNode(j, i)) {
								map.getNodeByPos(j, i).setColor(FormeType.traine.couleur);
							}
						}

					}
				} else {
					for (int i = positionx; i >= positionx1; i--) {
						int posY = (int) (coef * i + posIni);
						for (int j = posY; j < Math.max((int) (coef * (i + 1) + posIni), posY); j++) {
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
				} else {
					for (int i = positiony1; i < positiony; i++) {
						map.getNodeByPos(i, positionx).setColor(FormeType.traine.couleur);
					}
				}
			}
		}
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPositionx() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPositiony() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FormeType getFormeType() {
		// TODO Auto-generated method stub
		return null;
	}

}
