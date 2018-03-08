package fr.esiea.glpoo;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.glpoo.dao.TirageDao;
import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.domain.Chat;
import fr.esiea.glpoo.domain.Tirage;
import ihm.TirageJframe;

public class main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		log.info("Tirage Euro-million:");
		
		final TirageDao dao = new CsvTirageDao();
		final List<Tirage> tirages = dao.findAllTirages();
		
		for(final Tirage tirage : tirages) {
			int[] boules = tirage.getBoules();
			int[] etoiles = tirage.getEtoiles();
			String boule = "";
			String etoile = "";
			for(int i = 0; i<5; i++) {
				boule += boules[i] + " ";
			}
			for(int i = 0; i<2; i++) {
				etoile += etoiles[i] + " ";
			}
			log.debug("* Tirage du " + tirage.getDate() + ": - Boules: " + boule + " - Etoiles: " + etoile);
		}
		
		//IHM
		final TirageJframe chatJFrame = new TirageJframe();
		chatJFrame.setVisible(true);
	}

}
