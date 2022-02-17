package customerTransactionMiniSystem;

import java.util.Date;
import java.util.List;

/**
 * @author Hammad: 17-Feb-2022
 */
public class CustomerTransaction implements Accounting, Reporting {

	private Customer customer;
	private List<Product> products;

	public CustomerTransaction(Customer customer, List<Product> products) {
		super();
		this.customer = customer;
		this.products = products;
	}

	public String getName() {
		return customer.getName();
	}

	public Date getDate() {
		return new Date();
	}

	public String productBreakdown() {
		String reportListing = "";
		for (Product product : products) {
			reportListing += " | " + product.getProductName() + " | ";
		}
		return reportListing;
	}

	public void prepareInvoice() {
		System.out.println("Prepared Invoice!");
	}

	public void chargeCustomer() {
		System.out.println("Charged Customer...");
	}
}
