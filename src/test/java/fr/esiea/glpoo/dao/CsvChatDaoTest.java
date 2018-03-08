package fr.esiea.glpoo.dao;

import org.junit.Before;

import fr.esiea.glpoo.dao.CsvChatDao;

public class CsvChatDaoTest extends AbstractChatDaoTest {

	@Before
	public void doBefore() {
		dao = new CsvChatDao();
	}
	
}
