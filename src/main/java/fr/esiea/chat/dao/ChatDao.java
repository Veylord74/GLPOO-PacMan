package fr.esiea.chat.dao;

import java.util.List;
import fr.esiea.chat.domain.Chat;

public interface ChatDao {

	List<Chat> findAllCats();
}
