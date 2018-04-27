/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Criteria class.
 */
public class CriteriaTest {
	/**
	 * Instance of testing class.
	 */
	private Criteria criteria;

	/**
	 * Pretest initialization.
	 */
	@Before
	@Test
	public void preInitialization() {
		this.criteria = new Criteria();
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.Criteria#checkCriteria(java.lang.String)} with false.
	 */
	@Test
	public void testCheckCriteriaFalse() {
		Assert.assertFalse("Method checkCriteria() failed.", this.criteria.checkCriteria("Qwerty1"));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.Criteria#checkCriteria(java.lang.String)} with true.
	 */
	@Test
	public void testCheckCriteriaTrue() {
		Assert.assertTrue("Method checkCriteria() failed.", this.criteria.checkCriteria("QWErty123"));
	}
}
