package hospitalEmployeeManagementSystem.domain.dao;

import hospitalEmployeeManagementSystem.domain.Employee;

/**
 * Database access object(DAO) class
 * 
 * @author Hammad: 13-Feb-2022
 */
public class EmployeeDAO {

	public void saveEmployee(Employee employee) {
		System.out.println("Saving an Employee to the database" + employee);
	}

	public void deleteEmployee(Employee employee) {
		System.out.println("Deleting an Employee from the database " + employee);
	}

	public static void printEmployeeReport(Employee employee) {

	}
}
