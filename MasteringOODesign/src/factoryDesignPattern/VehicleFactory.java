package factoryDesignPattern;

/**
 * @author Hammad: 20-Feb-2022
 */
public class VehicleFactory {

	public Vehicle getVehicle(VehicleType vehicleType) {
		return vehicleType.getVehicle();
	}
}
