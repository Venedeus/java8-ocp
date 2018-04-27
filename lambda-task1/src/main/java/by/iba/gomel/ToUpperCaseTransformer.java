/**
 *
 */
package by.iba.gomel;

/**
 * This interface is an extension of StringTransformer to transform a string to
 * upper-case letters.
 */
@FunctionalInterface
public interface ToUpperCaseTransformer extends StringTransformer {
	/**
	 * This method transform a string.
	 *
	 * @param str
	 *            - input string.
	 * @return transformed string.
	 */
	@Override
	String doTransformation(String str);
}
