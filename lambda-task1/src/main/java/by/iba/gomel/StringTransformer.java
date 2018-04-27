/**
 *
 */
package by.iba.gomel;

/**
 * This interface provide a method to transform a string according to
 * realization of a rule.
 */
@FunctionalInterface
public interface StringTransformer {
	/**
	 * This method transform a string.
	 * 
	 * @param str
	 *            - input string.
	 * @return transformed string.
	 */
	String doTransformation(String str);
}
