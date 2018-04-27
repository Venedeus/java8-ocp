/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing SumOfIntegers class.
 */
public class SumOfIntegersTest {
	/**
	 * Test method for
	 * {@link by.iba.gomel.SumOfIntegers#countSumOfIntegers(int)}.
	 */
	@Test
	public void testCountSumOfIntegers() {
		Assert.assertEquals("Method ccountSumOfIntegers() failed.", 15, SumOfIntegers.countSumOfIntegers(5));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.SumOfIntegers#countSumOfIntegers(int)} with negative
	 * limit.
	 */
	@Test(expected = AssertionError.class)
	public void testCountSumOfIntegersNegative() {
		Assert.assertEquals("Method ccountSumOfIntegers() failed.", 15, SumOfIntegers.countSumOfIntegers(-5));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.SumOfIntegers#countSumOfIntegers(int)} with zero
	 * limit.
	 */
	@Test(expected = AssertionError.class)
	public void testCountSumOfIntegersZero() {
		Assert.assertEquals("Method ccountSumOfIntegers() failed.", 15, SumOfIntegers.countSumOfIntegers(0));
	}
}
