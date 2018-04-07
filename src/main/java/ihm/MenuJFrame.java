package ihm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.apache.log4j.Logger;

import fr.esiea.formes.AffichageForme;
import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.dao.TirageDao;
import fr.esiea.glpoo.domain.Tirage;

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
			
			// Button pannel
			final JPanel menuButton = new JPanel();
			Color black = new Color(0, 0, 0);
			menuButton.setBackground(black);
			getContentPane().add(menuButton, BorderLayout.SOUTH);
			
			// Images for the buttons backgrounds
			Image img = Toolkit.getDefaultToolkit().getImage("src/main/resources/bkgrndBtn.png");
			
			//buttons
			final JButton bouttonPlay = new JButton(new PlayAction());
			bouttonPlay.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AffichageForme.displayRandomPoly();

					
				}
			});
			bouttonPlay.setIcon(new ImageIcon(img));
			bouttonPlay.setBackground(null);
			bouttonPlay.setBorder(null);
			menuButton.add(bouttonPlay);

			final JButton bouttonHelp = new JButton(new HelpAction());
			bouttonHelp.setIcon(new ImageIcon(img));
			bouttonHelp.setBackground(null);
			bouttonHelp.setBorder(null);
			menuButton.add(bouttonHelp);
			
			final JButton bouttonResults = new JButton(new ResultsAction());
			bouttonResults.setIcon(new ImageIcon(img));
			bouttonResults.setBackground(null);
			bouttonResults.setBorder(null);
			menuButton.add(bouttonResults);
			
			
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
	
public class ResultsAction extends AbstractAction{
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		log.info("Action performed - LOTTERY RESULTS");

		log.debug("Tirage Euro-million:");
		
		final TirageDao dao = new CsvTirageDao();
		final List<Tirage> tirages = dao.findAllTirages();
		
		for(final Tirage tirage : tirages) {
			int[] boules = tirage.getBoules();
			int[] etoiles = tirage.getEtoiles();
			String boule = "";
			String etoile = "";
			for(int i = 0; i<5; i++) {
				boule += boules[i] + " ";
			}
			for(int i = 0; i<2; i++) {
				etoile += etoiles[i] + " ";
			}
			log.debug("* Tirage du " + tirage.getDate() + ": - Boules: " + boule + " - Etoiles: " + etoile);
		}
		
		//IHM
		final TirageJframe chatJFrame = new TirageJframe();
		chatJFrame.setVisible(true);
		

	}

	public ResultsAction() {

		super("LOTTERY RESULTS");

	}
}

}
