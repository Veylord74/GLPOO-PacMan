package ihm;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import fr.esiea.chat.domain.Genre;

public class GenreRenderer extends DefaultTableCellRenderer {

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		final Genre genre = (Genre) value;
		Color blue = new Color(114,189,255);
		setText(genre.getLabel());
		setBackground(genre == Genre.MALE ? blue : Color.PINK);
		
		return this;
	}
	
	

}
