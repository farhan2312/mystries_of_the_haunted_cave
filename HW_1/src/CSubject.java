import java.util.ArrayList;



public class CSubject implements Subject {

	private ArrayList observers;
	public CSubject(){
		observers = new ArrayList();
	}
	public void notifyObservers(int T) 
	{
		for (int i =0; i<observers.size(); i++)
		{
			Observer observer = (Observer)observers.get(i);
			observer.update(T);
		}
	}
	public void registerObserver(Observer o) 
	{
		observers.add(o);
	}
	public void removeObsever(Observer o) 
	{
		int i = observers.indexOf(o);
		if (i>=0) observers.remove(i);
	}
	@Override
	public void notifyObservers(String s) 
	{
		for (int i =0; i<observers.size(); i++)
		{// TODO Auto-generated method stub
		Observer observer = (Observer)observers.get(i);
		observer.update(s);
		}
	}

	
}
