/**
 *
 */
package by.iba.gomel;

/**
 * This class is for transforming input integer from range [MIN;MAX] into
 * binary/octal/hexidecimal notation.
 */
public final class IntTransformer {
	/**
	 * String constant for input integer with formatting.
	 */
	private static final String INPUT = "Input int value:\t%d%n";
	/**
	 * String constant for binary notation with formatting.
	 */
	private static final String BINARY = "Binary notification:\t%s%n";
	/**
	 * String constant for octal notation with formatting.
	 */
	private static final String OCTAL = "Octal notification:\t%o%n";
	/**
	 * String constant for hexidecimal notation with formatting.
	 */
	private static final String HEXIDECIMAL = "Hex notification:\t%X";
	/**
	 * Integer constant for min-limit of input integer.
	 */
	private static final int MIN = 1;
	/**
	 * Integer constant for max-limit of input integer.
	 */
	private static final int MAX = 31;

	/**
	 * Private constructor.
	 */
	private IntTransformer() {

	}

	/**
	 * This method is for transforming input integer from range [MIN;MAX] into
	 * binary/octal/hexidecimal notation. If input integer is out of range -
	 * IllegalArgumentException is thrown.
	 *
	 * @param input
	 *            - input integer to be transformed.
	 * @return string result of transformation.
	 */
	public static String transform(final int input) {
		if (IntTransformer.checkInput(input)) {
			final StringBuilder result = new StringBuilder(String.format(IntTransformer.INPUT, input));
			result.append(String.format(IntTransformer.BINARY, Integer.toBinaryString(input)));
			result.append(String.format(IntTransformer.OCTAL, input));
			result.append(String.format(IntTransformer.HEXIDECIMAL, input));

			return result.toString();
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * This private method is for checking whether input integer is comprised
	 * into range [MIN; MAX].
	 *
	 * @param input
	 *            - input integer to be checked.
	 * @return true - if input integer is in range [MIN; MAX], false if not.
	 */
	private static boolean checkInput(final int input) {
		return ((input >= IntTransformer.MIN) && (input <= IntTransformer.MAX)) ? true : false;
	}
}
