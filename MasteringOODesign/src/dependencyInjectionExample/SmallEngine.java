package dependencyInjectionExample;

/**
 * @author Hammad: 18-Feb-2022
 */
public class SmallEngine implements Engine {

	private int horsePower;

	public SmallEngine(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting Small " + horsePower + "hp Engine");
	}

}
