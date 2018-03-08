package fr.esiea.glpoo.dao;

import java.util.List;

import fr.esiea.glpoo.domain.Chat;

public interface ChatDao {

	List<Chat> findAllCats();
}
