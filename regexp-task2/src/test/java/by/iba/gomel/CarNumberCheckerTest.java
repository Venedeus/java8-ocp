/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing carNumberChecker class.
 */
public class CarNumberCheckerTest {
	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with incorrect input number.
	 */
	@Test
	public void testCheckCarNumberIncorrectInputIndex1() {
		Assert.assertFalse("Method carNumberchecker() failed on incorrect input number.",
				CarNumberChecker.checkCarNumber("3335 AIB-3"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with incorrect input number.
	 */
	@Test
	public void testCheckCarNumberIncorrectInputIndex2() {
		Assert.assertFalse("Method carNumberchecker() failed on incorrect input number.",
				CarNumberChecker.checkCarNumber("3335 iB-3"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with incorrect input number.
	 */
	@Test
	public void testCheckCarNumberIncorrectInputNumbers1() {
		Assert.assertFalse("Method carNumberchecker() failed on incorrect input number.",
				CarNumberChecker.checkCarNumber("33351 IB-3"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with incorrect input number.
	 */
	@Test
	public void testCheckCarNumberIncorrectInputNumbers2() {
		Assert.assertFalse("Method carNumberchecker() failed on incorrect input number.",
				CarNumberChecker.checkCarNumber("33a35 IB-3"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with incorrect input number.
	 */
	@Test
	public void testCheckCarNumberIncorrectInputRegion1() {
		Assert.assertFalse("Method carNumberchecker() failed on incorrect input number.",
				CarNumberChecker.checkCarNumber("3335 AIB-9"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with incorrect input number.
	 */
	@Test
	public void testCheckCarNumberIncorrectInputRegion2() {
		Assert.assertFalse("Method carNumberchecker() failed on incorrect input number.",
				CarNumberChecker.checkCarNumber("3335 IB-a"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with null input.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCheckCarNumberNullInput() {
		Assert.assertFalse("Method carNumberchecker() failed on incorrect input number.",
				CarNumberChecker.checkCarNumber(null));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CarNumberChecker#checkCarNumber(java.lang.String)}
	 * with right input number.
	 */
	@Test
	public void testCheckCarNumberRightInput() {
		Assert.assertTrue("Method carNumberchecker() failed on right input number.",
				CarNumberChecker.checkCarNumber("3335 IB-3"));
	}
}
