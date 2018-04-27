/**
 *
 */
package by.iba.gomel;

/**
 * This interface is an extension of StringTransformer to trim a string.
 */
@FunctionalInterface
public interface SpaceRemover extends StringTransformer {
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
