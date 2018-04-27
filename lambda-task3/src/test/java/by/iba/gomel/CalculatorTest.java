/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing Calculator class.
 */
public class CalculatorTest {
	/**
	 * Test method for
	 * {@link by.iba.gomel.Calculator#calculate(java.util.function.BiFunction, java.lang.Double, java.lang.Double)}.
	 */
	@Test
	public void testCalculate() {
		Assert.assertEquals("Method calculate() failed.", 8.0, Calculator.calculate(Math::pow, 2d, 3d), 0.1);
	}

}
