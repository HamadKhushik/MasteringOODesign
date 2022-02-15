package manufacturingFactory.clients;

import manufacturingFactory.processes.GeneralManufacturingProcess;
import manufacturingFactory.processes.Laptop;
import manufacturingFactory.processes.SmartPhone;

/**
 * runner code for the Manufacturing Factory Its contained in a different
 * package so that clients do no have access to the process methods!
 * 
 * @author Hammad: 15-Feb-2022
 */
public class DeviceFactory {

	public static void main(String[] args) {
		GeneralManufacturingProcess manufacturer = new SmartPhone("Iphone");
		manufacturer.launchProcess();

		GeneralManufacturingProcess laptopManufacturer = new Laptop("ThinkPad");
		laptopManufacturer.launchProcess();
	}
}
