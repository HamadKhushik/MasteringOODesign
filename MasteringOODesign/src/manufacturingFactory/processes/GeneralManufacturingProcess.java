package manufacturingFactory.processes;

/**
 * abstract class to outline the general manufacturing processes for every
 * device in the factory
 * 
 * @author Hammad: 15-Feb-2022
 */
public abstract class GeneralManufacturingProcess {

	private String processName;

	public GeneralManufacturingProcess(String processName) {
		this.processName = processName;
	}

	protected abstract void assembleDevice();

	protected abstract void testDevice();

	protected abstract void packageDevice();

	protected abstract void storeDevice();

	// Template Pattern - where abstract methods are called in the abstract class as
	// part of the generally defined flow
	// methods are implemented in the sub-classes but called in the abstract class
	// as part of a general process
	public void launchProcess() {
		if (processName != null || !processName.isEmpty()) {
			assembleDevice();
			testDevice();
			packageDevice();
			storeDevice();
		} else {
			System.out.println("No Process Name defined");
		}
	}

}
