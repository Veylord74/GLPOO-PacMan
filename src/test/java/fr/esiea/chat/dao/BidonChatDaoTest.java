package fr.esiea.chat.dao;

import org.junit.Before;

public class BidonChatDaoTest extends AbstractChatDaoTest {
	
	@Before
	public void doBefore() {
		dao = new CsvChatDao();
	}
	
}
