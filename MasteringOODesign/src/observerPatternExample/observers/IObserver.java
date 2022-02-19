package observerPatternExample.observers;

import observerPatternExample.domain.Employee;

/**
 * @author Hammad: 19-Feb-2022
 */
public interface IObserver {

	void callMe(Employee employee, String msg);
}
