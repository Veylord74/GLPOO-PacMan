package fr.esiea.formes;


public enum Couleur {
	Jaune("jaune","j"), Rouge("rouge","r"), Vert("vert","v"), blanc("blanc","b");
	String code;
	String alias;
	private Couleur(String code, String alias)
	{
		this.code = code;
		this.alias = alias;
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
	
	public static Couleur valueOfByAlias(final String alias) 
	{
		for(final Couleur couleur : values()) {
			if(couleur.code.equalsIgnoreCase(alias)) {
				return couleur;
			}
		}
		throw new IllegalArgumentException("Aucune couleur ne correspond");
	}
	public String getAlias()
	{
		return alias;
	}
}
