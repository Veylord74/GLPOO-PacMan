package ihm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.domain.Tirage;

public class TirageModel extends AbstractTableModel {

	private final String[] entetes;
	private final List<Tirage> tirages;
	private static final Logger log = Logger.getLogger(Main.class);

	public TirageModel() {
		entetes = new String[] { "Date tirage", "Boule 1", "Boule 2", "Boule 3", "Boule 4", "Boule 5", "étoile 1", "étoile 2" };
		
		CsvTirageDao dao = new CsvTirageDao();
		tirages = dao.findAllTirages();
	}

	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		return tirages.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		final Tirage tirage = tirages.get(arg0);
		switch(arg1) {
		case 0:
			return tirage.getDate();
		case 1:
			return tirage.getBoules()[0];
		case 2:
			return tirage.getBoules()[1];
		case 3:
			return tirage.getBoules()[2];
		case 4:
			return tirage.getBoules()[3];
		case 5:
			return tirage.getBoules()[4];
		case 6:
			return tirage.getEtoiles()[0];
		case 7:
			return tirage.getEtoiles()[1];
		default:
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String getColumnName(int column) {
		return entetes[column];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		
		switch(columnIndex) {
		case 0:
			return LocalDate.class;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			return Integer.class;
		default:
			throw new IllegalArgumentException();
		}
	}
	
	/*public void ajouterChat(final Chat chat) {
		log.debug("ici AjouterChat");
		
		chats.add(chat);
		final int position = chats.size() -1;
		fireTableRowsInserted(position, position);
	}
	
	public void supprimerChat(int position) {
		log.debug("ici SupprimerChat");
		
		chats.remove(position);
		
		fireTableRowsDeleted(position, position);
	}*/
	
}
