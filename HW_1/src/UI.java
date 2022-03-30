import java.util.Scanner;


public class UI extends Cobserver{

	Subject subject;
	public UI(Subject subject) {
		super(subject);
		this.subject = subject;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated constructor stub
		System.out.println(message);
	}

	@Override
	public void update(int T) {
		// TODO Auto-generated constructor stub
		System.out.println(T);
	}
	
	public String getmessage()
	{
		Scanner scan=new Scanner(System.in);
		scan.hasNext();
		return scan.nextLine();
	}
	
}
