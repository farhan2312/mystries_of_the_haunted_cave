
public class watch extends CSubject implements Runnable{

	player p = new player(null,null, null, null);
	UI u = new UI(p);
	int n=5;
	public watch()
	{
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		while(n>0)
		{
			synchronized(u)
			{
				u.update(">"+n+" minutes remaining");
				n--;
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}		
		u.update("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx GAME OVER xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.exit(0);
	}

}
