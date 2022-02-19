package observerPatternExample.observers;

import observerPatternExample.domain.Employee;

/**
 * @author Hammad: 19-Feb-2022
 */
public class PayrollDepartment implements IObserver {

	@Override
	public void callMe(Employee emp, String msg) {
		System.out.println(msg);
		System.out.println("Payroll department notified...");
	}

}
