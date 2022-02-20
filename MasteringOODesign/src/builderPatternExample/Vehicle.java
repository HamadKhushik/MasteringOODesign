package builderPatternExample;

/**
 * @author Hammad: 20-Feb-2022
 */
public class Vehicle {

	private double price;
	private String type;
	private String make;
	private int horsePower;
	private String model;
	private String color;
	private int doors;

	public Vehicle(Builder builder) {
		this.price = builder.price;
		this.type = builder.type;
		this.make = builder.make;
		this.horsePower = builder.horsePower;
		this.model = builder.model;
		this.color = builder.color;
		this.doors = builder.doors;
	}

	@Override
	public String toString() {
		return "Vehicle [make= " + make + ", model= " + model + ", type= " + type + " color= " + color + " horsePower= "
				+ horsePower + ", doors= " + doors + " price= " + price;
	}

	public static class Builder {
		private double price;
		private String type;
		private String make;
		private int horsePower;
		private String model;
		private String color;
		private int doors;

		public Builder() {

		}

		public Builder price(double value) {
			this.price = value;
			return this;
		}

		public Builder type(String value) {
			this.type = value;
			return this;
		}

		public Builder make(String value) {
			this.make = value;
			return this;
		}

		public Builder horsePower(int value) {
			this.horsePower = value;
			return this;
		}

		public Builder model(String value) {
			this.model = value;
			return this;
		}

		public Builder color(String value) {
			this.color = value;
			return this;
		}

		public Builder doors(int value) {
			this.doors = value;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
	}
}
