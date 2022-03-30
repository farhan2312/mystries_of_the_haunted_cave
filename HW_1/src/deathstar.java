import java.util.ArrayList;

public class deathstar extends CSubject implements picture, about{
	
	private static deathstar instance;
	
	ArrayList<weapon> looseweapons = new ArrayList();
	ArrayList<gadget> loosegadgets = new ArrayList();
	ArrayList<jedi> j = new ArrayList();
	ArrayList<sith> s = new ArrayList();
	ArrayList<nonforceuser> nf = new ArrayList();
	ArrayList<human> h = new ArrayList();
	String name;
	String Acode;

	private deathstar(String name, ArrayList<weapon> looseweapons, ArrayList<gadget> loosegadgets, 
			ArrayList<jedi> j, ArrayList<sith> s, ArrayList<nonforceuser> nf, ArrayList<human> h )
	{
		this.name = name;
		this.looseweapons = looseweapons;
		this.loosegadgets = loosegadgets;
		this.j = j;
		this.s = s;
		this.nf = nf;
		this.h = h;
		this.Acode = "12 34 88 91";
	}

	public static deathstar getInstance(String name, ArrayList<weapon> looseweapons, ArrayList<gadget> loosegadgets, 
			ArrayList<jedi> j, ArrayList<sith> s, ArrayList<nonforceuser> nf, ArrayList<human> h){
	      instance = new deathstar(name, looseweapons, loosegadgets,j,s,nf,h);
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
	
	
	public String selfd(String code)
	{
		if(Acode.equals(code))
		{
			return "Success ! You have destroyed the Death Star";
		}
		else
			return "Incorrect Code; INTRUDER ALERT!!!!!";
	}
	
}
