package builderPatternExample;

/**
 * class builds user using the builder pattern
 * 
 * @author Hammad: 19-Feb-2022
 */
public class App {

	public static void main(String[] args) {
		User websiteUser = new User.Builder("Seinfeld", "Seinfeld@Seinfeld").firstName("Jerry").lastName("Seinfeld")
				.build();
		System.out.println(websiteUser);

		Vehicle myCar = new Vehicle.Builder().color("Grey").doors(5).horsePower(600).make("Toyota").model("prius")
				.build();
		System.out.println(myCar);
	}
}
