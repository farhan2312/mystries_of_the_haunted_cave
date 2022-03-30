import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

public class player extends character{
	public int id;
	
	public player(String name, String location, ArrayList<weapon>weaponinventory, ArrayList<gadget> gadgetinventory)
	{
		super(name, location, weaponinventory, gadgetinventory );
		Random rand = new Random();
		this.id = rand.nextInt(10000); 

	}
}
