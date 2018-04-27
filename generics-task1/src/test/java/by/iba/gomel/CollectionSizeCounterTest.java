/**
 *
 */
package by.iba.gomel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing CollectionSizeCounter class.
 */
public class CollectionSizeCounterTest {
	/**
	 * Testing list of Integers.
	 */
	List<Integer> listInts;
	/**
	 * Testing list of Longs.
	 */
	List<Long> listLongs;

	/**
	 * Pre-test initialization
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.listInts = new ArrayList<>();
		this.listLongs = new ArrayList<>();

		this.listInts.add(1);
		this.listInts.add(191);
		this.listInts.add(3);
		this.listInts.add(2);
		this.listInts.add(199);
		this.listInts.add(88);
		this.listInts.add(5);

		this.listLongs.add(100L);
		this.listLongs.add(1L);
		this.listLongs.add(55L);
		this.listLongs.add(50L);
		this.listLongs.add(12L);
		this.listLongs.add(11L);
		this.listLongs.add(5L);
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CollectionSizeCounter#countSize(java.util.Collection, by.iba.gomel.UnaryPredicate)}
	 * with odd Longs.
	 */
	@Test
	public void testCountSizeFirstLastDigitsIntegers() {
		Assert.assertEquals("Method countSize() with odd Longs failed.", 4,
				CollectionSizeCounter.countSize(this.listLongs, p -> (p % 2) != 0));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CollectionSizeCounter#countSize(java.util.Collection, by.iba.gomel.UnaryPredicate)}
	 * with odd Integers.
	 */
	@Test
	public void testCountSizeOddIntegers() {
		Assert.assertEquals("Method countSize() with odd Integers failed.", 5,
				CollectionSizeCounter.countSize(this.listInts, p -> (p % 2) != 0));
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.CollectionSizeCounter#countSize(java.util.Collection, by.iba.gomel.UnaryPredicate)}
	 * with equal first and last digit in Integer.
	 */
	@Test
	public void testCountSizeOddLongs() {
		Assert.assertEquals("Method countSize() with equal first and last digit in Integer failed.", 2,
				CollectionSizeCounter.countSize(this.listInts, p -> (p.toString().length() > 1)
						&& (p.toString().charAt(p.toString().length() - 1) == p.toString().charAt(0))));
	}

}
