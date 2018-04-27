/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class is for testing Engine class.
 */
public class EngineTest {
	/**
	 * This test shows the usage of repeatable annotations.
	 */
	@Test
	public void testAnnotations() {
		final String[] arrayOfAnnots = { "@by.iba.gomel.Workaround(releaseId=1, author=Yauheni, defectId=1)",
				"@by.iba.gomel.Workaround(releaseId=2, author=Shviatsou, defectId=2)" };

		final Workaround[] annots = Engine.class.getAnnotationsByType(Workaround.class);

		boolean checkArray = true;

		for (int i = 0; i < annots.length; i++) {
			if (!arrayOfAnnots[i].toString().equals(annots[i].toString())) {
				checkArray = false;
				break;
			}
		}

		Assert.assertTrue("Annotation usage failed.", checkArray);
	}
}