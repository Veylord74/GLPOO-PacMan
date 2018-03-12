package fr.esiea.glpoo;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.glpoo.dao.ChatDao;
import fr.esiea.glpoo.dao.CsvChatDao;
import fr.esiea.glpoo.domain.Chat;
import ihm.ChatJframe;
import ihm.MenuJFrame;

public class main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		log.info("Start of new session - User opened PacMan program");
		
		//IHM
		
		final MenuJFrame menu = new MenuJFrame();
		// fullscreen (disable "Size of window" section in MenuJFrame to use fullscreen)
		menu.setExtendedState(MenuJFrame.MAXIMIZED_BOTH);
		menu.setVisible(true);
		
		
	}

}
