/**
 *
 */
package by.iba.gomel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class checks input string to analyze names. If there is null parameter
 * of string consists of one word - IllegalArgumentException is thrown, whether
 * input string contains more than one non-equal members.
 */
public final class NameChecker {
	/**
	 * Regex for input string.
	 */
	private static final String REGEX = "([a-zA-Z]+)\\s([a-zA-Z]+)";
	/**
	 * Regex for equal names.
	 */
	private static final String REGEX_EQUALS = "([a-zA-Z]+)\\s\\1";

	/**
	 * Private constructor.
	 */
	private NameChecker() {
	}

	/**
	 * This method checks whether input string contains more than one non-equal
	 * members. If there is null parameter of string consists of one word -
	 * IllegalArgumentException is thrown.
	 *
	 * @param name
	 *            - input string to be analyzed.
	 * @return true - if names match; false - if not.
	 */
	public static Boolean checkName(final String name) {
		if ((name == null) || !Pattern.matches(NameChecker.REGEX, name)) {
			throw new IllegalArgumentException();
		}

		final Matcher matcher = Pattern.compile(NameChecker.REGEX).matcher(name);

		return (matcher.groupCount() > 1) && !Pattern.matches(NameChecker.REGEX_EQUALS, name);
	}
}
