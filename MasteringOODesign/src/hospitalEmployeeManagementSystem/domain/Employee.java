package hospitalEmployeeManagementSystem.domain;

/**
 * 
 * @author Hammad: 12-Feb-2022
 */
public class Employee {

	private long id;
	private String name;
	private String department;
	private boolean working;

	public Employee(long id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working + "]";
	}

}
