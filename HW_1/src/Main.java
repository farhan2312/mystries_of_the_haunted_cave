import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		weapon hanweapon = new weapon("Blaster","Owned by Han Solo","non-force user weapon");
		ArrayList<weapon> hanweaponlist = new ArrayList();
		hanweaponlist.add(hanweapon);
		ArrayList<gadget> hangadgetlist = new ArrayList();
		human han = new human("Han Solo", "The Millinium Falcon",hanweaponlist,hangadgetlist);


		weapon vaderweapon = new weapon("Red Light Saber","Owned by Darth Vader","Force user weapon");
		ArrayList<weapon> vaderweaponlist = new ArrayList();
		vaderweaponlist.add(vaderweapon);
		gadget vadergadget = new gadget("Way Finder","Owned by Darth Vader","Helps nevigate in space" );
		ArrayList<gadget> vadergadgetlist = new ArrayList();
		vadergadgetlist.add(vadergadget);
		sith darth = new sith("Darth Vader","The Death Star",vaderweaponlist,vadergadgetlist,"Master Emperor Palpatine","Apprentice");


		ArrayList<weapon> leiaweaponlist = new ArrayList();
		gadget leiagadget = new gadget("Data Tape","Owned by Princess Leia Organa","Store encrpted top secret data");
		ArrayList<gadget> leiagadgetlist = new ArrayList();
		leiagadgetlist.add(leiagadget);
		nonforceuser leia = new nonforceuser("Princess Leia Organa","The Death Star",leiaweaponlist,leiagadgetlist);


		weapon obiweapon = new weapon("Blue light Saber","Owned by Obi Van Kanobi","Force user weapon");
		ArrayList<weapon> obiweaponlist = new ArrayList();
		obiweaponlist.add(obiweapon);
		ArrayList<gadget> obigadgetlist = new ArrayList();
		jedi obi = new jedi("Obi Van Kanobi","The Death Star",obiweaponlist,obigadgetlist,"Master Qui-Gon Jinn", "Master");


		weapon lukeweapon = new weapon("Green light Saber","Owned by Luke Skywalker","Force user weapon");
		ArrayList<weapon> lukeweaponlist = new ArrayList();
		lukeweaponlist.add(lukeweapon);
		ArrayList<gadget> lukegadgetlist = new ArrayList();
		jedi luke = new jedi("Luke Skywalker","Planet Tatooine",lukeweaponlist,lukegadgetlist,"Master Obi Van Kanobi", "Apprentice");


		ArrayList<human> falconhumanlist = new ArrayList();
		falconhumanlist.add(han);
		falcon f = falcon.getInstance("The Millennium Falcon",null,null,null,null,null,falconhumanlist, "Planet Tatoonie");


		ArrayList<jedi> deathstarjedilist = new ArrayList();
		deathstarjedilist.add(obi);
		ArrayList<sith> deathstarsithlist = new ArrayList();
		deathstarsithlist.add(darth);
		ArrayList<nonforceuser> deathstarnonforceuserlist = new ArrayList();
		deathstarnonforceuserlist.add(leia);
		weapon Blaster = new weapon("Blaster","Un-owned","non-force user weapon");
		ArrayList<weapon> deathstarweaponlist = new ArrayList();
		deathstarweaponlist.add(Blaster);

		deathstar d = deathstar.getInstance("The Death Star",deathstarweaponlist,null,deathstarjedilist,deathstarsithlist,deathstarnonforceuserlist,null);


		ArrayList<jedi> tatooinejedilist = new ArrayList();
		tatooinejedilist.add(luke);
		gadget teleporter = new gadget("Telportation machine","Unowned","Teleport to any location");
		ArrayList<gadget> tatooniegadgetlist = new ArrayList();
		tatoonie t = tatoonie.getInstance("Planet Tatoonie",null,tatooniegadgetlist,tatooinejedilist,null,null,null);

		//droid R2D2 = new droid("R2D2","on the falcon");


		player me = new player(null,null,null,null);
		UI u = new UI(me);

		u.update("████████████████████████████████████████████████████████████████████████████████\r\n"
				+ "█████████████▀ ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄  ██ ▄▄▄▄▄▄  ██████ ▄▄▄▄▄▄▄▄▄▄▄ ▀██████████\r\n"
				+ "████████████▌ ███████████████████████▌ █ ████ ███ ▐█████ ████▀▀▀▀▀████ █████████\r\n"
				+ "████████████▌ ████▄  █████ ████ ███████  ███  ▐███ █████ ████ ▀▀▀ ████ █████████\r\n"
				+ "██████████████  ████  ████ ████ ███████ ███` █ ████ ████ ███████████▀ ▄█████████\r\n"
				+ "███             █████▌ ███ ████ ██████ ████████████  ███ ████ █████▄,,,,,,  ▐███\r\n"
				+ "███ ▐████████████████ ▐███ ████ █████ ████▀▀▀▀▀▀▀███ ▐██ ████ ▄ ▀██████████▌▐███\r\n"
				+ "███                 ▄█████ ```` ████  ``` ██████ \"\"\"\" ██ ```` ███▄       ███\r\n"
				+ "████  ▄▄▄ ██ ▄▄▄▄ ██      ███ ▄▄▄▄▄▄ ██████▌ ,,,,,,,,,,`▀███████`,▄▄▄▄▄▄▄▄▄ ▐███\r\n"
				+ "█████ ███   ▐█████ ▌ ███ ▐██ ████████ █████▌▐████████████ ▀███▌╒███████████▌▐███\r\n"
				+ "█████  ███  ██████▄ ████ ██ ▐███  ███▄ ████▌▐████ ▄▄▄ ████ ███ ▐████  ▄▄▄▄▄▄▄███\r\n"
				+ "██████ ████████ ███████ ██▌ ███`╓▌ ███ ▐███▌▐████▄▄▄▄████ ▄████▄ ████▄ █████████\r\n"
				+ "███████ ██████  ██████ ███ ████▄▄▄▄████ ███▌▐████▀█████, ▀▀▀▀▀▀▀▀ █████ ▐███████\r\n"
				+ "████████ ████ ██ ████  ██ ████▀▀▀▀██████ ██▌▐████    ███████████████████ ███████\r\n"
				+ "████████  ▀▀ ▄███ ▀▀▀ ██  ▀▀▀ ██████ ▀▀▀  █▌ ▀▀▀  ██▄ ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀ ▄████████\r\n"
				+ "████████████████████████████████████████████████████████████████████████████████");



		synchronized(u)
		{
			u.update(han.name+" is in "+han.location);
			u.update(luke.name+" is on "+luke.location);
			u.update(leia.name+" is in "+leia.location);
			u.update(obi.name+" is on "+obi.location);
			u.update(darth.name+" is on "+darth.location);
			u.update("\n");



			me.location = "Planet Tatoonie";
			ArrayList<weapon> meweaponlist = new ArrayList();
			ArrayList<gadget> megadgetlist = new ArrayList();
			me.gadgetinventory = megadgetlist;
			me.weaponinventory = meweaponlist;
			u.update("Enter your name: ");
			String pname = u.getmessage();
			me.name = pname;
			u.update("Your unique id is: "+me.id);

			R2D2 droid = new R2D2("R2D2","On Millennium Falcon");
			watch w = new watch();

			System.out.print("Enter a command\n>");
			while(true)
			{
				String line = u.getmessage();
				String[] tokens = line.split(" ");
				if(tokens[0].equals("look")) 
				{
					if(me.location.equals("Planet Tatoonie"))
					{
						u.update(t.pic("╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╣╢╣▓▓╣╣▓╣▓▓▓▓▓▓▓▓▓▓╣▓╣▓▓▓▓▓▓▓▓▓▓╬▓▓▓█▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓╣▓╣╣╣╣╣╣╣▓╣▓▓╣▓▓╣╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓╢▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╢▓█████▓╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓╢▓╖╓╟╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████╢▓▓▓▓▓▓▓▓▓▓▓▓▓▓╢▓▓▓▓█▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣▓▓▓▓▓▓▓██▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓▓▓▓▓▀▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓▓████▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\r\n"
								+ "▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒╫▓███████▓▓▓▓▓█▓▓▓▓▓█▓▓▓▓▓▓▓▓███████▓▓▓▓▓▓▓▓▓▓▓█▓▓▓\r\n"
								+ "▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▒░░░▀╨▓█▓██▓╢▓▓▓▓▓▓╫▓▓▓▓█▓▓█▓▓▒║▓▀▀▓████▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓Ñ@╢▓█████▓█▓▓▓███▓▓▓▓██▓▓▓\r\n"
								+ "▓▓▓███▓▓▓▓▓▓▓█▓▓▓▓╣╬▒▒▒╖▒▒▓▓▓▀███▓╫▓█▓▓▓▓▓█▓▒▒▒▀▀▀▓█▓▓╣▓██▓▓▓███▀███▓▓▓█▓██▓▓▓███▓▓▓█▓▓▓▓▓▓█████████\r\n"
								+ "▓▓▒███▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓██████▓▓███▓▓█▓▓╣╣▒▒░░╟████▓▄▓▓▀▀▒▓▓▓█▓▓▓▓▓▓▓▓╣╣╢██▓▓▓▓█▓▓▓▓███████████\r\n"
								+ "▓▓████▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▒▒███▓██▓█████▓▓▓▓╫▒▒╣▒▒█████▓▒▒▒▓▒▒▒╜▒▒▒░▒╣╣╣╢╢▓▓▓█▀▀████████████████\r\n"
								+ "▓╫████▓▓▓▓╢▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣▓▓▓▀██▓@╖▒███████▓█▓▓▓▓▓▓▓█▓▓▓▒╣▌▒▓▒▒▒╩▒▒▓▓▓▓╖▒æ▒▒▒▒║▒▓▓▓▓▓▓▒▒▒▒▒▀█▀▀█▀█▓█\r\n"
								+ "▓▓▓▓▓▓█╣▒▒ ▒▓▓▓▓▓▓▓▓█████▓█████████▓▒▓╣▒▒███▓▓▒▓▓▒▒▒▒▒█▒▒▒▒▒▒╟▓▓██████████▓╨╨╜▓▓▓▓▓▓▓▓█▒▒▒▒▓█▓▒▓████\r\n"
								+ "██████▓██▓▓█▓▒▓▓▓▓▓▓▓██▓▓@▒╖▒▀▀▀████▓██▓▓▓╣▒▓╣▓▓█▓╣▒▓█▓▒▒█▄▄▒▒▓▒▒▒▒▒╢▒▒▒▒░▒@▒▓▓▓▓▓╢▒▓▓▓▓▒▒████████▓▓\r\n"
								+ "▓▓██▒▀████▓▓╣╣╢▒▒╢▒▒▓╣▒▓▓║▓▓▓▓▓▓██▓█▓██▓▓▓▒▒█▒▒▓▌▓▓╣╬╢╣▓▒║▓║▓▒█▒▒▒▀▀▀▀▀▀███▓▓▓█▌▒▓╣░╙╝Ñ╢▓████▓▓▓▓█▓█\r\n"
								+ "▄▓▒▒▓▓██▓██▓▓▓▓╣▓▓▓▓▓▓▓▓▌▓▓▓▓█▓▓█▒▒▒▒▒▒▒▒▒╢╢▒╢╢▒╣╫▒@▓▓▓███████████████║▓▓▓▓█████████▓φm▓▓▓▄████████▓\r\n"
								+ "▓▓▓████████▓██▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▀╣▒▒▒▒▒▒▒▒╢▒▓█▒▒▓██▓▓▓▓▀▀▀█████████████▀▒▒▓▓▓▓█████▓██████▓▓▓▓█████████\r\n"
								+ "▒▓▓████████▓██▓▓▓▓▓▓▓▓▓▓▓║█▓╢╢╢╣╣╢╢╢╢╣╢▓▀▀▀██▒╢╣╣╫╣╬╣▓╣╢▒▒@B@@@@▓▓▓█▓▓▓▓▓▓▓█▓▓█▓▓███▓████▓▓█████████\r\n"
								+ "▓▓▓▓▓▓███▓████▓▓▓▓▓▓▓▓▓▓█▒▒▒╢╣╢╢▒▒▒╢▒▒▒▓▓▒████████▀▒▒▓▓▒▒▒▒▒╢▒╢▓▓╢╫▓▓▓▓▓▓▓▓█████▓██▓██▓███▓▓▓╢▒▒▒▀██\r\n"
								+ "```''\"▀▀▀`▀▀▀▀`▀\"`````````````````````\"'`▀▀▀▀▀▀▀`````\"▀▀▀\"`'`\"▀▀▀'`▀▀▀\"\"`▀'▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\"``\"``````\n"));
						u.update(t.info("Tatooine is harsh desert world orbiting twin suns in the galaxy's "
								+ "Outer Rim. \nIn the days of the Empire and the Republic,"
								+ " many settlers scratched out a \nliving on moisture farms, "
								+ "while spaceport cities such as Mos Eisley \nand Mos Espa served as home base for "
								+ "smugglers, criminals, and other rogues.\n->Luke Skywalker is here \n->The Millennium Falcon is here"));
					}
					else if(me.location.equals("The Death Star"))
					{
						u.update(d.pic("████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "███████████████████████████████████████████▀▀▀▀▀▀▀▀▀▀▀▀▀▀███████████████████████████████████████████\r\n"
								+ "███████████████████████████████████▀▀▒░░░░░░░░;░░░░░\"▒▀╙╨╩╝▀╝█▀█████████████████████████████████████\r\n"
								+ "███████████████████████████████▀▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░p▄▒▒▒▓▓R▓╢▓█▀█████████████████████████████████\r\n"
								+ "████████████████████████████▓▓▓╣╣╢▒▒╢▒▒▒▒▒▒▒▒▒▒▒░░@▒▒▓╬▓█████▓▓▓▓▓▓N▒███████████████████████████████\r\n"
								+ "█████████████████████████▓▓▓▓▓▓▓▓╣╢╣▒╢╣▒▒▒▒▒▒▒▒▒░░▒▒▒░░░▒░░▒▓██▓▓▒ç  ╙╫▀████████████████████████████\r\n"
								+ "███████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓╣║╣╣▒╢╣▒▒▒▒▒▒░░▒▒░░╙░▒[Ü▒▀▀█▀; ~,`▄█████████████████████████████\r\n"
								+ "████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓██▓▓▄▒▒▒▒▒▒░░░░░░░░░░▒╬█▄▌ \"'▀▀▀███████████████████████████\r\n"
								+ "███████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▄▒▒▒░░░░░░░a░▐▀▀██▌▒};.└¼%█████████████████████████\r\n"
								+ "█████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█░░▒░░░░░░]░#H∩æå█▓▓▓▓▓▓▓╬████████████████████████\r\n"
								+ "████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓█░▒▒░░░⌠░░┘▀▀▀▀▀▓▓░▐▓▓▓╠▓║█▓█████████████████████\r\n"
								+ "███████████████▓▓▓▓▓▓▓▓▓▓▓▓▓╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░░░─   ]Mφµ ╖║▓▓▓▓▓▓█████████████████████\r\n"
								+ "█████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╫▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▒▒▒╥Kwε▒▒░░  `\"\"^╜ ▓▓@╣▓▒║▓█████████████████████\r\n"
								+ "████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╢▒▒▒▒▒▒▒▒░░░mW,~,¼Q@╣▓▓▓▓▓▓█████████████████████\r\n"
								+ "███████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╢╫▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒╢╢▒▒▒▒▒▒▒▒▒░▒╜░╙╙╙▀▀▀▀▀▓▓▒▒▓████████████████████\r\n"
								+ "███████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒╫▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣╣╬╣▒▒╢▒▒▒▒▒░░░╣k,░.,.   ▒▓▓█▓▓▓██████████████████\r\n"
								+ "██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒╢╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣▓▓▓╣╢╣╢▒▒▒▒▒▒░░╝▀╜╜║▒▀ë╣\"╙▒███$¢╨─████████████████\r\n"
								+ "██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒╢▒╢╢╣▓▓▓▓▓▓▓▓▓▓▓╣╢╢╣╣╢▒▒▒▒Nm@╦╖╖Å▓µ▒╢@▓▓▓▓▓▓╣^╝\"███████████████\r\n"
								+ "██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓╣╢▒║▒▒▒▒░░▒░░░╜▀░╙╜╢▓║║▓╢▓¢¢HM╦╬█████████████\r\n"
								+ "██████████▓▓╢▓▓▓╬╬▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓█▓▓╣╢▒╢▒╢▒▒░░▒░░░@▒Ä▒▒▀▀▒▓Φ▒║ ╙╨╩┘┴╨▒░▐█████████\r\n"
								+ "██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣╢▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓╢╣▒╢▒▒░░▒▒░░ ░    ^╙░░╨▒┐   `,╗╙  █████████\r\n"
								+ "███████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╬▒▒▒╫▒▒▒▒▒░▒, `¡\"  '╘  ╜ '  `  ░ ▐█████████\r\n"
								+ "████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣╣▒▒▒▒▒▒▒▒╖╥;r░░░, ,╓ ,,, .╖,─;▐█████████\r\n"
								+ "█████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╢▓╣╣▒▒Ü▒▒▒▒▒▒▒░░╖░▒▒╓║▒░░▒░,░▒▒U▌██████████\r\n"
								+ "███████████▓▓███╣▓╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓██████╢╣╢▒║▒╢▒▒▒░▒▓╬▓▓▓███▓╬▓▒▒▌▐║█▓███████████\r\n"
								+ "████████████▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓╣╣▓▓███▓╣▒▓▓▓▓▓▓▄φ@▒▒██▓▓▓█▓▓████████████████████\r\n"
								+ "████████████▓▓███▓▓▓▓╣▓▓╬▓▓█▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓█████████▓███████▓▓▓█▓▓▓▓▓▓████▓▓███████████████\r\n"
								+ "██████████████▓████▓▓███▓▓▓███████▓▓▓▓▓▓▓██▓▓▓█████████████▓▓█▓█▓█▓▓▓▓▓███▓█████████████████████████\r\n"
								+ "███████████████▓████████▓▓███████████▓▓▓▓▓▓▓▓███████████▓▓▓█▓▓█▓▓▓█▓█▓▓▓▓▓▓███▓█████████████████████\r\n"
								+ "████████████████▓▓██████▓╢▓▓▓██████████▓██▓▓████████████▓▓▓▓▓███████▓╫███▓██████████████████████████\r\n"
								+ "█████████████████▓▓████▓▓▓▓▓▓▓█▓█▓▓▓█▓▓▓██▓▓▓▓█████████████▓▓▓▓▓▓█▀▓▓▓▓█████████████████████████████\r\n"
								+ "██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╫▓▓▓▓▓▓▓▓▓▓▓╢▓▓╢╣▓▓▓▓████▓▓▓▓▓▓▓██████████████████████████████████\r\n"
								+ "████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╬▓▓▓▓▓▓▓▓▓▓▓████▓▓▓███████████████████████████████████\r\n"
								+ "███████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣▓▓╢▓╣▓▓▓▓▓███▓▓▓▓▓▓██████████████████████████████████\r\n"
								+ "█████████████████████████▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╣╣▓▓╢╣▓▓█▓███▓▓██████████████████████████████████████\r\n"
								+ "███████████████████████████████▓▓▓▓▓▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████████████████████████████████████\r\n"
								+ "█████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████████████████████████████████████████\r\n"
								+ "█████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓╬▄██████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\n"));
						u.update(d.info("The Death Star was the Empire’s ultimate weapon: "
								+ "\na moon-sized space station with the ability to destroy an entire planet. "
								+ "\nBut the Emperor and Imperial officers like Grand Moff Tarkin underestimated "
								+ "\nthe tenacity of the Rebel Alliance, who refused to bow to this technological terror"
								+ "\n->Darth Vader, Princess Leia and Obi Van Kanobi are here"
								+ "\n->Blaster is here"));//change to display actual inventory status
					}
					else if(me.location.equals("The Millennium Falcon"))
					{
						u.update(f.pic("████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████▀██▀███████████▓▓▓▓▒▒█▀█████████████████████████████████████████████████████████████\r\n"
								+ "██████████████▒▒▒░▒░░▒▒▒░▒▒░▀▀▀▓▓▓▓▓▓╣▓▓▓▒▒▓▒▓▓▓▓▓██▀███████████████████████████████████████████████\r\n"
								+ "████████████████gL░░░║▒▒▒▒░░▒░▒░░░░░▒╙▀▓▓▓▓▓▓▓▓▒▒▓╢▓▓▓▓█▓▓▓█████████████████████████████████████████\r\n"
								+ "███████████▓███▓▀┤░░░▓▓▓▒▓▒▒▒▒▒▒▒▒▒▒▒░░░░▒░╙▒▒▒▓▓W█▓▒▒▒▒█▄▒▒╢▓▓▓▓▓██████████████████████████████████\r\n"
								+ "███████████▓▓▒▒▒▒██▓φ▒▒▒▒╣╣▒▒▒▒▒╫▓█╫▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓█████████▄▒▒▒╫▒▓▓▄▓███▓██████████████████████████\r\n"
								+ "███████████████████▀█▒█▒▒╢╢▓W▒╫╣╣╜▓▓▒███▒▒▒╣╢▒╣▒░▒▒▒▒▓▓▒▓▓▓╣▒▒▒╣╣▒▒▒▒▒▒╟▒▓▀▓████████████████████████\r\n"
								+ "██████████████████▒▒▒▒▒██▒▒╢▒▒▒▒▒▓▓▓@▒▒╙╣╣▓╜░▒▒░░░░░▒░▒▒▒▒▓▓▓▓▓@▓█████▒▒▒░▒▒▒╫▒▓████████████████████\r\n"
								+ "█████████████████▓░▒▒▒██▓██Ñ▒▒▒▒▓▒▓▓▓▓▓▓▒║▒░▒░░░░░░░░░░░░░▒▒▒▒▓╫▓▓██████▒▒▒╫@▄▒▒▒░▒▓▓███████████████\r\n"
								+ "███████████████#▒░░▒░▒░╙▀█▓▒░▄▒▓▓▓▓██▀▒░░▒▒░░░░▒░▒▒░░░▒░░░░░▒▒▒▒▓██▓████╣▒╣▒▒▒▒╫╣Ñ▒░░▒╣█████████████\r\n"
								+ "██████████████╢▒▒╢Ñ▓g▒▒▒▒▒▒▒▒╙▓█▒██▒░▒▒▒▒▒▓░░░▒▒▒░▒░▒╙▓██▄░▒░╟Ü▒▀██████░░░░╩╫▒╢▒▒▒▒Ñ▄░░░▀███████████\r\n"
								+ "████████████▌╣▒▒▒▒▒▀████▒▒▒▒▒░▄█▒▒▒▒╬▓▒▓@▒▒░░▒░▒▒░▒▒░░░░█████████▓▓█▓▒▒▒░▒░░░░╨╣╢▒▓▓▓░▒▒░░░█████████\r\n"
								+ "███████████▓╣▓╫▒▒▒▒▒░▒▒▒░░▒▒████▓█▓▓▒▒▒▒╥▓φ░╓▒▒╫▒▒░░░░░░▒╙███▓▒▀██▓▒▒▒▒░░░░░░ ░░░▀▓▓▓▒▒▒░\\▒░░███████\r\n"
								+ "██████████▓▓▓▓╣╢╢╣▒▒▒▒▒▒▒▒▐████████▓▓▓▓▓▓▒▒▒▄▄█▒░░░▒g░░░░░²▒⌠░░░░░░▀▓╜Ñ▓░░░░░░░   ░░╚▒▒░░░ ░░░██████\r\n"
								+ "█████████████▓▓╬╢▒▒▒▒▒▓╫░░█████████████▌╫█▀▀╩▓╣▓▓▓▓▄╫╫▒▒░░░║▒▒▒▒░░░░░░╖░▒,░ ░▒╖▒╗░░░░░▒╣▒╖▒▒█▓██████\r\n"
								+ "███████████████╣▓▓█▒▒▒▒▄████████████▀▒╜▒▒▒▒▒▒▒▒▒╨▓▀█▒▒░▒▒▒▄█▒▒▒▒▒░░░░░░▒╬w▒░░░▒▓░░░░   ░░▓▓█████████\r\n"
								+ "███████████████▓▓▓███████████████▀▒▒▒░░░░░▒▒▒██▒▒▒▒░░░▀█████▒░░▀▀▀¥░≡w▄▄▓▒▓▒▓░░▒░░░░░░ ░░░░█████████\r\n"
								+ "███████████████████████████████▒▒▒▒▒▒▒▒▒▒▒▒░╙█▓██▒▒░░░░▄m▒░░▒░░░░░░░░░░▒║▒W██▒▄▄▄▄▄▄▄▄▄█████████████\r\n"
								+ "███████████████████████████████▓╢▓▓╣▒▒▒▒▒▒░░░░▒▒░░░░░░░▒█▓██▓█▓████▓█▓▓▓█▓██▓███▀▀▀▓▓▒▄▄████████████\r\n"
								+ "████████████████████████████████▓▓╬▓▓▓▓▒▒▄▄▄▄▓██▓▓█▓███▓▓██▓██████████████▄█████████████████████████\r\n"
								+ "███████████████████████████████████████▓▓▓█▓█▓▓█▓█▓█████████████████████████████████████████████████\r\n"
								+ "███████████████████████████████▓████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\r\n"
								+ "████████████████████████████████████████████████████████████████████████████████████████████████████\n"));
						u.update(f.info("An extensively modified Corellian light freighter,"
								+ " \nthe Millennium Falcon is a legend in smuggler circles and is coveted by many "
								+ "\nfor being the fastest hunk of junk in the galaxy. Despite her humble origins and "
								+ "\nshabby exterior, the ship that made the Kessel Run in less than 12 parsecs has played"
								+ "\na role in some of the greatest victories of the Rebel Alliance and the New Republic. "
								+ "\n->Han Solo is here\n->R2D2 is here"));
					}
				}

				else if(tokens[0].equals("board"))
				{
					if(tokens[1].equals("Millennium"))
					{
						me.location = "The Millennium Falcon";
						u.update("Successfully boarded the Millennium Falcon" );
					}
					else
						u.update("You cannot board "+tokens[1]);
				}

				else if(tokens[0].equals("travel"))
				{
					if(!me.location.equals("The Millennium Falcon"))
					{
						u.update("You need to board the Millennium Falcon");
					}
					else
					{
						if(tokens[2].equals("death"))
						{
							if(me.location.equals("The Death Star"))
							{
								u.update("You are already here");
							}
							else 
							{
								me.location = "The Death Star";
								u.update("Successfully travelled to the Death Star");
							}
						}
						else if(tokens[2].equals("tatoonie"))
						{
							if(me.location.equals("Planet Tatoonie"))
							{
								u.update("You are already here");
							}
							else
							{
								me.location = "Planet Tatoonie";
								u.update("Successfully travelled to Planet Tatoonie");
							}
						}
						else
							u.update("Cannot travel here");
					}
				}
				else if(tokens[0].equals("aquire"))
				{
					if(tokens[1].equals("blaster"))
					{
						if(me.location.equals("The Death Star"))
						{
							if(d.looseweapons.get(0).name.equals("Blaster"))
							{
								me.weaponinventory.add(Blaster);
								d.looseweapons.remove(0);
								Blaster.status = "Owned by player "+pname;
								u.update("Blaster added to inventory");
							}
							else
								u.update("Weapon not available here");
						}
						else
							u.update("Weapon not available here");
					}

					else if(tokens[1].equals("data"))
					{
						if(me.location.equals("The Death Star"))
						{
							if(leia.gadgetinventory.get(0).name.equals("Data Tape"));
							{
								me.gadgetinventory.add(leiagadget);
								leia.gadgetinventory.remove(0);
								leiagadget.status = "Owned by player "+pname;
								u.update("Data Tape added to inventory");
							}

						}
						else
							u.update("Weapon not available here");
					}
					else
						u.update("Device/Weapon not available to aquire");

				}
				else if(tokens[0].equals("exit"))
				{
					u.update("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx GAME OVER xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
					System.exit(0);
				}
				else if(tokens[0].equals("meet"))
				{
					if(tokens[1].equals("luke"))
					{
						if(me.location.equals("Planet Tatoonie"))
						{
							u.update( luke.lightforce("                      ,▄                                ▀▄\r\n"
									+ "                    ,█▀                                  ▀█▄\r\n"
									+ "                  ,███                                    ▐██▄\r\n"
									+ "                 ▄███                                      ████\r\n"
									+ "                █████                   ⌐                  █████\r\n"
									+ "               ██████▌                 ▐▌                  ██████\r\n"
									+ "              ▐███████                 ▐▌                 ███████▌\r\n"
									+ "          ╒▌  █████████                ▐▌                ▄████████   ▄\r\n"
									+ "          █U  ██████████               ▐▌               ▄█████████U  █µ\r\n"
									+ "         ▐█U  ███████████▄             ▐▌             ,███████████▌  ██\r\n"
									+ "         ██▌  ████████████▄            ▐█            ▄████████████U  ██\r\n"
									+ "         ██▌  █████████████            ██            █████████████  ▐██\r\n"
									+ "         ███⌐  ███████████             ██             ███████████▌  ███\r\n"
									+ "         ████⌐ ▐█████████▀             ██              █████████▌  ████\r\n"
									+ "         ▐████▄ ▀████████              ██              ▐████████ ,█████\r\n"
									+ "          ██████,▐██████▌              ██               ███████ ▄█████\"\r\n"
									+ "          └█████████████U              ██               █████████████▀\r\n"
									+ "         ▐,╙████████████▌          ▐▄  ██  ▄\"           ████████████▀ ▌\r\n"
									+ "          ▀▄ ███████████▌           ▐██████`           ▐███████████`▄█\r\n"
									+ "           ▀█▄███████████        ,▄▄▄██████▄▄▄,        ███████████▄█▀\r\n"
									+ "            `█████████████      `▀▀▀▀██████▀▀▀▀`      ▄████████████▀\r\n"
									+ "              ▀████████████         ▄████▀█▄         ████████████▀\r\n"
									+ "                ▀███████████▄      ²   ██   ─      ▄████████████\r\n"
									+ "                  ▀███████████▄        ██        ▄███████████▀\r\n"
									+ "                     ▀███████████▄,   ▐██U   ,▄███████████▀`\r\n"
									+ "                        ▀▀███████████▄████▄███████████▀▀\r\n"
									+ "                             ▀▀▀████████████████▀▀▀\r\n\n"));
							u.update(luke.info("Hi "+pname+", I am Luke Skywalker, I am a jedi apprentice. "
									+ "Nice to meet you. you can have my light saber"));
							luke.weaponinventory.remove(0);
							me.weaponinventory.add(lukeweapon);


						}
						else
							u.update("Luke Skywalker is not here; He is on planet Tatoonie");
					}
					else if (tokens[1].equals("han"))
					{
						if(me.location.equals("The Millennium Falcon"))
						{
							u.update(han.info("Hi "+pname+", I am Han Solo and like you i am a human however I like to summggel for the aleins.(He He)"));
						}
						else
							u.update("Han Solo is not here, he is on The Millennium Falcon");
					}
					else if (tokens[1].equals("leia"))
					{
						if(me.location.equals("The Death Star"))
						{
							u.update( leia.lightforce("                      ,▄                                ▀▄\r\n"
									+ "                    ,█▀                                  ▀█▄\r\n"
									+ "                  ,███                                    ▐██▄\r\n"
									+ "                 ▄███                                      ████\r\n"
									+ "                █████                   ⌐                  █████\r\n"
									+ "               ██████▌                 ▐▌                  ██████\r\n"
									+ "              ▐███████                 ▐▌                 ███████▌\r\n"
									+ "          ╒▌  █████████                ▐▌                ▄████████   ▄\r\n"
									+ "          █U  ██████████               ▐▌               ▄█████████U  █µ\r\n"
									+ "         ▐█U  ███████████▄             ▐▌             ,███████████▌  ██\r\n"
									+ "         ██▌  ████████████▄            ▐█            ▄████████████U  ██\r\n"
									+ "         ██▌  █████████████            ██            █████████████  ▐██\r\n"
									+ "         ███⌐  ███████████             ██             ███████████▌  ███\r\n"
									+ "         ████⌐ ▐█████████▀             ██              █████████▌  ████\r\n"
									+ "         ▐████▄ ▀████████              ██              ▐████████ ,█████\r\n"
									+ "          ██████,▐██████▌              ██               ███████ ▄█████\"\r\n"
									+ "          └█████████████U              ██               █████████████▀\r\n"
									+ "         ▐,╙████████████▌          ▐▄  ██  ▄\"           ████████████▀ ▌\r\n"
									+ "          ▀▄ ███████████▌           ▐██████`           ▐███████████`▄█\r\n"
									+ "           ▀█▄███████████        ,▄▄▄██████▄▄▄,        ███████████▄█▀\r\n"
									+ "            `█████████████      `▀▀▀▀██████▀▀▀▀`      ▄████████████▀\r\n"
									+ "              ▀████████████         ▄████▀█▄         ████████████▀\r\n"
									+ "                ▀███████████▄      ²   ██   ─      ▄████████████\r\n"
									+ "                  ▀███████████▄        ██        ▄███████████▀\r\n"
									+ "                     ▀███████████▄,   ▐██U   ,▄███████████▀`\r\n"
									+ "                        ▀▀███████████▄████▄███████████▀▀\r\n"
									+ "                             ▀▀▀████████████████▀▀▀\r\n\n"));
							u.update(leia.info("Hello "+pname+", I am princess Leia, please protect me from Darth vader...."));
							u.update("Princess leia has the Data Tape");

						}
						else
							u.update("Princess Leia is not here, she is on The Death star");
					}
					else if (tokens[1].equals("obi"))
					{
						if(me.location.equals("The Death Star"))
						{
							u.update( obi.lightforce("                      ,▄                                ▀▄\r\n"
									+ "                    ,█▀                                  ▀█▄\r\n"
									+ "                  ,███                                    ▐██▄\r\n"
									+ "                 ▄███                                      ████\r\n"
									+ "                █████                   ⌐                  █████\r\n"
									+ "               ██████▌                 ▐▌                  ██████\r\n"
									+ "              ▐███████                 ▐▌                 ███████▌\r\n"
									+ "          ╒▌  █████████                ▐▌                ▄████████   ▄\r\n"
									+ "          █U  ██████████               ▐▌               ▄█████████U  █µ\r\n"
									+ "         ▐█U  ███████████▄             ▐▌             ,███████████▌  ██\r\n"
									+ "         ██▌  ████████████▄            ▐█            ▄████████████U  ██\r\n"
									+ "         ██▌  █████████████            ██            █████████████  ▐██\r\n"
									+ "         ███⌐  ███████████             ██             ███████████▌  ███\r\n"
									+ "         ████⌐ ▐█████████▀             ██              █████████▌  ████\r\n"
									+ "         ▐████▄ ▀████████              ██              ▐████████ ,█████\r\n"
									+ "          ██████,▐██████▌              ██               ███████ ▄█████\"\r\n"
									+ "          └█████████████U              ██               █████████████▀\r\n"
									+ "         ▐,╙████████████▌          ▐▄  ██  ▄\"           ████████████▀ ▌\r\n"
									+ "          ▀▄ ███████████▌           ▐██████`           ▐███████████`▄█\r\n"
									+ "           ▀█▄███████████        ,▄▄▄██████▄▄▄,        ███████████▄█▀\r\n"
									+ "            `█████████████      `▀▀▀▀██████▀▀▀▀`      ▄████████████▀\r\n"
									+ "              ▀████████████         ▄████▀█▄         ████████████▀\r\n"
									+ "                ▀███████████▄      ²   ██   ─      ▄████████████\r\n"
									+ "                  ▀███████████▄        ██        ▄███████████▀\r\n"
									+ "                     ▀███████████▄,   ▐██U   ,▄███████████▀`\r\n"
									+ "                        ▀▀███████████▄████▄███████████▀▀\r\n"
									+ "                             ▀▀▀████████████████▀▀▀\r\n\n"));
							u.update(obi.info("Hello "+pname+", I am Master obi van kanobi, Help us escape from the death star"));
						}
						else
							u.update("Obi van kanobi is not here, he is on The Death star");
					}
					else if (tokens[1].equals("darth"))
					{
						if(me.location.equals("The Death Star"))
						{
							u.update(darth.darkforce("                                      ,▄▄▄\r\n"
									+ "                                  ,▄████████▄,\r\n"	
									+ "                               ▄▄██████▀▀███████▄\r\n"			
									+ "                           ▄▄██████▀▀      ▀▀██████▄▄\r\n"
									+ "                       ▄▄██████▀▀`             ▀▀██████▄▄\r\n"					
									+ "                      ▀█████▀       ,▄████▄▄       ▀▀█████\r\n"						
									+ "               ,▄███   ▀▀└       ▄████████████▄       ¬▀▀   ▄██▄,\r\n"						
									+ "            ▄▄██████▀        ▄▄███▀▀████████▌▀███▄▄        ▀███████▄\r\n"						
									+ "        ▄▄██████▀▀           ▀▀▀    ████████`    ▀▀           ▀▀██████▄▄\r\n"						
									+ "    ▄▄██████▀▀                      ████████                      ▀▀██████▄▄\r\n"						
									+ " ▄██████▀▀-       ▄▄█▄              ▐███████              ,██▄        ▀▀██████▄\r\n"							
									+ " ████▀`      ,▄████▀                ▐██████▌               `▀▀███▄,      -▀████▌\r\n"							
									+ " ████    ,▄██████                    ██████                    ▄█████▄;    ▐███▌\r\n"						
									+ " ████    ██████████▄                 ██████                 ▄██████████    ▐███▌\r\n"							
									+ " ████    █████████████▄              ▐█████              ▄█████████████    ▐███▌\r\n"						
									+ " ████    ████████████████▄        ,▄████████▄▄        ▄████████████████    ▐███▌\r\n"		
									+ " ████    ██▌ \"▀▀████████████▄ ,▄████████████████▄, ▄████████████▀▀▀ ▐██    ▐███▌\r\n"		
									+ " ████    ▐█▌      \"▀▀██████████████████████████████████████▀▀▀      ▐██    ▐███▌\r\n"			
									+ " ████    ▐█▌           \"▀▀████████████████████████████▀▀▀           ▐█▌    ▐███▌\r\n"			
									+ " ████                      ██████████████████████████                      ▐███▌\r\n"
									+ " ---└                      ██████████████████████████                       ---;;;, \r\n     "
									+ "                           ██████████████████████████                      ,;;;\r\n"
									+ " ████                      ██████████████████████████                      ▐███▌\r\n"	
									+ " ████    ▐█▌            ▄▄████████████████████████████▄▄,           ▐█▌    ▐███▌\r\n"			
									+ " ████    ▐█▌       ▄▄██████████████████████████████████████▄▄,      ▐██    ▐███▌\r\n"						
									+ " ████    ██▌  ▄▄████████████▀`-▀▀███████████████▀--▀████████████▄▄, ▐██    ▐███▌\r\n"						
									+ " ████    ████████████████▀-       `▀████████▀`       -▀████████████████    ▐███▌\r\n"						
									+ " ████    █████████████▀-             ▐█████             -▀█████████████    ▐███▌\r\n"							
									+ " ████    ██████████▀-                ██████                -▀██████████    ▐███▌\r\n"						
									+ " ████    ▀▀██████-                   ██████                   -▀█████▀▀    ▐███▌\r\n"					
									+ " ████▄,      `▀████▄                ▐██████▌                ▄▄███▀`      ,▄████▌\r\n"					
									+ " ▀███████▄        ▀██▀              ▐██████▌              '██▀        ▄▄██████▀`\r\n"						
									+ "    ▀▀██████▄▄                      ████████                      ▄▄██████▀▀\r\n"						
									+ "        ▀▀██████▄▄           ▄▄;    ████████    ,▄▄           ▄▄██████▀▀-\r\n"
									+ "           -▀▀██████▄        ▀▀███▄▄████████▌▄███▀▀        ▄███████▀`\r\n"
									+ "                ▀███   ▄▄,      -▀████████████▀-      ,▄▄   ▀██▀\r\n"					
									+ "                      ██████▄       ▀▀████▀▀       ▄▄█████\r\n"							
									+ "                       `▀███████▄      ``      ▄▄██████▀▀\r\n"						
									+ "                           ▀▀██████▄▄      ▄▄██████▀▀`\r\n"			
									+ "                               ▀▀██████▄▄███████▀\r\n"
									+ "                                  -▀████████▀└\r\n"
									+ "                                      '▀▀▀"));
							u.update(darth.info("Who are you and why have u come here??"));
						}
						else
							u.update("Darth Vader is not here, he is on The Death star");
					}
					else
						u.update("You do not have the clearance to meet "+tokens[1]);

				}
				else if(tokens[0].equals("fight"))
				{
					if(tokens[1].equals("darth"))
					{
						if(me.location.equals("The Death Star"))
						{
							if(me.weaponinventory.isEmpty())
							{
								u.update("You do not have weapons to fight the Darth Vader");
							}
							else
							{
								u.update("You have defeted darth vader and taken his light saber");
								darth.weaponinventory.remove(0);
								me.weaponinventory.add(vaderweapon);
							}
						}
						else
							u.update("Darth vader is not here, He is on the Death Star");
					}
					else
						u.update(tokens[1]+" does not want to fight you");
				}
				else if(tokens[0].equals("inventory"))
				{
					if(me.gadgetinventory.isEmpty())
					{
						u.update("you do not have any gadgets");
					}
					else
						for(int i= 0;i<me.gadgetinventory.size();i++)
						{
							u.update("->"+me.gadgetinventory.get(i).name);
						}
					if(me.weaponinventory.isEmpty())
					{
						u.update("you do not have any weapons");
					}
					else
						for(int i= 0;i<me.weaponinventory.size();i++)
						{
							u.update("->"+me.weaponinventory.get(i).name);
						}
				}
				else if(tokens[0].equals("decode"))
				{
					if(me.location.equals("The Millennium Falcon"))
					{
						if(me.gadgetinventory.get(0).name.equals("Data Tape"))
						{						
							u.update("Decoding data tape please wait........");
							droid.decode();
							
						}
						else
							u.update("You do not have the data tape get it from princess leia");
					}
					else 
						u.update("You need an R2D2 droid to decode the data tape there is one unit on The Millennium Falcon");
				}
				
				else if(tokens[0].equals("initiate"))
				{
					u.update("Enter the pin:");
					String check = u.getmessage();
					if(check.equals(d.Acode))
					{
						u.update("Pin code correct self distruct sequence initiated");
						
					}
					else
					{
						u.update("incorrect pin code! INTRUDER ALERT!!!!!");
						darth.info("Darth Vader: Kill the intruders!!!");
						u.update("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx GAME OVER xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.exit(0);
					}
				}
				
				else 
					u.update("Unknown command "+tokens[0]+"	Try  ->look<-");


				System.out.print(">");
			}


		}
	}
}
