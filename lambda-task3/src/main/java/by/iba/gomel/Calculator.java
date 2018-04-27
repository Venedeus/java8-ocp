/**
 *
 */
package by.iba.gomel;

import java.util.function.BiFunction;

/**
 * This class is for making some calculation.
 */
public class Calculator {
	/**
	 * Private constructor.
	 */
	private Calculator() {

	}

	/**
	 * This method makes some calculation.
	 * 
	 * @param func
	 *            - function to be used.
	 * @param d1
	 *            - the first argument.
	 * @param d2
	 *            - the second argument.
	 * @return result of calculation.
	 */
	public static double calculate(final BiFunction<Double, Double, Double> func, final Double d1, final Double d2) {
		return func.apply(d1, d2);
	}
}
