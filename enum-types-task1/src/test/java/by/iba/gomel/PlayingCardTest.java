/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing PlayingCard class.
 */
public class PlayingCardTest {
	/**
	 * Reference to the instance of the testing class.
	 */
	private PlayingCard card;

	/**
	 * Pre-test initialization.
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.card = new PlayingCard(Rank.ACE, Suit.HEARTS);
	}

	/**
	 * Test method for {@link by.iba.gomel.PlayingCard#getRank()}.
	 */
	@Test
	public void testGetRank() {
		Assert.assertEquals("Method getRank() failed.", Rank.ACE, this.card.getRank());
	}

	/**
	 * Test method for {@link by.iba.gomel.PlayingCard#getSuit()}.
	 */
	@Test
	public void testGetSuit() {
		Assert.assertEquals("Method getSuit() failed.", Suit.HEARTS, this.card.getSuit());
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.PlayingCard#PlayingCard(by.iba.gomel.Rank, by.iba.gomel.Suit)}.
	 */
	@Test
	public void testPlayingCard() {
		Assert.assertNotNull("Instance creation failed.", this.card);
	}

}
