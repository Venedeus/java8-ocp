package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing lambda-expressions with Transformer class.
 */
public class TransformerTest {
	/**
	 * Reference of ToLowerCaseTransformer interface.
	 */
	ToLowerCaseTransformer lowerTransformer;
	/**
	 * Reference of ToUpperCaseTransformer interface.
	 */
	ToUpperCaseTransformer upperTransformer;
	/**
	 * Reference of SpaceTransformer interface.
	 */
	SpaceRemover trimTransformer;

	/**
	 * Pre-test initialization.
	 */
	@Before
	public void setUp() throws Exception {
		this.lowerTransformer = String::toLowerCase;
		this.upperTransformer = String::toUpperCase;
		this.trimTransformer = String::trim;
	}

	/**
	 * Test of SpaceRemover interface.
	 */
	@Test
	public void testTransformContentSpaceRemover() {
		Assert.assertEquals("Method of SpaceRemover interface failed.", "Some text",
				Transformer.transformString(" Some text ", this.trimTransformer));
	}

	/**
	 * Test of ToLowerCaseTransformer interface.
	 */
	@Test
	public void testTransformContentToLowerCase() {
		Assert.assertEquals("Method of ToLowerCaseTransformer interface failed.", " some text ",
				Transformer.transformString(" Some text ", this.lowerTransformer));
	}

	/**
	 * Test of ToUpperCaseTransformer interface.
	 */
	@Test
	public void testTransformContentToUpperCase() {
		Assert.assertEquals("Method of ToUpperCaseTransformer interface failed.", " SOME TEXT ",
				Transformer.transformString(" Some text ", this.upperTransformer));
	}
}
