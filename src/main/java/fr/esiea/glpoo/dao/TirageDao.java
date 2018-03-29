package fr.esiea.glpoo.dao;

import java.util.List;

import fr.esiea.glpoo.domain.Tirage;

public interface TirageDao {

	List<Tirage> findAllTirages();
	Tirage findRandomTirage();
}
