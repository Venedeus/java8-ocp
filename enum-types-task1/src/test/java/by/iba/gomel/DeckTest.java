/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing Deck class.
 */
public class DeckTest {
	/**
	 * Reference to the instance of the testing class.
	 */
	private Deck deck;

	/**
	 * Pre-test initialization.
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.deck = new Deck(36);
	}

	/**
	 * Test method for {@link by.iba.gomel.Deck#Deck()}.
	 */
	@Test
	public void testDeck() {
		Assert.assertNotNull("Instance creation failed.", this.deck);
	}

	/**
	 * Test method for {@link by.iba.gomel.Deck#getDeckSize()} with French set.
	 */
	@Test
	public void testDeckFrenchSet() {
		Assert.assertEquals("Deck forming failed.", 52, new Deck(52).getDeckSize());
	}

	/**
	 * Test method for {@link by.iba.gomel.Deck#getDeckSize()} with argument out
	 * of range.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testDeckIllegalArgument() {
		Assert.assertEquals("Deck forming failed.", 50, new Deck(50).getDeckSize());
	}

	/**
	 * Test method for {@link by.iba.gomel.Deck#getDeckSize()} with Russian set.
	 */
	@Test
	public void testDeckRussianSet() {
		Assert.assertEquals("Deck forming failed.", 36, this.deck.getDeckSize());
	}

}
