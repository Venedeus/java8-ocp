/**
 *
 */
package by.iba.gomel;

/**
 * This enumeration represents a way to move something in four directions
 * according to members.
 */
public enum Directions {
	UP {
		@Override
		public void move(final Point point) {
			point.updateY(1);
		}
	},
	RIGHT {
		@Override
		public void move(final Point point) {
			point.updateX(1);
		}
	},
	DOWN {
		@Override
		public void move(final Point point) {
			point.updateY(-1);
		}
	},
	LEFT {
		@Override
		public void move(final Point point) {
			point.updateX(-1);
		}
	};

	/**
	 * This is abstract method to move.
	 * 
	 * @param point
	 *            - point which coordinates is to be changed.
	 */
	public abstract void move(Point point);
}
