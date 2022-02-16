package schoolSystem.staff;

/**
 * implementation of school staff/ school teaching staff. example of Liskov
 * Substitution Principle.  Separate staff from teaching staff and make an
 * interface for teaching staff
 * 
 * @author Hammad: 15-Feb-2022
 */
public class SchoolStaff {

	private void makeAnnouncements() {
		System.out.println("Making Announcements");
	}

	private void takeAttendance() {
		System.out.println("Taking Attendance");
	}

	private void collectPaperWork() {
		System.out.println("Collecting Paper Work");
	}

	private void conductHallwayDuties() {
		System.out.println("Conducting Hallway Duties");
	}

	public void performOtherDuties() {
		makeAnnouncements();
		takeAttendance();
		collectPaperWork();
		conductHallwayDuties();
	}

}
