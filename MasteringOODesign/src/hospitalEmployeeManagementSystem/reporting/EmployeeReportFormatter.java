package hospitalEmployeeManagementSystem.reporting;

import hospitalEmployeeManagementSystem.domain.Employee;

/**
 * @author Hammad: 12-Feb-2022
 */
public class EmployeeReportFormatter extends ReportFormatter {

	Employee anEmployee;
	FormatType formatType;

	public void getFormattedEmployee() {
		System.out.println("Returning formatted employee");
	}
}
