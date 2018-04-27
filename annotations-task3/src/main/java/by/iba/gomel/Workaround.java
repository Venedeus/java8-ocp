package by.iba.gomel;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This repeatable annotation provides meta-information about defects in a unit.
 */
@Documented
@Repeatable(value = Workarounds.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Workaround {
	/**
	 * Name of author caught a defect.
	 */
	String author()

	default "unnamed";

	/**
	 * ID of a defect.
	 */
	int defectId()

	default 0;

	/**
	 * ID of release.
	 */
	int releaseId() default 0;
}
