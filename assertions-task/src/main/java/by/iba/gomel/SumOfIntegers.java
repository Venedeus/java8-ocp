/**
 *
 */
package by.iba.gomel;

/**
 * This class is for counting a sum of integers including inputLimit.
 */
public class SumOfIntegers {
	/**
	 * Private constructor.
	 */
	private SumOfIntegers() {

	}

	/**
	 * This method counts sum of integers including inputLimit.
	 * 
	 * @param inputLimit
	 *            - limit of items.
	 * @return sum of integers.
	 */
	public static int countSumOfIntegers(final int inputLimit) {
		final int limit = inputLimit;

		assert limit > 0;

		int result = 0;

		for (int i = 0; i <= limit; i++) {
			result += i;
		}

		assert result > 0;

		return result;
	}
}
