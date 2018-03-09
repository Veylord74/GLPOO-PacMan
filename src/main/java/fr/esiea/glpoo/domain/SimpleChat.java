package fr.esiea.glpoo.domain;

public class SimpleChat implements Chat {
	
	private String name;
	private int age;
	private String[] colors;
	private Genre genre;
	private CatRace race;
	private int nbPaws;
	
	public SimpleChat(String name, int age, String[] colors, Genre genre, CatRace race, int nbPaws) {
		super();
		this.name = name;
		this.age = age;
		this.colors = colors;
		this.genre = genre;
		this.race = race;
		this.nbPaws = nbPaws;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public CatRace getRace() {
		return race;
	}

	public void setRace(CatRace race) {
		this.race = race;
	}

	public int getNbPaws() {
		return nbPaws;
	}

	public void setNbPaws(int nbPaws) {
		this.nbPaws = nbPaws;
	}
	
}
