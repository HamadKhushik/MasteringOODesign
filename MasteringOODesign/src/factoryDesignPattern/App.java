package factoryDesignPattern;

/**
 * @author Hammad: 20-Feb-2022
 */
public class App {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.ElectricCar);

		vehicle.startEngine();
	}
}
