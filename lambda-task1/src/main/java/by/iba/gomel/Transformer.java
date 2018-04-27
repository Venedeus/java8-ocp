/**
 *
 */
package by.iba.gomel;

/**
 * This class is for string transformation according to given rule.
 */
public final class Transformer {
	/**
	 * Private constructor
	 */
	private Transformer() {
	}

	/**
	 * Method to transform a string.
	 *
	 * @param transformer
	 *            - interface function to be used.
	 * @return transformed string.
	 */
	public static String transformString(final String str, final StringTransformer transformer) {
		return transformer.doTransformation(str);
	}
}
