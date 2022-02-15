package hospitalEmployeeManagementSystem.domain;

/**
 * @author Hammad: 15-Feb-2022
 */
public class Nurse extends Employee {

	public Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse in Action...");
	}

	private void checkVitals() {
		System.out.println("Check Vitals");
	}

	private void drawBlood() {
		System.out.println("Draw Blood");
	}

	private void cleanPatientArea() {
		System.out.println("Cleaning Patient Area");
	}

	public void performDuties() {
		checkVitals();
		drawBlood();
		cleanPatientArea();
	}

}
