package fr.esiea.formes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.esiea.glpoo.map.Map;

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
	 
	  public static void displayImage(Image image)
	  {
		ImageIcon icon = new ImageIcon(image);
		JFrame frame = new JFrame();
	    JPanel jp = new JPanel();
	    JLabel img = new JLabel();
	    img.setIcon(icon);
	    jp.add(img);
	    frame.add(jp);
	    frame.setSize(new Dimension(1000, 1000));
	    frame.setVisible(true);
	  }
	  
}
