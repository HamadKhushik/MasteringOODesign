package dependencyInjectionExample;

/**
 * @author Hammad: 18-Feb-2022
 */
public class LargeEngine implements Engine {

	private int horsePower;

	public LargeEngine(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting large " + horsePower + "hp Engine");
	}

}
