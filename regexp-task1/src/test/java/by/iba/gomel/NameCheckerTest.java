/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing NameChecker class.
 */
public class NameCheckerTest {
	/**
	 * Test method for
	 * {@link by.iba.gomel.NameChecker#checkName(java.lang.String)} with
	 * full-name input.
	 */
	@Test
	public void testCheckNameFullName() {
		Assert.assertTrue("Method checkName() failed with full-name input but different-length names.",
				NameChecker.checkName("Evgeniy Shvetsov"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.NameChecker#checkName(java.lang.String)} with
	 * full-name input and equal members.
	 */
	@Test
	public void testCheckNameFullNameEqualMembers() {
		Assert.assertFalse("Method checkName() failed with full-name input and equal-length names.",
				NameChecker.checkName("Evgeniy Evgeniy"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.NameChecker#checkName(java.lang.String)} with input
	 * null.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCheckNameNull() {
		Assert.assertTrue("Method checkName() failed with input null.", NameChecker.checkName(null));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.NameChecker#checkName(java.lang.String)} with
	 * single-name input.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCheckNameSingleName() {
		Assert.assertTrue("Method checkName() failed with single-name input.", NameChecker.checkName("Evgeniy"));
	}
}
