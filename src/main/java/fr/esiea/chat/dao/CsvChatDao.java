package fr.esiea.chat.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.esiea.chat.domain.CatRace;
import fr.esiea.chat.domain.Chat;
import fr.esiea.chat.domain.Genre;
import fr.esiea.chat.domain.SimpleChat;

public class CsvChatDao implements ChatDao {

	private boolean isFirst;

	private List<String> lectureFichier() {
		final String path = "C:\\Users\\thiba\\eclipse-workspace\\chat\\src\\test\\resources\\chats.csv";
		final List<String> lines = new ArrayList<>();
		Scanner sc;
		try {
			sc = new Scanner(new FileReader(path));
			
			// TODO: lecture du fichier
			while(sc.hasNextLine()) {
				lines.add(sc.nextLine());
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lines;
	}

	private Chat lineToChat(final String line) {

		final String[] data;
		final String separator = ",";
		final String ColorSeparator = "-";

		// TODO: remplir les champs
		data = line.split(separator);
		String name = data[0];
		int age = Integer.parseInt(data[1]);
		String[] colors = data[2].split(ColorSeparator);
		Genre gender = Genre.valueOfByCode(data[3]);
		CatRace race = CatRace.valueOfByCode(data[4]);
		int nbPaws = Integer.parseInt(data[5]);
		
		final Chat chat = new SimpleChat(name, age, colors, gender, race, nbPaws);

		return chat;
	}

	@Override
	public List<Chat> findAllCats() {
		final List<Chat> chats = new ArrayList();
		boolean isFirst = true;

		// fichier > tab de ligne
		final List<String> lines = lectureFichier();

		// ligne > chat
		for (final String line : lines) {
			// lignes vides ou de commentaire
			if (line.trim().isEmpty() || line.startsWith("#")) {
				continue;
			}
			// Titres
			if (isFirst) {
				isFirst = false;
				continue;
			}

			final Chat chat = lineToChat(line);
			chats.add(chat);
		}

		// return
		return chats;
	}

}
