package manufacturingFactory.processes;

/**
 * @author Hammad: 15-Feb-2022
 */
public class SmartPhone extends GeneralManufacturingProcess {

	public SmartPhone(String processName) {
		super(processName);
		System.out.println("Manufacturing a SmartPhone... ");
	}

	@Override
	protected void assembleDevice() {
		System.out.println("Assembling a Smart Phone");
	}

	@Override
	protected void testDevice() {
		System.out.println("Testing a Smart Phone");
	}

	@Override
	protected void packageDevice() {
		System.out.println("Packaging a Smart Phone");
	}

	@Override
	protected void storeDevice() {
		System.out.println("Storing a Smart Phone");
	}

}
