/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing Directions class.
 */
public class DirectionsTest {
	/**
	 * Test method for {@link by.iba.gomel.Directions#move(by.iba.gomel.Point)}.
	 */
	@Test
	public void testMove() {
		final Point point = new Point();
		Directions.UP.move(point);
		Directions.RIGHT.move(point);
		Directions.DOWN.move(point);
		Directions.LEFT.move(point);
		// Now point has coordinates (0; 0).
		Directions.UP.move(point);
		Directions.RIGHT.move(point);
		// Now point has coordinates (1; 1).
		Assert.assertTrue("Method move() failed.", (point.getX() == 1) && (point.getY() == 1));
	}
}
