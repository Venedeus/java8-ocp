/**
 *
 */
package by.iba.gomel;

import java.util.Locale;

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
		this.book.addBookmark(1, "This is a comment for bookmark.");
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#Book(java.lang.String, int)}.
	 */
	@Test
	public void testBook() {
		Assert.assertNotNull("Instance creation failed.", this.book);
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#setCurrentPageNumber(int)} with
	 * default translation on English.
	 */
	@Test
	public void testDefaultTranslation() {
		this.book.setCurrentPageNumber(1);
		Assert.assertEquals("Method getCurrentPageContent() failed.", "en Demo book #1: 1 - Some demo content",
				this.book.getCurrentPageContent());
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#getBookmarkByPageNumber(int))}.
	 */
	@Test
	public void testGetBookmarkByPageNumber() {
		final String expected = "This is a comment for bookmark.";
		Assert.assertEquals("Method getBookmarkByPageNumber() failed.", expected, this.book.getBookmarkByPageNumber(1));
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#getBookmarkByPageNumber(int))}
	 * with no bookmark.
	 */
	@Test
	public void testGetBookmarkByPageNumberNoBookmark() {
		final String expected = null;
		Assert.assertEquals("Method getBookmarkByPageNumber() failed.", expected, this.book.getBookmarkByPageNumber(2));
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#getBookmarkByPageNumber(int))}
	 * with parameter out of range.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetBookmarkByPageNumberOutOfRange() {
		this.book.addBookmark(100, "This is a comment for bookmark.");
		final String expected = "This is a comment for bookmark.";
		Assert.assertEquals("Method getBookmarkByPageNumber() failed.", expected, this.book.getBookmarkByPageNumber(1));
	}

	/**
	 * Test method for {@link by.iba.gomel.Book#getCurrentPageContent()}.
	 */
	@Test
	public void testGetCurrentPageContent() {
		this.book.setCurrentPageNumber(10);
		this.book.translate(new Locale("Ru"));
		Assert.assertEquals("Method getCurrentPageContent() failed.", "ru Demo book #1: 10 - Some demo content",
				this.book.getCurrentPageContent());
	}

	/**
	 * This method tests default translation through an anonymous class.
	 */
	@Test
	public void testPrint() {
		final String print = new Translatable() {
			@Override
			public String print() {
				final Book book = new Book("Demo book #3: ", 2);

				final StringBuilder allBookContent = new StringBuilder();
				for (int i = 0; i < book.getBookLength(); i++) {
					book.setCurrentPageNumber(i + 1);
					allBookContent.append(book.getCurrentPageContent()).append("\n");
				}

				return allBookContent.toString();
			}

			@Override
			public void translate(final Locale locale) {
				this.translate(new Locale("Fr"));

			}
		}.print();

		final String expected = "en Demo book #3: 1 - Some demo content\nen Demo book #3: 2 - Some demo content\n";

		Assert.assertEquals("Method print() failed.", expected, print);
	}
}
