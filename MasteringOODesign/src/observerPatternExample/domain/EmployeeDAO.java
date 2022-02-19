package observerPatternExample.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hammad: 19-Feb-2022
 */
public class EmployeeDAO {

	Employee emp1 = new Employee("Mike", 5000, false);
	Employee emp2 = new Employee("Steve", 4500, false);
	Employee emp3 = new Employee("John", 7000, false);
	Employee emp4 = new Employee("Pat", 6000, false);
	Employee emp5 = new Employee("Joe", 8000, false);

	List<Employee> employees;

	public List<Employee> generateEmployees() {
		employees = new ArrayList<Employee>();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		return employees;
	}

	public void addEmployees(Employee emp) {
		employees.add(emp);
	}
}
