/**
 *
 */
package by.iba.gomel;

import java.util.Locale;

/**
 * This is an interface to make books translatable.
 */
public interface Translatable {
	String print();

	void translate(Locale locale);
}
