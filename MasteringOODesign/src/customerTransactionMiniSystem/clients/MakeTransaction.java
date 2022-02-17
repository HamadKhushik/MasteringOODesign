package customerTransactionMiniSystem.clients;

import java.util.ArrayList;
import java.util.List;

import customerTransactionMiniSystem.AccountsReceivable;
import customerTransactionMiniSystem.Customer;
import customerTransactionMiniSystem.CustomerTransaction;
import customerTransactionMiniSystem.Product;
import customerTransactionMiniSystem.ReportGenerator;

/**
 * Runner Code for the Mini Customer Transaction System
 * 
 * @author Hammad: 17-Feb-2022
 */
public class MakeTransaction {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(13, "First Product"));
		products.add(new Product(14, "Second Product"));
		CustomerTransaction transaction = new CustomerTransaction(new Customer("Peggy"), products);
		AccountsReceivable account = new AccountsReceivable(transaction);

		System.out.println("**************Accounts************");
		account.postPayment();
		account.sendInvoice();

		System.out.println("\n**********Reporting*************");
		ReportGenerator reportGenerator = new ReportGenerator(transaction);
		reportGenerator.generateReport();
	}
}
