package ihm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

import org.apache.log4j.Logger;

public class MenuJFrame extends JFrame {
	
	private static final Logger log = Logger.getLogger(MenuJFrame.class);
	
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
        
	final String AnimatedImage = "src/main/resources/PM2.jpg";
	//final String path = "src/test/resources/chats.csv";
	
	public MenuJFrame() {
		try {
			
			setTitle("PacMan - Menu principal");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			// Size of window (disable "setExtendedState" in main to customize window size)
			/*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			int width = (int) screenSize.getWidth();
			int height = (int) screenSize.getHeight();
			setPreferredSize(new Dimension(width, height));*/
			
			// Blue background
			/*final JPanel background = new JPanel();
			background.setBackground(new Color(24, 100, 255));
			getContentPane().add(background);*/
			
			// loads the image and put it in the frame
			Image image = Toolkit.getDefaultToolkit().getImage(AnimatedImage);
			//Image image = Toolkit.getDefaultToolkit().getImage(new URL("https://media.giphy.com/media/9J7tdYltWyXIY/giphy.gif"));
			ImagePanel imagePanel = new ImagePanel(image);
			getContentPane().add(imagePanel);
			
			// Buttons play / help
			final JPanel menuButton = new JPanel();
			Color black = new Color(0, 0, 0);
			menuButton.setBackground(black);
			getContentPane().add(menuButton, BorderLayout.SOUTH);
			
			final JButton bouttonPlay = new JButton(new PlayAction());
			menuButton.add(bouttonPlay);

			final JButton bouttonHelp = new JButton(new HelpAction());
			menuButton.add(bouttonHelp);
			
			
			pack();
			
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		
		
	}
	
	public class PlayAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

			log.info("Action performed - PLAY");

			

		}

		public PlayAction() {

			super("PLAY");

		}
	}
	
public class HelpAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

			log.info("Action performed - HELP");

			

		}

		public HelpAction() {

			super("HELP");

		}
	}
	

}
