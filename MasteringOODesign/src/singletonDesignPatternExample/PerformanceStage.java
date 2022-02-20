package singletonDesignPatternExample;

/**
 * @author Hammad: 20-Feb-2022
 */
public class PerformanceStage {

	private static PerformanceStage INSTANCE = null;
	private static int counter;

	// private constructor for singleton pattern
	private PerformanceStage() {
		counter++;
	}

	// synchronized so that no two INSTANCES are creaated by two different threads
	public synchronized static PerformanceStage getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}

	public void turnOnLights() {
		System.out.println("Turned on Lights...");
	}

	public int getCounter() {
		return counter;
	}
}
