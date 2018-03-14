package fr.esiea.glpoo;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.glpoo.dao.TirageDao;
import fr.esiea.formes.FormeType;
import fr.esiea.formes.SimpleForme;
import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.domain.Chat;
import fr.esiea.glpoo.domain.Tirage;
import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;
import ihm.TirageJframe;

public class main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		System.out.println("mat");
		Map map = new Map(10,10);

		SimpleForme form = new SimpleForme("lel", 1, 2, FormeType.rectangle, 3, 4);
		form.createFormOnMap(map);
		map.displayMapByColor();
		
		/*log.info("Tirage Euro-million:");
		
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
		*/
	}

}
