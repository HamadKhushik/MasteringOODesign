package hospitalEmployeeManagementSystem.domain;

/**
 * @author Hammad: 15-Feb-2022
 */
public class HospitalManagement {

	public void callUpon(Employee employee) {
		employee.performDuties(); // make Employee class Abstract and make the extending classes implement the
									// performDuties() method to comply with the OCP(open closed principle)
									// principle
	}
}
