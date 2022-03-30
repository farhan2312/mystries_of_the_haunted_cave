import java.util.ArrayList;

public class human extends character implements about{
	
	public human(String name, String location, ArrayList<weapon> weaponinventory, ArrayList<gadget> gadgetinventory)
	{
		super(name,location,weaponinventory, gadgetinventory);
	}

	@Override
	public String info(String abt) {
		// TODO Auto-generated method stub
		return abt;
	}

	@Override
	public String pic(String photo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lightforce(String side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String darkforce(String side) {
		// TODO Auto-generated method stub
		return null;
	}

}
