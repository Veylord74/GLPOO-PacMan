package fr.esiea.glpoo.domain;

public enum Genre {
	
	MALE("m", "boy"),
	FEMALE("f", "girl");
	
	private final String code;
	private final String label;
	
	private Genre(String code, String label) {
		this.code = code;
		this.label = label;
	}
	
	public static Genre valueOfByCode(final String code) {
		for(final Genre genre : values()) {
			if(genre.code.equalsIgnoreCase(code)) {
				return genre;
			}
		}
		
		throw new IllegalArgumentException("Aucun genre ne correspond");
	}

	public String getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}
}
