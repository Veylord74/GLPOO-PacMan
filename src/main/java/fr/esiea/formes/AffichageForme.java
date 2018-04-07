package fr.esiea.formes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.domain.Tirage;
import fr.esiea.glpoo.map.Map;
import fr.esiea.glpoo.map.Position;

public class AffichageForme {
	 
	public static Image getImageFromMap(Map map)
	{
	    BufferedImage image = new BufferedImage(map.getSizex(), map.getSizey(), BufferedImage.TYPE_INT_RGB);
	    for(int col = 0; col < map.getSizey(); col++)
	    {
	    	for (int line = 0; line < map.getSizex(); line ++)
	    	{
	    		if (map.getNodeByPos(col, line).getColor().getAlias().equalsIgnoreCase(Couleur.blanc.alias))
	    		{
	    			image.setRGB(line, col, Color.YELLOW.getRGB());
	    		}
	    		else
	    		{
	    			image.setRGB(line, col, Color.BLUE.getRGB());
	    		}
	    	}
	    }
	    return image;
	  }
	
	public static Map createRandomPoly()
	{
		CsvTirageDao csvTirage = new CsvTirageDao();
		Tirage tirage = csvTirage.findRandomTirage();
		Map map = new Map(500,500);
		Position pos2 = new Position (tirage.getBoules()[0]*10,tirage.getEtoiles()[0]*10);
		Position pos3 = new Position(tirage.getBoules()[1]*10,tirage.getEtoiles()[1]*10);
		Position pos4 = new Position (tirage.getBoules()[2]*10, tirage.getBoules()[3]*10);
		Position pos5 = new Position(tirage.getBoules()[4]*10,tirage.getBoules()[0]*10);
		List<Position> ListPos= Arrays.asList(pos2,pos3,pos4,pos5);
		
		map.addPolygone(ListPos, false);
		return map;
	}
	
	
	public static void displayRandomPoly()
	{
		Map map = createRandomPoly();
		Image image = AffichageForme.getImageFromMap(map);
		AffichageForme.displayImage(image);
	}
	 
	  public static void displayImage(Image image)
	  {
		ImageIcon icon = new ImageIcon(image);
		JFrame frame = new JFrame();
	    JPanel jp = new JPanel();
	    JLabel img = new JLabel();
	    JButton buttonClose = new JButton("Close Window");
	    buttonClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			    System.out.println("hey");

				
			}
		});
	    JButton buttonPoly = new JButton("new Poly");
	    buttonPoly.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			    System.out.println("hey");

				Map mapp = createRandomPoly();
				System.out.println(mapp != null);
			    img.setIcon(new ImageIcon(getImageFromMap(mapp)));
				frame.revalidate();
				frame.repaint();
				
			}
		});
	    JButton buttonCircle = new JButton("new circle");
	    buttonPoly.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.revalidate();
				frame.repaint();
				
			}
		});
	    img.setIcon(icon);
	    jp.add(img);
	    jp.add(buttonClose);
	    jp.add(buttonCircle);
	    jp.add(buttonPoly);
	    frame.add(jp);
	    frame.setSize(new Dimension(1000, 1000));
	    frame.setVisible(true);
	  }
	  
}
