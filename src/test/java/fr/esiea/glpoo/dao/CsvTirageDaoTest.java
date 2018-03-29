package fr.esiea.glpoo.dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.esiea.glpoo.dao.CsvTirageDao;
import fr.esiea.glpoo.domain.Tirage;

public class CsvTirageDaoTest{

	protected CsvTirageDao dao = new CsvTirageDao();
	
	@Test
	public void testFindAllTirages_With151Items() {
		// Arrange
		final int expectedNbOfTirages = 151;

		// Act
		final List<Tirage> tirages = dao.findAllTirages();
		final int nb = tirages.size();

		// Assert
		Assert.assertEquals(expectedNbOfTirages, nb);
	}
	
	@Test
	public void testFindAllTirages_WithFirstDate() {
		// Arrange
		final LocalDate expectedDate = LocalDate.of(2016, Month.SEPTEMBER, 27);

		// Act
		final List<Tirage> tirages = dao.findAllTirages();
		final Tirage first = tirages.get(0);
		final LocalDate date = first.getDate();

		// Assert
		Assert.assertEquals(expectedDate, date);
	}
	
	@Test
	public void testFindAllTirages_With48thBoule4() {
		// Arrange
		int expectedBoule = 47;

		// Act
		final List<Tirage> tirages = dao.findAllTirages();
		final Tirage fourtySeventh = tirages.get(47);
		final int[] boules = fourtySeventh.getBoules();

		// Assert
		Assert.assertEquals(expectedBoule, boules[3]);
	}
	
	@Test
	public void testFindAllTirages_With74thEtoile1() {
		// Arrange
		int expectedEtoile = 11;

		// Act
		final List<Tirage> tirages = dao.findAllTirages();
		final Tirage seventyfourth = tirages.get(73);
		final int[] etoiles = seventyfourth.getEtoiles();

		// Assert
		Assert.assertEquals(expectedEtoile, etoiles[0]);
	}
	
	@Test
	public void testFindAllTirages_With22ndHave5Boules() {
		// Arrange
		int expectedNbBoules = 5;

		// Act
		final List<Tirage> tirages = dao.findAllTirages();
		final Tirage twentysecond = tirages.get(21);
		final int[] boules = twentysecond.getBoules();
		final int nbBoules = boules.length;

		// Assert
		Assert.assertEquals(expectedNbBoules, nbBoules);
	}
	
	@Test
	public void testFindAllTirages_With137thHave2Etoiles() {
		// Arrange
		int expectedNbEtoiles = 2;

		// Act
		final List<Tirage> tirages = dao.findAllTirages();
		final Tirage hundredAndThirtySeventh = tirages.get(136);
		final int[] etoiles = hundredAndThirtySeventh.getEtoiles();
		final int nbEtoiles = etoiles.length;

		// Assert
		Assert.assertEquals(expectedNbEtoiles, nbEtoiles);
	}
	
	@Test
	public void testFindRandomTirage_With5Boules() {
		// Arrange
		int expectedNbBoules = 5;

		// Act
		final Tirage tirage = dao.findRandomTirage();
		final int[] boules = tirage.getBoules();
		final int nbBoules = boules.length;

		// Assert
		Assert.assertEquals(expectedNbBoules, nbBoules);
	}
	
	@Test
	public void testFindRandomTirage_With2Etoiles() {
		// Arrange
		int expectedNbEtoiles = 2;

		// Act
		final Tirage tirage = dao.findRandomTirage();
		final int[] etoiles = tirage.getEtoiles();
		final int nbEtoiles = etoiles.length;

		// Assert
		Assert.assertEquals(expectedNbEtoiles, nbEtoiles);
	}
	
}
