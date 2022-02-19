package observerPatternExample.domain;

import java.util.Date;

/**
 * @author Hammad: 19-Feb-2022
 */
public class Employee {

	private String name;
	private int id;
	private Date hireDate;
	private int salary;
	private boolean working = false;

	private static int COUNTER;

	public Employee(String name, int salary, boolean working) {
		this.name = name;
		this.id = ++COUNTER;
		this.hireDate = new Date();
		this.salary = salary;
		this.working = working;
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + " id= " + id + " hireDate= " + hireDate + " Salary= " + salary
				+ " isWorking= " + working;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
