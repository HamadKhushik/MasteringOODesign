package observerPatternExample.subjects;

import observerPatternExample.observers.IObserver;

/**
 * @author Hammad: 19-Feb-2022
 */
public interface ISubject {

	public void registerObserver(IObserver o);

	public void removeObserver(IObserver o);

	public void notifyObservers();

}
