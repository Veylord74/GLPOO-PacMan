package ihm;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import fr.esiea.chat.dao.CsvChatDao;
import fr.esiea.chat.domain.CatRace;
import fr.esiea.chat.domain.Chat;
import fr.esiea.chat.domain.Genre;
import fr.esiea.chat.domain.SimpleChat;

public class ChatModel extends AbstractTableModel {

	private final String[] entetes;
	private final List<Chat> chats;
	private static final Logger log = Logger.getLogger(Main.class);

	public ChatModel() {
		entetes = new String[] { "Name", "Age", "Colors", "Genre", "Race", "NbPaws" };
		
		CsvChatDao dao = new CsvChatDao();
		chats = dao.findAllCats();
	}

	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		return chats.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		final Chat cat = chats.get(arg0);
		switch(arg1) {
		case 0:
			return cat.getName();
		case 1:
			return cat.getAge();
		case 2:
			return cat.getColors();
		case 3:
			return cat.getGenre();
		case 4:
			return cat.getRace();
		case 5:
			return cat.getNbPaws();
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
		case 2:
			return String.class;
		case 1:
		case 5:
			return Integer.class;
		case 3:
			return Genre.class;
		case 4:
			return CatRace.class;
		default:
			throw new IllegalArgumentException();
		}
	}
	
	public void ajouterChat(final Chat chat) {
		log.debug("ici AjouterChat");
		
		chats.add(chat);
		final int position = chats.size() -1;
		fireTableRowsInserted(position, position);
	}
	
	public void supprimerChat(int position) {
		log.debug("ici SupprimerChat");
		
		chats.remove(position);
		
		fireTableRowsDeleted(position, position);
	}
	
}
