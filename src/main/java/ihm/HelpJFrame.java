package ihm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import ihm.MenuJFrame.ImagePanel;

public class HelpJFrame extends JFrame {

	//size of window
		private static final int WIDTH = 800;
		private static final int HEIGHT = 600;
		
		final String BGImage = "src/main/resources/help_img.png";

		private static final Logger log = Logger.getLogger(Main.class);
		
		// load image in panel
		static class ImagePanel extends JPanel {
		    private Image image;
		    ImagePanel(Image image) {
		        this.image = image;
		    }
		    @Override
		    public void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        g.drawImage(image,0,0,getWidth(),getHeight(),this);
		    }
		}
		
		

		public HelpJFrame() {
			setTitle("Tirages euro-milion");
			setPreferredSize(new Dimension(WIDTH, HEIGHT));
			setDefaultCloseOperation(DISPOSE_ON_CLOSE); //closes the JFrame only
			
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation(dim.width/2-WIDTH/2, dim.height/2-HEIGHT/2);

			Image image = Toolkit.getDefaultToolkit().getImage(BGImage);
			ImagePanel imagePanel = new ImagePanel(image);
			getContentPane().add(imagePanel);

			pack();
		}
	
}
