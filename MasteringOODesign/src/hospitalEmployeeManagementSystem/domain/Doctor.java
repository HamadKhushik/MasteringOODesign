package hospitalEmployeeManagementSystem.domain;

/**
 * @author Hammad: 15-Feb-2022
 */
public class Doctor extends Employee {

	public Doctor(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in Action...");
	}

	private void prescribeMedicine() {
		System.out.println("Prescribe Medicine");
	}

	private void diagnosePatient() {
		System.out.println("Diagnose Patient");
	}

	public void performDuties() {
		prescribeMedicine();
		diagnosePatient();
	}

}
