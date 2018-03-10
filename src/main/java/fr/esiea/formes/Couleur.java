package fr.esiea.formes;


public enum Couleur {
	Jaune("jaune"), Rouge("rouge"), Vert("vert"), blanc("blanc");
	String code;
	private Couleur(String code)
	{
		this.code = code;
	}
	public static Couleur valueOfByCode(final String code) 
	{
		for(final Couleur couleur : values()) {
			if(couleur.code.equalsIgnoreCase(code)) {
				return couleur;
			}
		}
		throw new IllegalArgumentException("Aucune couleur ne correspond");
	}
}
