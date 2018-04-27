/**
 *
 */
package by.iba.gomel;

/**
 * This class is a simple realization of engine.
 */
public class Engine {
	/**
	 * String constant used if engine started successfully.
	 */
	private static final String SUCCESS = "The engine started successfully.";
	/**
	 * String constant used if engine's start failed.
	 */
	private static final String FAIL = "The engine not started. Refill it.";

	/**
	 * This method imitate engine's start. If there is enough fuel it starts
	 * successfully.
	 *
	 * @param isEnoughFuel
	 *            - true - if there is enough fuel; false - if not.
	 * @return state of start process.
	 */
	@Deprecated
	public String startEngine(final boolean isEnoughFuel) {
		return isEnoughFuel ? Engine.SUCCESS : Engine.FAIL;
	}
}
