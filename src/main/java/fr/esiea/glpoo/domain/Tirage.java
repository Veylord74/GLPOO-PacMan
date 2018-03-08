package fr.esiea.glpoo.domain;

import java.util.Date;

public interface Tirage {

	Date getDate();
	
	int[] getBoules();

	int[] getEtoiles();
	
}
