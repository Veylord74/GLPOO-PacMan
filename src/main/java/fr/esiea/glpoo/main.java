package fr.esiea.glpoo;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.glpoo.dao.TirageDao;
import fr.esiea.formes.FormeType;
import fr.esiea.formes.SimpleForme;
import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.domain.Chat;

import ihm.MenuJFrame;
import fr.esiea.glpoo.domain.Tirage;
import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;
import ihm.TirageJframe;

public class main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		log.info("Start of new session - User opened PacMan program");
		Map map = new Map(20,20);
		map.addForme(2, 1, FormeType.traine, 9, 10);
		map.displayMapByColor();
		
		
		
		//IHM
		
		/*final MenuJFrame menu = new MenuJFrame();
		final MenuJFrame menu = new MenuJFrame();
		// fullscreen (disable "Size of window" section in MenuJFrame to use fullscreen)
		menu.setExtendedState(MenuJFrame.MAXIMIZED_BOTH);
		menu.setVisible(true);
		
		
		log.debug("Tirage Euro-million:");
		System.out.println("mat");
		Map map = new Map(10,10);

		SimpleForme form = new SimpleForme("lel", 1, 2, FormeType.rectangle, 3, 4);
		form.createFormOnMap(map);
		map.displayMapByColor();*/
		
		
		
	}

}
