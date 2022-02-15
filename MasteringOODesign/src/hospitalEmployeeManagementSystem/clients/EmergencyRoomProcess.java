package hospitalEmployeeManagementSystem.clients;

import hospitalEmployeeManagementSystem.domain.Doctor;
import hospitalEmployeeManagementSystem.domain.Employee;
import hospitalEmployeeManagementSystem.domain.HospitalManagement;
import hospitalEmployeeManagementSystem.domain.Nurse;

/**
 * @author Hammad: 15-Feb-2022
 */
public class EmergencyRoomProcess {

	public static void main(String[] args) {
		HospitalManagement ERDirector = new HospitalManagement();

		Employee peggy = new Nurse(1, "Peggy", "emergency", true);
		ERDirector.callUpon(peggy);

		Employee susan = new Doctor(1, "Susan", "emergency", true);
		ERDirector.callUpon(susan);
	}
}
