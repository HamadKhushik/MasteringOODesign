package hospitalEmployeeManagementSystem.clients;

import hospitalEmployeeManagementSystem.domain.Employee;
import hospitalEmployeeManagementSystem.domain.dao.EmployeeDAO;

/**
 * runner code / entry point to the application
 * 
 * @author Hammad: 13-Feb-2022
 */
public class ClientModule {

	public static void main(String[] args) {

		Employee peggy = new Employee(2, "Peggy", "Finance", true);
		hireNewEmployee(peggy);
		terminateEmployee(peggy);
	}

	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);
	}

	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}
}
