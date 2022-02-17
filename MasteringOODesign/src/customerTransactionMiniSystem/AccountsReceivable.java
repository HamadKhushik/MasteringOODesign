package customerTransactionMiniSystem;

/**
 * @author Hammad: 17-Feb-2022
 */
public class AccountsReceivable {

	private Accounting transactionObject;

	public AccountsReceivable(CustomerTransaction aTransaction) {
		transactionObject = aTransaction;
	}

	public void postPayment() {
		transactionObject.chargeCustomer();
	}

	public void sendInvoice() {
		transactionObject.prepareInvoice();
		// sends the invoice
	}

}
