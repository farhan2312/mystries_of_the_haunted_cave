import java.util.ArrayList;

class falcon extends CSubject implements picture, about {

	private static falcon instance;
		
	ArrayList<weapon> looseweapons = new ArrayList();
	ArrayList<gadget> loosegadgets = new ArrayList();
	ArrayList<jedi> j = new ArrayList();
	ArrayList<sith> s = new ArrayList();
	ArrayList<nonforceuser> nf = new ArrayList();
	ArrayList<human> h = new ArrayList();
	String name;
	String location;
	
	
	private falcon(String name, ArrayList<weapon> looseweapons, ArrayList<gadget> loosegadgets, 
			ArrayList<jedi> j, ArrayList<sith> s, ArrayList<nonforceuser> nf, ArrayList<human> h, String location )
	{
		this.name = name;
		this.looseweapons = looseweapons;
		this.loosegadgets = loosegadgets;
		this.j = j;
		this.s = s;
		this.nf = nf;
		this.h = h;
		this.location = location;
	}

	public static falcon getInstance(String name, ArrayList<weapon> looseweapons, ArrayList<gadget> loosegadgets, 
			ArrayList<jedi> j, ArrayList<sith> s, ArrayList<nonforceuser> nf, ArrayList<human> h, String location){
		instance = new falcon(name,looseweapons,loosegadgets,j,s,nf,h,location);
	      return instance;
	   }
	
	@Override
	public String info(String abt) {
		// TODO Auto-generated method stub
		return abt;
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

	@Override
	public String pic(String photo) {
		// TODO Auto-generated method stub
		return photo;
	}


}
