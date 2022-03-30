import java.util.ArrayList;

public class R2D2 extends object implements Runnable{

	player p = new player(null,null, null, null);
	UI u = new UI(p);
	Thread t = new Thread(this);
	public R2D2(String name, String status)
	{
		super(name, status);
		
	
	}

	public void decode()
	{	t.start();
		u.update("Pin is: 12 34 88 91");
	}

	boolean flag = true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(flag)
		{
			synchronized(u)
			{
				try {
					Thread.sleep(60000);
					decode();
					flag = false;
					notifyObservers("Decoded...");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
