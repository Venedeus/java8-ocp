/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This test is for testing PasswordChecker class.
 */
public class PasswordCheckerTest {
	/**
	 * Instance of the testing class.
	 */
	private PasswordChecker checker;

	/**
	 * Pretest initialization.
	 */
	@Before
	@Test
	public void preInitialization() {
		this.checker = new PasswordChecker(new Criteria());
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.PasswordChecker#checkPassword(java.lang.String)} with
	 * false.
	 */
	@Test
	public void testCheckPasswordFalse() {
		Assert.assertFalse("Method checkPassword() failed.", this.checker.checkPassword("Qwerty1"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.PasswordChecker#checkPassword(java.lang.String)} with
	 * true.
	 */
	@Test
	public void testCheckPasswordTrue() {
		Assert.assertTrue("Method checkPassword() failed.", this.checker.checkPassword("QWErty123"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.PasswordChecker#PasswordChecker(by.iba.gomel.Criteria)}.
	 */
	@Test
	public void testPasswordChecker() {
		Assert.assertNotNull("Instance creation failed.", new PasswordChecker(new Criteria()));
	}
}