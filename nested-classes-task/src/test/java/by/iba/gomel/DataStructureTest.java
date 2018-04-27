/**
 *
 */
package by.iba.gomel;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.DataStructure.DataStructureIterator;

/**
 * This class is for testing DataStructure class.
 */
public class DataStructureTest {
	/**
	 * Integer constant - numeric base of evens.
	 **/
	private static final int EVEN_BASE = 2;
	/**
	 * Integer constant - size of integer array.
	 */
	private static final int SIZE = 15;
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	/**
	 * Instance of testing class.
	 */
	private DataStructure dataStructure;

	/**
	 * Pre-test initialization.
	 */
	@Before
	@Test
	public void preInitialization() {
		this.dataStructure = new DataStructure();
	}

	/**
	 * Test method for {@link by.iba.gomel.DataStructure#DataStructure()}.
	 */
	@Test
	public void testDataStructure() {
		Assert.assertNotNull("Instance creation failed.", this.dataStructure);
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.DataStructure#print(by.iba.gomel.DataStructure.DataStructureIterator)}.
	 */
	@Test
	public void testPrint() {
		this.dataStructure.print(new DataStructureIterator() {
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
				return this.nextIndex <= (DataStructureTest.SIZE - 1);
			}

			/**
			 * An overriding of interface method.
			 *
			 * @return next integer element.
			 */
			@Override
			public Integer next() {
				if (this.hasNext()) {
					final Integer retValue = Integer.valueOf(new DataStructure().getArrayOfInts()[this.nextIndex]);
					this.nextIndex += DataStructureTest.EVEN_BASE;
					return retValue;
				} else {
					throw new NoSuchElementException();
				}
			}
		});

		Assert.assertEquals("Method print() failed", String.format("1%n3%n5%n7%n9%n11%n13%n %n"),
				this.log.getLog().toString());
	}

	/**
	 * Test method for {@link by.iba.gomel.DataStructure#printEven()}.
	 */
	@Test
	public void testPrintEven() {
		this.dataStructure.printEven();
		Assert.assertEquals("Method print() failed", String.format("0%n2%n4%n6%n8%n10%n12%n14%n %n"),
				this.log.getLog().toString());
	}

}
