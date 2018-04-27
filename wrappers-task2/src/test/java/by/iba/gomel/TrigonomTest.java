/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing Trigonom class.
 */
public class TrigonomTest {

	/**
	 * Test method for
	 * {@link by.iba.gomel.Trigonom#countFunction(double, double)}.
	 */
	@Test
	public void testCountFunction() {
		Assert.assertEquals("Method countFunction() failed.", -0.707, Trigonom.countFunction(0.25 * Math.PI, Math.PI),
				0.1);
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.Trigonom#countFunction(double, double)} with NaN.
	 */
	@Test
	public void testCountFunctionNaN() {
		Assert.assertEquals("Method countFunction() failed with NaN.", Double.NaN,
				Trigonom.countFunction(0.5 * Math.PI, Math.PI), 0.1);
	}
}
