package fr.esiea.glpoo.domain;

import java.time.LocalDate;

public interface Tirage {

	LocalDate getDate();
	
	int[] getBoules();

	int[] getEtoiles();
	
}
