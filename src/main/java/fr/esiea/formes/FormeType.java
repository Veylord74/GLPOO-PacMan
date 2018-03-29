package fr.esiea.formes;

import fr.esiea.glpoo.map.Map;

public enum FormeType {
	triangle("vert","tri"), rectangle("rouge","rect"), cercle("jaune","cerc"), traine("vert","trai"), polynome("orange", "pol");
	final Couleur couleur;
	String code;
	FormeType(String couleur, String code){
		this.couleur = Couleur.valueOfByCode(couleur);
		this.code = code;
	}
	static private FormeType ValueOfByCode(String code)
	{
		for(FormeType formetype : values())
		{
			if(formetype.code.equalsIgnoreCase(code)) {
				return formetype;
			}		
		}
		throw new IllegalArgumentException("Cette forme n'existe pas");
	}
	
}
