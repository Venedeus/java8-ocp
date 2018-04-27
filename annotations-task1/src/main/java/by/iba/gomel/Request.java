/**
 *
 */
package by.iba.gomel;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

@Documented
@Retention(RUNTIME)
/**
 * This annotation type is to attend classes with information about creation.
 */
public @interface Request {
	/**
	 * Date of release.
	 */
	String date() default "unknown";

	/**
	 * Name of engineer.
	 */
	String engineer() default "unassigned";

	/**
	 * ID number.
	 */
	int id();

	/**
	 * Short description about an item.
	 */
	String synopsis();
}
