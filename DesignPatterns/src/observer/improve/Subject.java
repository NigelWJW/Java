package observer.improve;

/**
 * 发出者的接口类
 */
//接口, 让WeatherData 来实现 
public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
