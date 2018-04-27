/**
 *
 */
package by.iba.gomel;

/**
 * This interface is an extension of StringTransformer to transform a string to
 * lower-case letters.
 */
@FunctionalInterface
public interface ToLowerCaseTransformer extends StringTransformer {
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
