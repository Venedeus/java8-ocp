/**
 *
 */
package by.iba.gomel;

/**
 * This class realizes a book.
 */
public final class Book {
	private static final String TO_STRING = "Book: %s [%d pages, %d year]";

	/**
	 * Numbers of pages in a book.
	 */
	private final int numberOfPages;
	/**
	 * Title of a book.
	 */
	private final String title;
	/**
	 * Year of edition.
	 */
	private final int year;

	/**
	 * Custom constructor.
	 *
	 * @param numberOfPages
	 *            - numbers of pages.
	 * @param title
	 *            - title of a book.
	 * @param year
	 *            - year of edition.
	 */
	public Book(final String title, final int numberOfPages, final int year) {
		super();
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.year = year;
	}

	/**
	 * Getter for number of pages.
	 *
	 * @return number of pages.
	 */
	public int getNumberOfPages() {
		return this.numberOfPages;
	}

	/**
	 * Getter for title of a book.
	 *
	 * @return title of a book.
	 */
	public String getTitle() {
		return this.title;
	}

	/***
	 * Getter for year of edition.
	 *
	 * @return year of edition.
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * This method overrides toString().
	 *
	 * @return string with object's characteristics.
	 */
	@Override
	public String toString() {
		return String.format(Book.TO_STRING, this.title, this.numberOfPages, this.year);
	}
}
