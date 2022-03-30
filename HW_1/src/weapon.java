
public class weapon extends object {
	
	String type;//type of weapon(lightsaber if a force user / blaster non force user)
	 public weapon(String name, String status, String type)
	 {
		 super(name, status);
		 this.type = type;
	 }
	
}
