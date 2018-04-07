package fr.esiea.glpoo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.glpoo.dao.TirageDao;
import fr.esiea.formes.AffichageForme;
import fr.esiea.formes.FormeType;
import fr.esiea.formes.SimpleForme;
import fr.esiea.glpoo.dao.CsvTirageDao;

import ihm.MenuJFrame;
import fr.esiea.glpoo.domain.Tirage;
import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Nodes;
import fr.esiea.glpoo.map.Position;
import ihm.TirageJframe;

public class main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		final TirageDao dao = new CsvTirageDao();
		final Tirage randTirage = dao.findRandomTirage();

		
	
		//IHM
		
		final MenuJFrame menu = new MenuJFrame();
		// fullscreen (disable "Size of window" section in MenuJFrame to use fullscreen)
		menu.setExtendedState(MenuJFrame.MAXIMIZED_BOTH);
		menu.setVisible(true);
		
		
		log.debug("Tirage Euro-million:");

		
		
		
	}

}
