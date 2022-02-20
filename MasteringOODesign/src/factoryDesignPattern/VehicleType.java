package factoryDesignPattern;

/**
 * @author Hammad: 20-Feb-2022
 */
public enum VehicleType {

	TRUCK {
		public Vehicle getVehicle() {
			return new Truck();
		}
	},

	CAR {
		public Vehicle getVehicle() {
			return new Car();
		}

	},

	ElectricCar {
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	};

	abstract Vehicle getVehicle();
}
