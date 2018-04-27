/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing IntTransformer.
 */
public class IntTransformerTest {
	/**
	 * Test method for {@link by.iba.gomel.IntTransformer#transform(int)}.
	 */
	@Test
	public void testTransform() {
		final String exp = String
				.format(new StringBuilder("Input int value:\t10%n").append("Binary notification:\t1010%n")
						.append("Octal notification:\t12%n").append("Hex notification:\tA").toString());
		Assert.assertEquals("Method transform() failed.", exp, IntTransformer.transform(10));
	}

	/**
	 * Test method for {@link by.iba.gomel.IntTransformer#transform(int)} with
	 * out of max-limit input integer.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testTransformMax() {
		IntTransformer.transform(32);
	}

	/**
	 * Test method for {@link by.iba.gomel.IntTransformer#transform(int)} with
	 * out of min-limit input integer.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testTransformMin() {
		IntTransformer.transform(0);
	}
}
