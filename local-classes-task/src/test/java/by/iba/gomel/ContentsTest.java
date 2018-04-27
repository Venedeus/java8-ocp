/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Contents class.
 */
public class ContentsTest {
	/**
	 * Instance of testing class.
	 */
	Book.Contents contents;

	/**
	 * Pre-test initialization.
	 */
	@Before
	public void preInitialization() {
		this.contents = new Book.Contents();
	}

	/**
	 * Test method for
	 * {@link by.iba.gomel.Book.Contents#getPageContent(by.iba.gomel.Book, int)}.
	 */
	@Test
	public void testGetPageContent() {
		Assert.assertEquals("Method getPageContent() failed.", "en Demo book #1: 1 - Some demo content",
				this.contents.getPageContent(new Book("Demo book #1: ", 50), 1));
	}
}
