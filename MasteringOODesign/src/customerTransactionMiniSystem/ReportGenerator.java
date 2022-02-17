package customerTransactionMiniSystem;

/**
 * @author Hammad: 17-Feb-2022
 */
public class ReportGenerator {

	private Reporting transactionObject;

	public ReportGenerator(CustomerTransaction aTransaction) {
		transactionObject = aTransaction;
	}

	public void generateReport() {
		System.out.println(transactionObject.getName() + " " + transactionObject.getDate() + " "
				+ transactionObject.productBreakdown());
	}
}
