/**
 *
 */
package by.iba.gomel;

/**
 * This class realizes a point with (x; y) coordinates.
 */
public final class Point {
	/**
	 * X-coordinate of a point.
	 */
	private int x;
	/**
	 * Y-coordinate of a point.
	 */
	private int y;

	/**
	 * Constructor to set coordinates to zero.
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Getter for x.
	 *
	 * @return x-coordinate.
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Getter for y.
	 *
	 * @return y-coordinate.
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * This method updates x-coordinate with input x.
	 * 
	 * @param x
	 *            - input value to update.
	 */
	public void updateX(final int x) {
		this.x += x;
	}

	/**
	 * This method updates y-coordinate with input y.
	 * 
	 * @param y
	 *            - input value to update.
	 */
	public void updateY(final int y) {
		this.y += y;
	}
}
