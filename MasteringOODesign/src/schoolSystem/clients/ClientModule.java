package schoolSystem.clients;

import schoolSystem.staff.EnglishTeacher;
import schoolSystem.staff.SchoolStaff;
import schoolSystem.staff.Substitute;

/**
 * @author Hammad: 16-Feb-2022
 */
public class ClientModule {

	public static void main(String[] args) {

		SchoolStaff substitute = new Substitute();
		substitute.performOtherDuties();

		EnglishTeacher englishTeacher = new EnglishTeacher();
		englishTeacher.performOtherDuties();
		englishTeacher.teach();
	}

}
