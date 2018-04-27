/**
 *
 */
package by.iba.gomel;

/**
 * This class contains password criteria.
 */
public final class Criteria {
	/**
	 * Integer constant for count of digits.
	 */
	private static final int DIGITS_COUNT = 3;
	/**
	 * Integer constant for count of uppercase-characters.
	 */
	private static final int UPPERCASE_CHAR = 2;
	/**
	 * Integer constant for count of lowercase-characters.
	 */
	private static final int LOWERCASE_CHAR = 3;

	/**
	 * This method is for checking a conformity input string to criteria.
	 *
	 * @param input
	 *            - input string for checking.
	 * @return true - if input string matches to criteria, false - if not.
	 *
	 */
	public boolean checkCriteria(final String input) {
		boolean result = false;
		int digits = 0;
		int uppers = 0;
		int lowers = 0;

		for (final char ch : input.toCharArray()) {
			if (Character.isDigit(ch)) {
				digits++;
			}

			if (Character.isUpperCase(ch)) {
				uppers++;
			}

			if (Character.isLowerCase(ch)) {
				lowers++;
			}
		}

		if ((digits >= Criteria.DIGITS_COUNT) && (uppers >= Criteria.UPPERCASE_CHAR)
				&& (lowers >= Criteria.LOWERCASE_CHAR)) {
			result = true;
		}

		return result;
	}
}