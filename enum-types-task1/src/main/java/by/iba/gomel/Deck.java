/**
 *
 */
package by.iba.gomel;

import java.util.HashSet;
import java.util.Set;

/**
 * This class realizes a full deck of playing cards with [RUSSIAN_SET = 36
 * cards; FRENCH_SET = 52 cards].
 */
public class Deck {
	/**
	 * Amount of cards in russian set.
	 */
	private static final int RUSSIAN_SET = 36;
	/**
	 * Amount of cards in french set.
	 */
	private static final int FRENCH_SET = 52;
	/**
	 * Start position of russian set.
	 */
	private static final int START_RUSSIAN_SET = 4;

	/**
	 * Deck of playing cards.
	 */
	Set<PlayingCard> setOfCards;

	/**
	 * Constructor to define a set of cards.
	 *
	 * @param size
	 *            - size of a deck [RUSSIAN_SET = 36 cards; FRENCH_SET = 52
	 *            cards].
	 */
	public Deck(final int size) {
		if ((size != Deck.RUSSIAN_SET) && (size != Deck.FRENCH_SET)) {
			throw new IllegalArgumentException();
		}

		this.setOfCards = new HashSet<>();
		final int startPos = size == Deck.RUSSIAN_SET ? Deck.START_RUSSIAN_SET : 0;

		PlayingCard card = null;

		for (int i = startPos; i < Rank.values().length; i++) {
			for (final Suit suit : Suit.values()) {
				card = new PlayingCard(Rank.values()[i], suit);

				assert card != null;

				this.setOfCards.add(card);
			}
		}
	}

	/**
	 * This method returns a deck of cards.
	 *
	 * @return a deck of cards.
	 */
	public Set<PlayingCard> getDeck() {
		return this.setOfCards;
	}

	/**
	 * This method returns amount of playing cards in a deck.
	 *
	 * @return amount of playing cards in a deck.
	 */
	public int getDeckSize() {
		return this.setOfCards.size();
	}
}
