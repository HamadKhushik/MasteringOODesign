package hospitalEmployeeManagementSystem.reporting;

/**
 * @author Hammad: 12-Feb-2022
 */
public class ReportFormatter {

	public ReportFormatter(Object object, FormatType formatType) {

	}

	private String convertObjectToXML(Object object) {
		return "XML : <title>" + object.toString() + "</title>";
	}

	private String convertObjectToCSV(Object object) {
		return "CSV : ,,,,," + object.toString() + ",,,,,";
	}

	public String getFormattedValue() {
		System.out.println("Returning formatted value");
		return null;
	}
}
