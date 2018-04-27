/**
 *
 */
package by.iba.gomel;

/**
 * This class is for counting custom function.
 */
public final class Trigonom {
	/**
	 * This is private constructor.
	 */
	private Trigonom() {

	}

	/**
	 * This static method counts function with trigonometric elements.
	 *
	 * @param x
	 *            - the first input data (in radians).
	 * @param y
	 *            - the second input data (in radians).
	 * @return the result of counting. *
	 */
	public static double countFunction(final double x, final double y) {
		return Math.pow(1 - Math.tan(x), Trigonom.ctg(x)) + Math.cos(x - y);

	}

	/**
	 * This private static method is for counting cotangent.
	 *
	 * @param x
	 *            - input angel (in radians).
	 * @return cotangent.
	 */
	private static double ctg(final double x) {
		return Math.cos(x) / Math.sin(x);
	}
}
