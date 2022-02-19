package observerPatternExample.clients;

import observerPatternExample.domain.Employee;
import observerPatternExample.observers.HRDepartment;
import observerPatternExample.observers.IObserver;
import observerPatternExample.observers.PayrollDepartment;
import observerPatternExample.subjects.EmployeeManagementSystem;

/**
 * @author Hammad: 19-Feb-2022
 */
public class App {

	public static void main(String[] args) {
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();

		EmployeeManagementSystem ems = new EmployeeManagementSystem();

		ems.registerObserver(hrSystem);
		ems.registerObserver(payroll);

		Employee bob = new Employee("Bob", 35000, true);
		ems.hireNewEmployee(bob);

		System.out.println("\n*****************************\n");

		ems.modifyEmployeeName(1, "Seinfeld");
		ems.modifyEmployeeName(2, "Kramer");
	}
}
