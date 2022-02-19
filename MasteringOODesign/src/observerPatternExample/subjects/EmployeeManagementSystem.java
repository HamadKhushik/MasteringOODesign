package observerPatternExample.subjects;

import java.util.ArrayList;
import java.util.List;

import observerPatternExample.domain.Employee;
import observerPatternExample.domain.EmployeeDAO;
import observerPatternExample.observers.IObserver;

/**
 * @author Hammad: 19-Feb-2022
 */
public class EmployeeManagementSystem implements ISubject {

	private List<Employee> employees;
	private List<IObserver> observerList;

	private EmployeeDAO employeeDAO;

	private Employee emp;
	private String msg;

	public EmployeeManagementSystem() {
		observerList = new ArrayList<IObserver>();
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployees();
	}

	@Override
	public void registerObserver(IObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : observerList) {
			observer.callMe(emp, msg);
		}
	}

	public void hireNewEmployee(Employee employee) {
		emp = employee;
		msg = "New Hire : " + emp.getName();
		notifyObservers();
	}

	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;

		for (Employee employee : employees) {
			if (id == employee.getId()) {
				employee.setName(newName);
				emp = employee;
				msg = "Employee Name Modified to : " + emp.getName();
				notify = true;
			}
		}
		if (notify) {
			notifyObservers();
		}
	}

}
