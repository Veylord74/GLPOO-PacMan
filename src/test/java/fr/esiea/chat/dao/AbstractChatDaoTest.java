package fr.esiea.chat.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.esiea.chat.domain.Chat;
import fr.esiea.chat.domain.Genre;

public abstract class AbstractChatDaoTest {

	protected CsvChatDao dao;

	@Test
	public void testFindAllCats_With4Items() {
		// Arrange
		final int expectedNbOfCats = 4;

		// Act
		final List<Chat> chats = dao.findAllCats();
		final int nb = chats.size();

		// Assert
		Assert.assertEquals(expectedNbOfCats, nb);
	}

	@Test
	public void testFindAllCats_WithFirstIsNotCute() {
		// Arrange
		final boolean expectedCuteness = false;

		// Act
		final List<Chat> chats = dao.findAllCats();
		final Chat first = chats.get(0);
		final boolean cute = first.getRace().isCute();

		// Assert
		Assert.assertEquals(expectedCuteness, cute);
	}

	@Test
	public void testFindAllCats_WithFourthIsFemale() {
		// Arrange
		final Genre expectedGenre = Genre.FEMALE;

		// Act
		final List<Chat> chats = dao.findAllCats();
		final Chat fourth = chats.get(3);
		final Genre fourthGenre = fourth.getGenre();

		// Assert
		Assert.assertEquals(expectedGenre, fourthGenre);
	}

	@Test
	public void testFindAllCats_WithThirdNameIsBerlioz() {
		// Arrange
		final String expectedName = "Berlioz";

		// Act
		final List<Chat> chats = dao.findAllCats();
		final Chat third = chats.get(2);
		final String thirdName = third.getName();

		// Assert
		Assert.assertEquals(expectedName, thirdName);
	}
}
