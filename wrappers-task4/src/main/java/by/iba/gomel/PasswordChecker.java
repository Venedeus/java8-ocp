/**
 *
 */
package by.iba.gomel;

/**
 * This class is for checking a conformity input password to given criteria.
 */
public final class PasswordChecker {
	/**
	 * Criteria for checking.
	 */
	private final Criteria criteria;

	/**
	 * Custom constructor.
	 *
	 * @param criteria
	 *            - criteria for password checking.
	 */
	public PasswordChecker(final Criteria criteria) {
		this.criteria = criteria;
	}

	/**
	 * This method is for checking password.
	 *
	 * @param password
	 *            - password to be checked.
	 * @return true - if password checked successfully, false - if not.
	 */
	public boolean checkPassword(final String password) {
		return this.criteria.checkCriteria(password);
	}
}