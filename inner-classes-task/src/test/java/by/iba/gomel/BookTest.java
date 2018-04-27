/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This test is for testing Book class.
 */
public class BookTest {
	/**
	 * Instance of testing class.
	 */
	private Book book;

	/**
	 * Pre-test initialization.
	 */
	@Before
	public void preInitialization() {
		this.book = new Book("Demo book #1: ", 50);
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#Book(java.lang.String, int)}.
	 */
	@Test
	public void testBook() {
		Assert.assertNotNull("Instance creation failed.", this.book);
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#getCurrentPageContent()}.
	 */
	@Test
	public void testGetCurrentPageContent() {
		this.book.setCurrentPageNumber(10);
		Assert.assertEquals("Method getCurrentPageContent() failed.", "Demo book #1: 10 - Some demo content",
				this.book.getCurrentPageContent());
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#setCurrentPageNumber(int)}.
	 */
	@Test
	public void testSetCurrentPageNumber() {
		this.book.setCurrentPageNumber(1);
		Assert.assertEquals("Method getCurrentPageContent() failed.", "Demo book #1: 1 - Some demo content",
				this.book.getCurrentPageContent());
	}

}
