/**
 *
 */
package by.iba.gomel;

/**
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		System.out.println(new PasswordChecker(new Criteria()).checkPassword("QWErty123"));
		System.out.println(new PasswordChecker(new Criteria()).checkPassword("Qwerty1"));
	}
}
