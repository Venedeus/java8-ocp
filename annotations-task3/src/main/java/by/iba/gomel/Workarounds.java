/**
 *
 */
package by.iba.gomel;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * This annotation type is an container of @Workaround.
 */
@Documented
@Retention(RUNTIME)
public @interface Workarounds {
	/**
	 * An array of @Workaround.
	 */
	Workaround[] value();
}