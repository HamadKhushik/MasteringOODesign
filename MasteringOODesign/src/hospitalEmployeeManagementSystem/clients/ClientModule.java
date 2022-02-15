package hospitalEmployeeManagementSystem.clients;

import hospitalEmployeeManagementSystem.domain.Employee;
import hospitalEmployeeManagementSystem.domain.Nurse;
import hospitalEmployeeManagementSystem.domain.dao.EmployeeDAO;
import hospitalEmployeeManagementSystem.reporting.EmployeeReportFormatter;
import hospitalEmployeeManagementSystem.reporting.FormatType;

/**
 * runner code / entry point to the application
 * 
 * @author Hammad: 13-Feb-2022
 */
public class ClientModule {

	public static void main(String[] args) {

		Nurse peggy = new Nurse(2, "Peggy", "Finance", true);
		hireNewEmployee(peggy);
		terminateEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}

	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);
	}

	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}

	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
}
