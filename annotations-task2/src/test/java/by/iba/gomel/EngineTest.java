/**
 *
 */
package by.iba.gomel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing Engine class.
 */
@SuppressWarnings(value = { "deprecation" })
public class EngineTest {
	/**
	 * String constant used if engine started successfully.
	 */
	private static final String SUCCESS = "The engine started successfully.";
	/**
	 * String constant used if engine's start failed.
	 */
	private static final String FAIL = "The engine not started. Refill it.";
	/**
	 * Instance of testing class.
	 */
	private Engine engine;

	/**
	 * Pre-test initialization.
	 */
	@Before
	public void preInitialization() {
		this.engine = new Engine();
	}

	/**
	 * Test method for {@link by.iba.gomel.Engine#startEngine(boolean)} on
	 * false.
	 */
	@Test
	public void testStartEngineFalse() {
		Assert.assertEquals("Method startEngine() failed.", EngineTest.FAIL, this.engine.startEngine(false));
	}

	/**
	 * Test method for {@link by.iba.gomel.Engine#startEngine(boolean)} on true.
	 */
	@Test
	public void testStartEngineTrue() {
		Assert.assertEquals("Method startEngine() failed.", EngineTest.SUCCESS, this.engine.startEngine(true));
	}
}
