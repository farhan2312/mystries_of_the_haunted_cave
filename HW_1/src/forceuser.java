import java.util.ArrayList;

public abstract class forceuser extends forcesensitiveuser
{
	String trainedby;

	public forceuser(String name, String location, ArrayList<weapon> weaponinventory, ArrayList<gadget> gadgetinventory, String trainedby) {
		super(name, location, weaponinventory, gadgetinventory);
		this.trainedby = trainedby;
		// TODO Auto-generated constructor stub
	} 	

}
