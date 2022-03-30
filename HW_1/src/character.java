
import java.util.ArrayList;

public abstract class character extends CSubject{
	
	public String name;
	public String location;
	public ArrayList<weapon> weaponinventory = new ArrayList();
	public ArrayList<gadget> gadgetinventory = new ArrayList();

	public character(String name, String location, ArrayList<weapon>weaponinventory, ArrayList<gadget> gadgetinventory)
	{
		this.name = name;
		this.location = location;
		this.weaponinventory = weaponinventory;
		this.gadgetinventory = gadgetinventory;
	}
}