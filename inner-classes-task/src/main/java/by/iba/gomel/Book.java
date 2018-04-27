/**
 *
 */
package by.iba.gomel;

/**
 * This class realize a book with title and pages. Page - is an inner class of
 * page and content. There is a nested static class to get a content from a
 * given book and page.
 */
public class Book {
	/**
	 * String constant for demo-content.
	 */
	private static final String DEMO_CONTENT = " - Some demo content";

	/**
	 * Title of a book.
	 */
	private final String bookTitle;
	/**
	 * An array of pages.
	 */
	private final Page[] pages;
	/**
	 * Number of current page.
	 */
	private int currentPageNumber;

	/**
	 * Custom constructor.
	 *
	 * @param bookTitle
	 *            - a title of a book.
	 * @param numberOfPages
	 *            - number of pages in a book.
	 */
	public Book(final String bookTitle, final int numberOfPages) {
		this.bookTitle = bookTitle;
		this.pages = new Page[numberOfPages];
		this.demoInitializer();
	}

	/**
	 * This method returns a content of a current page.
	 *
	 * @return a content of a current page.
	 */
	public String getCurrentPageContent() {
		String content = null;

		for (final Page page : this.pages) {
			if (page.getPageNumber() == this.currentPageNumber) {

				content = page.getContent();

				break;
			}
		}

		return content;
	}

	/**
	 * Setter for {@link #currentPageNumber}.
	 *
	 * @param currentPageNumber
	 *            - value of current page number to be set.
	 */
	public void setCurrentPageNumber(final int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	/**
	 * This is a demo-method to initialize a book with some content.
	 */
	private void demoInitializer() {
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i] = new Page(i + 1, this.bookTitle + (i + 1) + Book.DEMO_CONTENT);
		}
	}

	/**
	 * This is a nested static class to get a content from a current page of a
	 * book.
	 */
	public static class Contents {
		/**
		 * This method returns a content in a given book of a given page.
		 *
		 * @param book
		 *            - given book.
		 * @param currentPageNumber
		 *            - number of a page to get a content.
		 * @return a content in a page of a book.
		 */
		public String getPageContent(final Book book, final int currentPageNumber) {
			book.setCurrentPageNumber(currentPageNumber);
			return book.getCurrentPageContent();
		}
	}

	/**
	 * This is an inner class realizes a page.
	 */
	private class Page {
		/**
		 * Page's number.
		 */
		int pageNumber;
		/**
		 * Content of a page.
		 */
		String content;

		/**
		 * Custom constructor.
		 * 
		 * @param pageNumber
		 *            - number of a page.
		 * @param content
		 *            - content of a page.
		 */
		public Page(final int pageNumber, final String content) {
			this.pageNumber = pageNumber;
			this.content = content;
		}

		/**
		 * Getter for {@link #content}.
		 * 
		 * @return content of a page.
		 */
		public String getContent() {
			return this.content;
		}

		/**
		 * Getter for {@link #pageNumber}.
		 * 
		 * @return number of a page.
		 */
		public int getPageNumber() {
			return this.pageNumber;
		}
	}
}
