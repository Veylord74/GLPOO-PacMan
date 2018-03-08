package fr.esiea.chat.domain;

public enum CatRace {
	
	SIAMOIS("si", "siamois", false),
	SHORTHAIR("sh", "shorthair", true),
	RAGDOLL("rd", "ragdoll", true),
	CHARTREUX("ch", "chartreux", true),
	DEVONREX("dr", "devon rex", false);
	
	private final String code;
	private final String label;
	private final boolean cute;
	
	private CatRace(String code, String label, boolean cute) {
		this.code = code;
		this.label = label;
		this.cute = cute;
	}
	
	public static CatRace valueOfByCode(final String code) {
		for(final CatRace race : values()) {
			if(race.code.equalsIgnoreCase(code)) {
				return race;
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

	public boolean isCute() {
		return cute;
	}
	
}
