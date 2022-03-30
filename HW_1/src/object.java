
public abstract class object extends CSubject{
	String name;
	String status;//open to take for all or owned by someone

	
	public object()
	{
		this.name = null;
		this.status  = "available";
	}
	
	public object(String name, String status)
	{
		this.name = name;
		this.status = status;
	}
}
