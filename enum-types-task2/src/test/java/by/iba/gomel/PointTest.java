/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Point class.
 */
public class PointTest {
	/**
	 * Reference to the instance of testing class.
	 */
	Point point;

	/**
	 * Pre-test initialization.
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.point = new Point();
	}

	/**
	 * Test method for {@link by.iba.gomel.Point#getX()}.
	 */
	@Test
	public void testGetX() {
		final Point testPoint = new Point();

		Assert.assertEquals("Method getX() failed.", 0, testPoint.getX());
	}

	/**
	 * Test method for {@link by.iba.gomel.Point#getY()}.
	 */
	@Test
	public void testGetY() {
		final Point testPoint = new Point();

		Assert.assertEquals("Method getY() failed.", 0, testPoint.getY());
	}

	/**
	 * Test method for {@link by.iba.gomel.Point#Point()}.
	 */
	@Test
	public void testPoint() {
		Assert.assertNotNull("Instance creation failed.", this.point);
	}

	/**
	 * Test method for {@link by.iba.gomel.Point#updateX(int)}.
	 */
	@Test
	public void testUpdateX() {
		this.point.updateX(10);
		Assert.assertEquals("Method updateX() failed.", 10, this.point.getX());
	}

	/**
	 * Test method for {@link by.iba.gomel.Point#updateY(int)}.
	 */
	@Test
	public void testUpdateY() {
		this.point.updateY(20);
		Assert.assertEquals("Method updateY() failed.", 20, this.point.getY());
	}
}
