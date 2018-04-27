/**
 *
 */
package by.iba.gomel;

import java.util.regex.Pattern;

/**
 * This class is for ISBN checking.
 */
public class ISBNChecker {
	/**
	 * Regex of ISBN.
	 */
	private static final String REGEX = "97(((8(-|\\s)(([0-7&&[^6]])|(6(([0-1]\\d)|(2[0-1])))|((8\\d)|(9[0-4]))|(9(([5-8]\\d)|9((2[6-9])|([3-8]\\d)|(9(([0-6]\\d)|(7[0-6]))))))))|(9-1[0-2]))(-|\\s)\\d+(-|\\s)\\d+(-|\\s)[a-zA-Z0-9])";
	/**
	 * Length of ISBN [amount_of_code_elements + amount_of_separators]
	 */
	private static final int ISBN_LENGTH = 13 + 4;

	/**
	 * Private constructor.
	 */
	private ISBNChecker() {

	}

	/**
	 * This method checks ISBN according to the length of given code and regex.
	 *
	 * @param isbn
	 *            - book code to be checked.
	 * @return true - if ISBN is valid, false - if not.
	 */
	public static boolean checkISBN(final String isbn) {
		return (isbn.length() == ISBNChecker.ISBN_LENGTH) && Pattern.compile(ISBNChecker.REGEX).matcher(isbn).matches();
	}
}
