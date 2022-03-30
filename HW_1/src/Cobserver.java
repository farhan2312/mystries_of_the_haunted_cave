

public class Cobserver implements Observer{

	
	private Subject subject;
	public Cobserver(Subject subject)
	{
	this.subject = subject;
	subject.registerObserver(this);
	}
	
	@Override
	public void update(String name) {
		System.out.println("Do nothing from "+this);
		
	}

	@Override
	public void update(int month) {
		
		System.out.println("Do nothing from "+this);
	}

}
