/**
 *
 */
package by.iba.gomel;

import java.util.regex.Pattern;

/**
 * This class is for checking car number according to number format.
 */
public final class CarNumberChecker {
	private static final String REGEX_FORMAT = "[0-9]{4}\\s[A-Z]{2}-[0-7]{1}";

	private CarNumberChecker() {

	}

	public static boolean checkCarNumber(final String number) {
		if (number == null) {
			throw new IllegalArgumentException();
		}

		return Pattern.compile(CarNumberChecker.REGEX_FORMAT).matcher(number).matches();
	}
}
