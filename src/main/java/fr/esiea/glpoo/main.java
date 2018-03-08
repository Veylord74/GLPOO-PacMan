package fr.esiea.glpoo;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.glpoo.dao.TirageDao;
import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.domain.Chat;
import ihm.ChatJframe;

public class main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		log.info("My cat list:");
		
		final TirageDao dao = new CsvTirageDao();
		final List<Chat> cats = dao.findAllCats();
		
		for(final Chat cat : cats) {
			log.debug("* " + cat.getName() + " - " + cat.getRace());
		}
		
		//IHM
		final ChatJframe chatJFrame = new ChatJframe();
		chatJFrame.setVisible(true);
	}

}
