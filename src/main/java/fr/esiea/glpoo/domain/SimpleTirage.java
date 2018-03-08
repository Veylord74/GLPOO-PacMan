package fr.esiea.glpoo.domain;

import java.util.Date;

public class SimpleTirage implements Tirage {
	
	private Date date;
	private int[] boules;
	private int[] etoiles;
	
	public SimpleTirage(Date date, int[] boules, int[] etoiles) {
		super();
		this.date = date;
		this.boules = boules;
		this.etoiles = etoiles;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
