package by.iba.gomel;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrates an adaptation of nested classes.
 */
public final class DataStructure {
	/**
	 * String constant - blank symbol.
	 */
	private static final String BLANK = " ";
	/**
	 * Integer constant - numeric base of evens.
	 **/
	private static final int EVEN_BASE = 2;
	/**
	 * Integer constant - size of integer array.
	 */
	private static final int SIZE = 15;
	/**
	 * Logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(DataStructure.class);
	/**
	 * Array of integers.
	 */
	private final int[] arrayOfInts = new int[DataStructure.SIZE];

	/**
	 * Default constructor. Initializes {@link #arrayOfInts} of {@link #SIZE}
	 * with ints starting from 0 up to {@link #SIZE}.
	 */
	public DataStructure() {
		// fill the array with ascending integer values
		for (int i = 0; i < DataStructure.SIZE; i++) {
			this.arrayOfInts[i] = i;
		}
	}

	/**
	 * Fills the {@link #arrayOfInts} with int values and prints out only values
	 * of even indices.
	 *
	 * @param args
	 *            method parameters. Not used in this implementation.
	 */
	public static void main(final String[] args) {
		final DataStructure dataStructure = new DataStructure();
		dataStructure.print(dataStructure.new EvenIterator());
		dataStructure.print(new DataStructureIterator() {
			/**
			 * Next element of an array.
			 */
			private int nextIndex = 1;

			/**
			 * An overriding of interface method.
			 *
			 * @return true - if there is next element; false - if not.
			 */
			@Override
			public boolean hasNext() {
				return this.nextIndex <= (DataStructure.SIZE - 1);
			}

			/**
			 * An overriding of interface method.
			 *
			 * @return next integer element.
			 */
			@Override
			public Integer next() {
				if (this.hasNext()) {
					final Integer retValue = Integer.valueOf(new DataStructure().arrayOfInts[this.nextIndex]);
					this.nextIndex += DataStructure.EVEN_BASE;
					return retValue;
				} else {
					throw new NoSuchElementException();
				}
			}
		});
	}

	public int[] getArrayOfInts() {
		return this.arrayOfInts;
	}

	/**
	 * This method prints elements according to iteration criteria.
	 *
	 * @param iterator
	 *            - implementation of DataStructureIterator.
	 */
	public void print(final DataStructureIterator iterator) {
		while (iterator.hasNext()) {
			DataStructure.LOGGER.info(iterator.next().toString());
		}

		DataStructure.LOGGER.info(DataStructure.BLANK);
	}

	/**
	 * Prints out values of event indices of the {@link #arrayOfInts}.
	 */
	public void printEven() {
		final DataStructureIterator iterator = this.new EvenIterator();

		this.print(iterator);
	}

	/**
	 * This interface implements java.util.Iterator<Integer>.
	 */
	interface DataStructureIterator extends java.util.Iterator<Integer> {
	}

	/**
	 * This is an implementation of DataStructureIterator to find even elements
	 * in an array.
	 */
	private class EvenIterator implements DataStructureIterator {
		/**
		 * Next element of an array.
		 */
		private int nextIndex;

		/**
		 * An overriding of interface method.
		 *
		 * @return true - if there is next element; false - if not.
		 */
		@Override
		public boolean hasNext() {
			return this.nextIndex <= (DataStructure.SIZE - 1);
		}

		/**
		 * An overriding of interface method.
		 *
		 * @return next integer element.
		 */
		@Override
		public Integer next() {
			final Integer retValue = Integer.valueOf(DataStructure.this.arrayOfInts[this.nextIndex]);
			this.nextIndex += DataStructure.EVEN_BASE;
			return retValue;
		}
	}
}