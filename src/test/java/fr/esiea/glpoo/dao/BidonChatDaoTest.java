package fr.esiea.glpoo.dao;

import org.junit.Before;

import fr.esiea.glpoo.dao.CsvTirageDao;

public class BidonChatDaoTest extends AbstractChatDaoTest {
	
	@Before
	public void doBefore() {
		dao = new CsvTirageDao();
	}
	
}
