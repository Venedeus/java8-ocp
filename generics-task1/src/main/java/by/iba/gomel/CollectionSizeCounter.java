/**
 *
 */
package by.iba.gomel;

import java.util.Collection;

/**
 * This class counts an amount of elements in a given collection according to
 * predicate.
 */
public class CollectionSizeCounter {
	/**
	 * Private constructor.
	 */
	private CollectionSizeCounter() {

	}

	/**
	 * This method counts elements according to the predicate.
	 *
	 * @param elements
	 *            - collection to be analyzed.
	 * @param tester
	 *            - predicate to use in a condition.
	 * @return amount of elements.
	 */
	public static <T> int countSize(final Collection<T> elements, final UnaryPredicate<T> tester) {
		int count = 0;
		for (final T elem : elements) {
			if (tester.checkPredicate(elem)) {
				count++;
			}
		}
		return count;
	}
}
