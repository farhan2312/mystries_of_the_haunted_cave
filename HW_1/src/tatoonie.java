import java.util.ArrayList;

public class tatoonie extends CSubject implements picture, about{
	
	private static tatoonie instance = new tatoonie(null, null, null, null, null, null, null);
	
	ArrayList<weapon> looseweapons = new ArrayList();
	ArrayList<gadget> loosegadgets = new ArrayList();
	ArrayList<jedi> j = new ArrayList();
	ArrayList<sith> s = new ArrayList();
	ArrayList<nonforceuser> nf = new ArrayList();
	ArrayList<human> h = new ArrayList();
	String name;
	
	private tatoonie(String name, ArrayList<weapon> looseweapons, ArrayList<gadget> loosegadgets, 
			ArrayList<jedi> j, ArrayList<sith> s, ArrayList<nonforceuser> nf, ArrayList<human> h )
	{
		this.name = name;
		this.looseweapons = looseweapons;
		this.loosegadgets = loosegadgets;
		this.j = j;
		this.s = s;
		this.nf = nf;
		this.h = h;
	}
	
	public static tatoonie getInstance(String name, ArrayList<weapon> looseweapons, ArrayList<gadget> loosegadgets, 
			ArrayList<jedi> j, ArrayList<sith> s, ArrayList<nonforceuser> nf, ArrayList<human> h){
		instance = new tatoonie(name, looseweapons, loosegadgets,j,s,nf,h);
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
