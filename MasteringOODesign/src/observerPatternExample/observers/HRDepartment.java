package observerPatternExample.observers;

import observerPatternExample.domain.Employee;

/**
 * @author Hammad: 19-Feb-2022
 */
public class HRDepartment implements IObserver {

	@Override
	public void callMe(Employee emp, String msg) {
		System.out.println(msg);
		System.out.println("HR Department called...");
	}
}
