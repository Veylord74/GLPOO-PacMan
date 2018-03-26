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
