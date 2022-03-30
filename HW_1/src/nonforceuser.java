import java.util.ArrayList;

public class nonforceuser extends forcesensitiveuser implements about
{

	public nonforceuser(String name, String location, ArrayList<weapon> weaponinventory,
			ArrayList<gadget> gadgetinventory) {
		super(name, location, weaponinventory, gadgetinventory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String info(String abt) {
		// TODO Auto-generated method stub
		return abt;
	}

	@Override
	public String pic(String photo) {
		// TODO Auto-generated method stub
		return photo;
	}

	@Override
	public String lightforce(String side) {
		// TODO Auto-generated method stub
		return side;
	}

	@Override
	public String darkforce(String side) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
