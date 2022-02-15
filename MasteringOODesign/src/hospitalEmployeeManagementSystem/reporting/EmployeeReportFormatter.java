package hospitalEmployeeManagementSystem.reporting;

import hospitalEmployeeManagementSystem.domain.Employee;

/**
 * @author Hammad: 12-Feb-2022
 */
public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
	}

	public String getFormattedEmployee() {
		return getFormattedValue();
	}
}
