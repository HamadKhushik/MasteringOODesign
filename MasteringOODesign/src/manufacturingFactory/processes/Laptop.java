package manufacturingFactory.processes;

/**
 * @author Hammad: 15-Feb-2022
 */
public class Laptop extends GeneralManufacturingProcess {

	public Laptop(String processName) {
		super(processName);
		System.out.println("Manufacturing a Laptop...");
	}

	@Override
	protected void assembleDevice() {
		System.out.println("Assembling a Laptop");
	}

	@Override
	protected void testDevice() {
		System.out.println("Testing a Laptop");
	}

	@Override
	protected void packageDevice() {
		System.out.println("Packaging a Laptop");
	}

	@Override
	protected void storeDevice() {
		System.out.println("Storing a Laptop");
	}

}
