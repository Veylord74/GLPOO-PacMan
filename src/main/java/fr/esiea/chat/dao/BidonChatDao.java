package fr.esiea.chat.dao;

import java.util.ArrayList;
import java.util.List;

import fr.esiea.chat.domain.CatRace;
import fr.esiea.chat.domain.Chat;
import fr.esiea.chat.domain.Genre;
import fr.esiea.chat.domain.SimpleChat;

public class BidonChatDao implements ChatDao {
	
	@Override
	public List<Chat> findAllCats() {
		final List<Chat> cats = new ArrayList<>();
		
		final String[] leChatCouleurs = {"rose", "bleu"};
		final Chat leChat = new SimpleChat(
				"leChat", 
				6, 
				leChatCouleurs, 
				Genre.MALE, 
				CatRace.DEVONREX, 
				4);
		cats.add(leChat);
		
		final String[] tonyCouleurs = {"noir", "gris"};
		final Chat tony = new SimpleChat(
				"tony", 
				12, 
				tonyCouleurs, 
				Genre.MALE, 
				CatRace.RAGDOLL,
				4);
		cats.add(tony);
		
		final String[] berliozCouleurs = {"roux"};
		final Chat berlioz = new SimpleChat(
				"berlioz", 
				3, 
				berliozCouleurs, 
				Genre.MALE, 
				CatRace.SHORTHAIR,
				4);
		cats.add(berlioz);
		
		final String[] duchesseCouleurs = {"blanc"};
		final Chat duchesse = new SimpleChat(
				"duchesse", 
				8, 
				duchesseCouleurs, 
				Genre.FEMALE, 
				CatRace.CHARTREUX,
				4);
		cats.add(duchesse);
		
		return cats;
	}
}
