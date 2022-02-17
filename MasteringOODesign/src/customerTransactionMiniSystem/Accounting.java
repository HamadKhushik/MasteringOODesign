package customerTransactionMiniSystem;

/**
 * Interface for Accounting to implement Interface Segregation To remove the
 * Dependency of Accounting Client from Reporting Client
 * 
 * @author Hammad: 17-Feb-2022
 */
public interface Accounting {

	public void chargeCustomer();

	public void prepareInvoice();
}
