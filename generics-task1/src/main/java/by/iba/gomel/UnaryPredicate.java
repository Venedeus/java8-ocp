/**
 *
 */
package by.iba.gomel;

/**
 * This functional interface to be used in a condition.
 */
@FunctionalInterface
public interface UnaryPredicate<T> {
	/**
	 * Method to be used as a predicate.
	 *
	 * @param elem
	 *            - element to be checked.
	 * @return true - if input element complies with conditions false - if not.
	 */
	public boolean checkPredicate(final T elem);
}
