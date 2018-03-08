package fr.esiea.chat.dao;

import org.junit.Before;

public class CsvChatDaoTest extends AbstractChatDaoTest {

	@Before
	public void doBefore() {
		dao = new CsvChatDao();
	}
	
}
