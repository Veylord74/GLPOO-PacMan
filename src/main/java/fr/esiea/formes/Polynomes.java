package fr.esiea.formes;

import java.util.List;

import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Position;

public class Polynomes implements Forme {

	private List<Position> listSommets;

	public Polynomes(List<Position> position) {
		this.listSommets = position;
	}

	public void createFormOnMap(Map map, boolean filled) {
		for (int k = 0; k < listSommets.size() - 1; k++) {
			SimpleForme.createLineOnMat(map, listSommets.get(k), listSommets.get(k + 1), FormeType.polynome.couleur);

		}
		SimpleForme.createLineOnMat(map, listSommets.get(listSommets.size() - 1), listSommets.get(0),FormeType.polynome.couleur);
		if (filled) {
			for (int i = 0; i < map.getSizex(); i++) {
				for (int j = 0; j < map.getSizey(); j++) {
					Position pos = new Position(i, j);
					if (this.checkPointInPoly(map, pos)) {
						map.getNodeByPos(pos).addColor(FormeType.polynome.couleur, false);
					}
				}
			}
			for (int i = 0; i < map.getSizex(); i++)
			{
				for (int j = 0; j < map.getSizey(); j++)
				{
					map.getNodeByPos(i, j).setLastColor();
				}
			}
		}
	}

	public boolean checkPointInPoly(Map map, Position pos) {
		int j = 0;
		int y = pos.getPositiony();
		for (int i = pos.getPositionx(); i < map.getSizex(); i++) {
			if (map.getNodeByPos(i, y).getColor().alias.equalsIgnoreCase(FormeType.polynome.couleur.alias)) {
				j++;
			}
		}
		return (!(j % 2 == 0));
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
