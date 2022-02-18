package dependencyInjectionExample;

/**
 * @author Hammad: 18-Feb-2022
 */
public class Vehicle {

	private Engine myEngine;

	public Vehicle(Engine anEngine) {
		this.myEngine = anEngine;
	}

	public void crankIgnition() {
		myEngine.startEngine();
		System.out.println("Vehicle is running...");
	}
}
