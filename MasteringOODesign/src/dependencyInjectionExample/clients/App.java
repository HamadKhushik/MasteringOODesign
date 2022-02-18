package dependencyInjectionExample.clients;

import dependencyInjectionExample.LargeEngine;
import dependencyInjectionExample.Vehicle;

/**
 * @author Hammad: 18-Feb-2022
 */
public class App {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle(new LargeEngine(100));
		vehicle.crankIgnition();
	}

}
