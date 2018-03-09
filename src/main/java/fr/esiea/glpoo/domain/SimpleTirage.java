package fr.esiea.glpoo.domain;

import java.time.LocalDate;

public class SimpleTirage implements Tirage {
	
	private LocalDate date;
	private int[] boules;
	private int[] etoiles;
	
	public SimpleTirage(LocalDate date, int[] boules, int[] etoiles) {
		super();
		this.date = date;
		this.boules = boules;
		this.etoiles = etoiles;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int[] getBoules() {
		return boules;
	}

	public void setBoules(int[] boules) {
		this.boules = boules;
	}

	public int[] getEtoiles() {
		return etoiles;
	}

	public void setEtoiles(int[] etoiles) {
		this.etoiles = etoiles;
	}
	
}
