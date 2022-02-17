package customerTransactionMiniSystem;

import java.util.Date;

/**
 * Interface for Reporting to implement Interface Segregation To separate
 * Accounting Client from Reporting Client
 * 
 * @author Hammad: 17-Feb-2022
 */
public interface Reporting {

	public String getName();

	public Date getDate();

	public String productBreakdown();
}
