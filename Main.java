package WorkersCalendar;

import java.util.Scanner;

import WorkersData.AidenHenderson;
import WorkersData.AmeliaPrice;
import WorkersData.AvaThompson;
import WorkersData.EthanBennett;
import WorkersData.HarperCooper;
import WorkersData.IsabellaFoster;
import WorkersData.James;
import WorkersData.LiamParker;
import WorkersData.LucasEvans;
import WorkersData.MasonRamirez;
import WorkersData.MiaCarter;
import WorkersData.NoahBrooks;
import WorkersData.OliverSanchez;
import WorkersData.OliviaMorgan;
import WorkersData.SophiaMitchell;

public class Main {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);		
		LoginDetails detail = null;
		int reset = 1234;
		
		
		
		//All is left is Display Data

		/*
		 * YADI YADA USER CONVERSATION
		 * djjjjjjkdjfngkssllllllsaasfffffffffffueeeeeeeeeeeeeeeefjgnjre
		 * jddddddddddddcnfufhhhhhsoiwjjjjjjjjjjjfbhhhhhhhhhhhakjwndje
		 * jddjljjjjjjjjncoooooooowseijooooooooooobguogtte
		 * jdx,aanccqcapp[aweoj459888888eoi3wie8888888339033348'3ee845
		 */
		
		// Not Needed since i still need all three either way.
		/*
		System.out.println("Would you like to login using: ");
		System.out.println("a) Name and Password");
		System.out.println("b) Email and Password");
		String login = keyboard.next();
		*/
		
		String login1 = null;
		String login2 = null;
		String login3 = null;
		
		
		try {
		
			System.out.println("Input name");
			 login1 = keyboard.next();
			 
			System.out.println("Input email");
			login2 = keyboard.next();
			
			System.out.println("a) Input password or (b) Forgot Password");
			String ans1 = keyboard.next();
			
			
	      
		
		switch(ans1) {
		case "a":
			System.out.println("Ok");
			break;
		  case "b":
			  System.out.println("Pls Enter Your Email: ");
				String ans2 = keyboard.next();
				if (ans2.equals(detail.getemail())) {
					System.out.println("Pls Input 4-Digit Reset Code: ");
					int ans3 = keyboard.nextInt();
					if (ans3 == reset) {
						System.out.println("Confirmed");
						Thread.sleep(1000);
						System.out.println("Fetching Password......");
						Thread.sleep(1000);
						System.out.println(detail.getpassword());
						System.out.println("Thank You This Program will End Now");
						System.exit(0);
					}
					else {
						throw new Exception();
					}
					
				}
				else {
					throw new Exception();
				}
		    break;
		  default:
			  System.out.println("Sorry Invalid Input.......");
		   throw new Exception();
		}
		
		System.out.println("Input password: ");
		
		
		  login3 = keyboard.next();	
			
			switch(login1) {
			case "James":
			 detail = new LoginDetails("James", "bellnewtech@gmail.com", "TOMIbell@2007");
			 break;
			case "LiamParker":
				detail = new LoginDetails("LiamParker", "liam.parker@example.com", "LiamParker#123");
				break;
			case "AvaThompson":
				detail = new LoginDetails("AvaThompson", " ava.thompson@example.com", "AvaThompson#456");
				break;
			case "MasonRamirez":
				detail = new LoginDetails("MasonRamirez", "mason.ramirez@example.com", "MasonRamirez#789");
				break;
			case "IsabellaFoster":
				detail = new LoginDetails("IsabellaFoster", "isabella.foster@example.com", "IsabellaFoster#987");
				break;
			case "NoahBrooks":
				detail = new LoginDetails("NoahBrooks", "noah.brooks@example.com", "NoahBrooks#654");
				break;
			case "OliviaMorgan":
				detail = new LoginDetails("OliviaMorgan", "olivia.morgan@example.com", "OliviaMorgan#321");
				break;
			case "EthanBennett":
				detail = new LoginDetails("EthanBennett", "ethan.bennett@example.com", "EthanBennett#567");
				break;
			case "SophiaMitchell":
				detail = new LoginDetails("SophiaMitchell", "sophia.mitchell@example.com", "SophiaMitchell#890");
				break;
			case "AidenHenderson":
				detail = new LoginDetails("AidenHenderson", "aiden.henderson@example.com", "AidenHenderson#234");
				break;
			case "MiaCarter":
				detail = new LoginDetails("MiaCarter", "mia.carter@example.com", "MiaCarter#876");
				break;
			case "LucasEvans":
				detail = new LoginDetails("LucasEvans", "lucas.evans@example.com", "LucasEvans#345");
				break;
			case "HarperCooper":
				detail = new LoginDetails("HarperCooper", "harper.cooper@example.com", "HarperCooper#678");
				break;
			case "OliverSanchez":
				detail = new LoginDetails("OliverSanchez", "oliver.sanchez@example.com", "OliverSanchez#912");
				break;
			case "AmeliaPrice":
				detail = new LoginDetails("AmeliaPrice", "amelia.price@example.com", "AmeliaPrice#543");
				break;		
			default:
				System.out.println("Hey");
			}
		
		
		
		if (login1.equals(detail.getname()) && login3.equals(detail.getpassword())) {
			System.out.println("Login Succesful");
		}
		else if (login2.equals(detail.getemail()) && login3.equals(detail.getpassword())) {
			System.out.println("Login Succesful");
		}
		else {
			 throw new Exception();
			 
		}
		
		}
		catch (Exception e) {
			 System.err.println("Incorrect Input \n Pls Retry");
			 System.exit(0);
		}

		
		// Not Needed since i still need all three either way.
				/*	
				if (login.equalsIgnoreCase("a")) {
					System.out.println("Input name");
					
					 login1 = keyboard.next();
					
					System.out.println("Input email");
					 login3 = keyboard.next();			
				}
				else if (login.equalsIgnoreCase("b")) {
					System.out.println("Input email");
								 
					 login2 = keyboard.next();
					
					System.out.println("Input password");
					 login3 = keyboard.next();

					
				}
				else {
					throw new Exception();
				}
				
				*/
	
		
		System.out.println("Fecthing Pesornalized Data..........");  
		Thread.sleep(2000);
		
		
		James j = new James();
		LiamParker l = new LiamParker();
		AvaThompson a = new AvaThompson(); 
		MasonRamirez m = new MasonRamirez();
		IsabellaFoster i = new IsabellaFoster();
		NoahBrooks n = new NoahBrooks();
		OliviaMorgan o = new OliviaMorgan();
		EthanBennett e = new EthanBennett();
		HarperCooper h = new HarperCooper();
		SophiaMitchell s = new SophiaMitchell();
		AidenHenderson ah = new AidenHenderson();
		MiaCarter mc = new MiaCarter();
		LucasEvans lc = new LucasEvans();
		OliverSanchez os = new OliverSanchez();
		AmeliaPrice ap = new AmeliaPrice();
		

		try {
		
		switch(login1) {
		  case "James":
			  j.Monday();
			  j.Tuesday();
			  j.Wednesday();
			  j.Thursday();
			  j.Friday();
			  
			  j.Morning();
			  j.Afternoon();
			  j.Evening();
		    break;
		  case "LiamParker":
		    l.Monday();
		    l.Tuesday();
		    l.Wednesday();
		    l.Thursday();
		    l.Friday();
		    
		    l.Morning();
		    l.Afternoon();
		    l.Evening();
		    break;
		  case "AvaThompson":
			  a.Monday();
			  a.Tuesday();
			  a.Wednesday();
			  a.Thursday();
			  a.Friday();
			  
			  a.Morning();
			  a.Afternoon();
			  a.Evening();
			  break;
		  case "MasonRamirez":
			  m.Monday();
			  m.Tuesday();
			  m.Wednesday();
			  m.Thursday();
			  m.Friday();
			  
			  m.Morning();
			  m.Afternoon();
			  m.Evening();
			  break;
		  case "IsabellaFoster":
			  i.Monday();
			  i.Tuesday();
			  i.Wednesday();
			  i.Thursday();
			  i.Friday();
			  
			  i.Morning();
			  i.Afternoon();
			  i.Evening();
			  break;
		  case "NoahBrooks":
			  n.Monday();
			  n.Afternoon();
			  n.Wednesday();
			  n.Thursday();
			  n.Friday();
			  
			  n.Morning();
			  n.Afternoon();
			  n.Evening();
			  break;
		  case "OliviaMorgan":
			  o.Monday();
			  o.Tuesday();
			  o.Wednesday();
			  o.Thursday();
			  o.Friday();
			  
			  o.Morning();
			  o.Afternoon();
			  o.Evening();
			  break;
		  case "EthanBennett":
			  e.Monday();
			  e.Tuesday();
			  e.Wednesday();
			  e.Thursday();
			  e.Friday();
			  
			  o.Morning();
			  o.Afternoon();
			  o.Evening();
			  break;
		  case "HarperCooper":
			  h.Monday();
			  h.Tuesday();
			  h.Wednesday();
			  h.Thursday();
			  h.Friday();
			  
			  h.Morning();
			  h.Afternoon();
			  h.Evening();
			  break;
		  case "SophiaMitchell":
			  s.Monday();
			  s.Tuesday();
			  s.Wednesday();
			  s.Thursday();
			  s.Friday();
			  
			  s.Morning();
			  s.Afternoon();
			  s.Evening();
			  break;
		  case "AidenHenderson":
			  ah.Monday();
			  ah.Tuesday();
			  ah.Wednesday();
			  ah.Thursday();
			  ah.Friday();
			  
			  ah.Morning();
			  ah.Afternoon();
			  ah.Evening();
			  break;
		  case "MiaCarter":
			  mc.Monday();
			  mc.Tuesday();
			  mc.Wednesday();
			  mc.Thursday();
			  mc.Friday();
			  
			  mc.Morning();
			  mc.Afternoon();
			  mc.Evening();
			  break;
		  case "LucasEvans":
			  lc.Monday();
			  lc.Tuesday();
			  lc.Wednesday();
			  lc.Thursday();
			  lc.Friday();
			  
			  lc.Morning();
			  lc.Afternoon();
			  lc.Evening();
			  break;
		  case "OliverSanchez":
			  os.Monday();
			  os.Tuesday();
			  os.Wednesday();
			  os.Thursday();
			  os.Friday();
			  
			  os.Morning();
			  os.Afternoon();
			  os.Evening();
			  break;
		  case "AmeliaPrice":
			  ap.Monday();
			  ap.Tuesday();
			  ap.Wednesday();
			  ap.Thursday();
			  ap.Friday();
			  
			  ap.Morning();
			  ap.Afternoon();
			  ap.Evening();
			  break;
		  default:
			  Thread.sleep(2000);
			  System.out.println("Data Not Found.....");
			  Thread.sleep(2000);
			  System.out.println("Pls Contact Management To Resolve Further Issues(*************).............");
			  throw new Exception();
			  
		    // code block
		}
		
		}
		catch (Exception e1) {
			 System.err.println("Incorrect Input \n Pls Retry");
			 System.exit(0);
		}
	
	}

}
