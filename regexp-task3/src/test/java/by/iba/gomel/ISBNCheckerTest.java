/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing ISBNChecker.
 */
public class ISBNCheckerTest {
	/**
	 * Test method for
	 * {@link by.iba.gomel.ISBNChecker#checkISBN(java.lang.String)} with
	 * inconvenient input ISBN element.
	 */
	@Test
	public void testCheckISBNInvalidInconvenient() {
		Assert.assertFalse("Method checkISBN() failed.", ISBNChecker.checkISBN("978-10-306-40615-7"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.ISBNChecker#checkISBN(java.lang.String)} with invalid
	 * length.
	 */
	@Test
	public void testCheckISBNInvalidLength() {
		Assert.assertFalse("Method checkISBN() failed.", ISBNChecker.checkISBN("978 0 306 4615 7"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.ISBNChecker#checkISBN(java.lang.String)} with out of
	 * range input ISBN element.
	 */
	@Test
	public void testCheckISBNInvalidOutOfRange1() {
		Assert.assertFalse("Method checkISBN() failed.", ISBNChecker.checkISBN("970-0-306-40615-7"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.ISBNChecker#checkISBN(java.lang.String)} with out of
	 * range input ISBN element.
	 */
	@Test
	public void testCheckISBNInvalidOutOfRange2() {
		Assert.assertFalse("Method checkISBN() failed.", ISBNChecker.checkISBN("978-9-306-40615-7"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.ISBNChecker#checkISBN(java.lang.String)} with invalid
	 * symbols in ISBN.
	 */
	@Test
	public void testCheckISBNInvalidSymbol() {
		Assert.assertFalse("Method checkISBN() failed.", ISBNChecker.checkISBN("978-0-3z6-40615-7"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.ISBNChecker#checkISBN(java.lang.String)} with valid
	 * input.
	 */
	@Test
	public void testCheckISBNValid() {
		Assert.assertTrue("Method checkISBN() failed.", ISBNChecker.checkISBN("978-0-306-40615-7"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.ISBNChecker#checkISBN(java.lang.String)} with valid
	 * input with space as a separator.
	 */
	@Test
	public void testCheckISBNValidSpace() {
		Assert.assertTrue("Method checkISBN() failed.", ISBNChecker.checkISBN("978 0 306 40615 7"));
	}
}
