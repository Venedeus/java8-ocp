/**
 *
 */
package by.iba.gomel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Book class.
 */
public class BookTest {
	/**
	 * Reference of testing class.
	 */
	private List<Book> listOfBooks;

	/**
	 * Pre-test initialization.
	 *
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.listOfBooks = new ArrayList<>();
		this.listOfBooks.add(new Book("First edition", 100, 2001));
		this.listOfBooks.add(new Book("Second edition", 101, 2003));
		this.listOfBooks.add(new Book("Third edition", 102, 2005));
	}

	/**
	 * This method tests title ascending sort with help of aggregate operations.
	 */
	@Test
	public void testSortTitleAscending() {
		final StringBuilder list = new StringBuilder();
		final String expected = "Book: First edition [100 pages, 2001 year]\nBook: Second edition [101 pages, 2003 year]\nBook: Third edition [102 pages, 2005 year]\n";

		this.listOfBooks.stream().sorted((book1, book2) -> book1.getTitle().compareTo(book2.getTitle()))
				.forEach(book -> list.append(book.toString() + "\n"));

		Assert.assertEquals("Year descending sort failed", expected, list.toString());
	}

	/**
	 * This method tests year descending sort with help of aggregate operations.
	 */
	@Test
	public void testSortYearDescending() {
		final StringBuilder list = new StringBuilder();
		final String expected = "Book: Third edition [102 pages, 2005 year]\nBook: Second edition [101 pages, 2003 year]\nBook: First edition [100 pages, 2001 year]\n";

		this.listOfBooks.stream().sorted((book1, book2) -> book2.getYear() - book1.getYear())
				.forEach(book -> list.append(book.toString() + "\n"));

		Assert.assertEquals("Year descending sort failed", expected, list.toString());
	}
}
