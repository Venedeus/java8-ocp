/**
 *
 */
package by.iba.gomel;

/**
 * This class realizes a playing card.
 */
public class PlayingCard {
	/**
	 * Rank of a card.
	 */
	private final Rank rank;
	/**
	 * Suit of a card.
	 */
	private final Suit suit;

	/**
	 * Custom constructor to create a deck.
	 * 
	 * @param rank
	 *            - rank of a card.
	 * @param suit
	 *            - suit of a card.
	 */
	public PlayingCard(final Rank rank, final Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	/***
	 * Getter for rank of a card.
	 *
	 * @return rank of a card.
	 */
	public Rank getRank() {
		return this.rank;
	}

	/**
	 * Getter for suit of a card.
	 *
	 * @return suit of a card.
	 */
	public Suit getSuit() {
		return this.suit;
	}
}
