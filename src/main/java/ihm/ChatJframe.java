package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import com.github.javafaker.Faker;

import fr.esiea.glpoo.domain.CatRace;
import fr.esiea.glpoo.domain.Genre;
import fr.esiea.glpoo.domain.SimpleChat;

public class ChatJframe extends JFrame {

	private static final Logger log = Logger.getLogger(Main.class);
	ChatModel model = new ChatModel();
	final JTable tableau = new JTable(model);

	public ChatJframe() {
		setTitle("Cat Store");
		setPreferredSize(new Dimension(600, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		tableau.setDefaultRenderer(Genre.class, new GenreRenderer());
		final JScrollPane scroll = new JScrollPane(tableau);

		// getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
		getContentPane().add(scroll, BorderLayout.CENTER);

		Color blue = new Color(17, 44, 80);
		final JPanel barreBoutons = new JPanel();
		barreBoutons.setBackground(blue);
		getContentPane().add(barreBoutons, BorderLayout.SOUTH);

		final JButton bouttonAjouter = new JButton(new AjouterLigneAction());
		barreBoutons.add(bouttonAjouter);

		final JButton bouttonSupprimer = new JButton(new SupprimerLigneAction());
		barreBoutons.add(bouttonSupprimer);

		pack();
	}

	private class AjouterLigneAction extends AbstractAction {

		public AjouterLigneAction() {
			super("Ajouter");
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			log.debug("ici AjouterLigneAction");
			
			Faker fake = new Faker();
			
			String name = fake.cat().name();
			
			
			final String[] couleurs = { "roux" };
			final SimpleChat chat = new SimpleChat(name, 12, couleurs, Genre.MALE, CatRace.RAGDOLL, 4);
			model.ajouterChat(chat);
		}

	}

	private class SupprimerLigneAction extends AbstractAction {

		public SupprimerLigneAction() {
			super("Supprimer");
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			log.debug("ici SupprimerLigneAction");

			final int[] positions = tableau.getSelectedRows();

			for (int i = positions.length - 1; 0 <= i; i--) {
				model.supprimerChat(positions[i]);
			}
		}

	}

}
