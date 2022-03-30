import java.util.ArrayList;

public class jedi extends forceuser implements about, lightforce{
	String ranking;

	public jedi(String name, String location, ArrayList<weapon> weaponinventory, ArrayList<gadget> gadgetinventory, String trainedby,String ranking) {
		super(name, location, weaponinventory, gadgetinventory, trainedby);
		this.ranking  = ranking;
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
		return side;
	}

	

}
