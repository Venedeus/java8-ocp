/**
 *
 */
package by.iba.gomel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * This class realize a book with title and pages. Page - is an inner class of
 * page and content. There is a nested static class to get a content from a
 * given book and page.
 */
public final class Book implements Translatable {
	/**
	 * String constant - blank symbol.
	 */
	private static final String BLANK = " ";
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
	 * A list of bookmarks.
	 */
	private final List<Bookmark> bookmarks;
	/**
	 * Number of current page.
	 */
	private int currentPageNumber;
	/**
	 * Locale of the book.
	 */
	private Locale locale;

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
		this.bookmarks = new ArrayList<>();
		this.demoInitializer();
		this.translate();
	}

	/**
	 * This method adds a bookmark to a page.
	 *
	 * @param pageNumber
	 *            - number of a page for bookmark.
	 * @param comment
	 *            - comment to be added.
	 */
	public void addBookmark(final int pageNumber, final String comment) {
		if (pageNumber < this.pages.length) {
			this.bookmarks.add(new Bookmark(pageNumber, comment));
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * This method returns amount of pages in a book.
	 *
	 * @return amount of pages in a book.
	 */
	public int getBookLength() {
		return this.pages.length;
	}

	/**
	 * This method gets a comment from a page if there is a one. If there is no
	 * a bookmark - null will be returned.
	 *
	 * @param currentPageNumber
	 *            - a number of a page with a bookmark.
	 * @return a comment of a bookmark.
	 */
	public String getBookmarkByPageNumber(final int currentPageNumber) {
		String comment = null;

		for (final Bookmark bookmark : this.bookmarks) {
			if (bookmark.getPageNumber() == currentPageNumber) {
				comment = bookmark.getComment();
			}
		}

		return comment;
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

				content = this.locale.toString() + Book.BLANK + page.getContent();

				break;
			}
		}

		return content;
	}

	/**
	 * This method overrides interface method
	 * {@link by.iba.gomel.Translatable#print()}.
	 *
	 * @return content of the book.
	 */
	@Override
	public String print() {
		final StringBuilder allBookContent = new StringBuilder();
		for (final Page page : this.pages) {
			allBookContent.append(page.getContent()).append("\n");
		}

		return allBookContent.toString();
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
	 * This method realize translation according to given locale and overrides
	 * interface method {@link by.iba.gomel.Translatable#translate(Locale))}.
	 *
	 * @param locale
	 *            - locale to be used.
	 */
	@Override
	public void translate(final Locale locale) {
		this.locale = locale;
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
	 * This method realize default translation [En].
	 *
	 * @param locale
	 *            - locale to be used.
	 */
	private void translate() {
		this.translate(new Locale("En"));
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
	 * This class realizes a bookmark - a comment on a page.
	 */
	private class Bookmark {
		/**
		 * Page number for a bookmark.
		 */
		private final int pageNumber;
		/**
		 * Comment of a bookmark.
		 */
		private final String comment;

		/**
		 * Custom constructor.
		 *
		 * @param pageNumber
		 *            - number of a page for a bookmark.
		 * @param comment
		 *            - comment to be added.
		 */
		public Bookmark(final int pageNumber, final String comment) {
			super();
			this.pageNumber = pageNumber;
			this.comment = comment;
		}

		/**
		 * Getter for comment {@link by.iba.gomel.Book.Bookmark#comment}.
		 * 
		 * @return a comment of a bookmark.
		 */
		public String getComment() {
			return this.comment;
		}

		/**
		 * Getter for a page number
		 * {@link by.iba.gomel.Book.Bookmark#pageNumber}.
		 * 
		 * @return a number of a page.
		 */
		public int getPageNumber() {
			return this.pageNumber;
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