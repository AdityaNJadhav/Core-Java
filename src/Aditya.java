import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aditya {
	//Static Block
	static 
	{
		System.out.println("=================================================");
		System.out.println("|---------- Welcome to Hotel Aditya's ----------|");
		System.out.println("=================================================");
	}
	
	public static void main(String[] args) {
		Information ref=new Information();
		ref.LoginPage();
		
	}
}

class Information
{
	static ArrayList info=new ArrayList();
	static ArrayList cart=new ArrayList();
	static int rrr=0;
	
	Scanner sc = new Scanner(System.in);
	
	public void LoginPage()
	{
		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to Creat New Account ");
		System.out.println("Press 3 to Exit ");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");
		String choice=sc.nextLine();
		
		switch (choice)
		{
		case "1" :
			Login();
			break;
			
		case "2" :
			SignUp();
			break;
			
		case "3" :
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("                    -----Thank You For Visiting Hotel Aditya's ! -----");
			System.out.println("                    -----------> Have a Nice Day <-----------");
			System.out.println("---------------------------------------------------------------------------------");
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			LoginPage();                                        //Method Recursion
			break;
		}	
	}
	
	public void Login()
	{
		String mobile;
		String password;
		String smobile="9892102067";
		String spassword="Jannu@143";
		
		
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("                                 Login Page                                     ");
		System.out.println("================================================================================");
		System.out.print("Enter Your Mobile Number ---> ");
		mobile=sc.nextLine();
		System.out.print("Enter Your Password --------> ");
		password=sc.nextLine();

		if (mobile.equals(smobile) && password.equals(spassword))
		{
			info.add(0, "Jannu <3");
			info.add(1, "9892102067");
			info.add(2,"jannu143@gmail.com");
			info.add(3,"Satara");
			Hotel ref=new Hotel();
			ref.mainMenu();
		}
		
		else
		{
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("!! Invalid Mobile Number Or Password !!");
			System.out.println("---------------------------------------------------------------------------------");
			LoginPage();
		}
	
	}
	
	public static void AllDetails()
	{
		System.out.println("* Name ------------> " + info.get(0));
		System.out.println("* Mobile Number ---> " + info.get(1));
		System.out.println("* Email -----------> " + info.get(2));
		System.out.println("* Address ---------> " + info.get(3));
	}
	
	public void SignUp()
	{
		Uname();
	}
	
	String userName;
	long mobileNumber;
	String email;
	String address;
	
		
	public void Uname()
	{
		System.out.println("================================================================================");
		System.out.println("                                Sign Up Page                                    ");
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Kindly Enter your Name ---> ");
		String userName = sc.nextLine();
		info.add(0,userName);					
		
		nameSwitch(); // Calling nameSwitch method 
	}
	
	public void nameSwitch()
	{		
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Hello... "+ info.get(0));
		System.out.println();
		System.out.print("To Continue Press 1, To Edit Name Press 2 ---> ");
		String value0 = sc.nextLine();
	
		switch (value0)
		{
		case "1" :
			mobileNum();// call phone number method
			break;
			
		case "2" :
			info.clear();
			Uname(); // Calling Uname method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			nameSwitch();
			break;		
		}
	}
	
	public void mobileNum()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Enter Your 10 digit Mobile Number ---> ");

//===========================================================================================================================
		// Exception Handling 
		
		try
		{
		Scanner ref = new Scanner(System.in);
		mobileNumber = ref.nextLong();
		info.add(1,mobileNumber);
		
//===========================================================================================================================		
		
		
		if (mobileNumber>1000000000 && mobileNumber<9999999999L)
		{
			
			mobileSwitch();//call mobileSwitch method
		}
		
		else 
		{
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println();
			mobileNum();
		}
		}
		catch (InputMismatchException ref1)
		{
			System.out.println("Mobile Number Should Contains Numbers only");
			mobileNum();
		}
	}
	public void mobileSwitch()
	{	
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Your Enter Mobile Number is :- "+ info.get(1)+  ".");
		System.out.println();
		System.out.print("To continue Press 1 Or to Edit Mobile Number Press 2 ---> ");
		String value1 = sc.nextLine();
	
		switch (value1)
		{
		case "1" : 
			Email();// Main Menu method
			break;
			
		case "2" : 
			info.remove(1);
			mobileNum(); // Calling Uname method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			mobileSwitch();  //Method Recursion
			break;		
		}
	}
	
	public void Email()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Kindly Enter your Email ID --> ");
		String email = sc.nextLine();
		info.add(2,email);					
		
		emailSwitch(); // Calling emailSwitch method 
	}
	
	public void emailSwitch()
	{		
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Your Entered Email Id is:- "+ info.get(2));
		System.out.println();
		System.out.print("To Continue Press 1, To Edit Email Press 2 ---> ");
		String value2 = sc.nextLine();
	
		switch (value2)
		{
		case "1" :
			Address();// address method
			break;
			
		case "2" :
			info.remove(2);
			Email(); // Calling Email method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			emailSwitch();
			break;		
		}
	}

	public void Address()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Kindly Enter your Address ---> ");
		String address = sc.nextLine();
		info.add(3,address);					
		
		addressSwitch(); // Calling emailSwitch method 
	}
	
	public void addressSwitch()
	{		
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Your Entered Address is:- "+ info.get(3));
		System.out.println();
		System.out.print("To Continue Press 1, To Edit Address Press 2 ---> ");
		String value3 = sc.nextLine();
	
		switch (value3)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println();
			System.out.println("******** Your Account Created Sucessfully ********");
			
			Hotel ref=new Hotel();
			ref.mainMenu();
			break;
			
		case "2" :
			info.remove(3);
			Address(); // Calling Email method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			addressSwitch();
			break;		
		}
	}
	
	//==================================================================================================================================================

		public void OrderDetails()
		{
			System.out.println("Press 1 To Continue Shopping");
			System.out.println("Press 2 To View Your Cart Items & Placing Order");
			System.out.println("Press remaining any key Exit");
			System.out.println();
			System.out.print("Enter Your Choice ---> ");
			String ex=sc.nextLine();
			
			switch (ex)
			{
			//Press 1 To Continue Shopping
			case "1" :
				Hotel ref=new Hotel();
				ref.mainMenu();
				break;

			//Press 2 To View Your Cart Items & Placing Order
			case "2" :
				ViewPlace();
				break;
				
			default :
				System.out.println();
				System.out.println("================================================================================");
				System.out.println("---------- Thank You " + Information.info.get(0) +" For Shopping From Hotel Aditya's ! ----------");
				System.out.println("                ----------> Have a Nice Day <-----------");
				System.out.println("================================================================================");
				break;
			}
	}
		
		public void ViewPlace()
		{
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("                                 Cart Items                                     ");
			System.out.println("================================================================================");
			System.out.println();
			for (Object obj : Information.cart)     //For each loop
			{
				System.out.println(obj);
				System.out.println();
			}
			
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("Press 1 To Edit Cart List");
			System.out.println("Press 2 To Placed Order");
			System.out.println("Press 3 Back to Home Page");
			System.out.println();
			System.out.print("Enter Your Choice here ---> ");
			String rp=sc.nextLine();
			
			switch (rp)
			{
			//Press 1 To Edit Cart List
			case "1":
				int cartSize=Information.cart.size();
				
				if (cartSize==0)
				{
					System.out.println();
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("                    --------- Your Cart is Empty ---------                      ");
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Sending To Home page.......");
					Hotel ref=new Hotel();
					ref.mainMenu();
				}
				else
				{
				RemoveCart();
				}
				break;
			
			//Press 2 To Placed Order"
			case "2":
				OrderPlace();
				break;
				
			case "3":
				Hotel ref=new Hotel();
				ref.mainMenu();
				break;
				
			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ViewPlace();
				break;
			}	
			
		}
	//-------------------------------------------------------------------------------------------------------------------------------------------------
		
		public void RemoveCart()
		{
			
				System.out.println();
				System.out.println("================================================================================");
				System.out.println("                                Your Cart Items                                 ");
				System.out.println("================================================================================");
				for (Object obj : Information.cart)     //For each loop
				{
					System.out.println(obj);
					System.out.println();
				}
				
				int size=Information.cart.size();
				System.out.println();
				System.out.println("Enter the Serial No of item you want to remove from list");
				System.out.println();
				System.out.print("Enter Your Choice here ---> ");
				
				try
				{
				int pk=sc.nextInt();
				int index=pk-1;
				if (pk>0 && pk<=size)
				{
					Information.cart.remove(index);
					
					System.out.println();
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("                --------- Item Removed SucessFully ---------                    ");
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println();
					ViewPlace();
				}
				else 
				{
					System.out.println();
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("                    --------- Enter Valid Input ---------                       ");
					System.out.println("--------------------------------------------------------------------------------");
					ViewPlace();
				}
				}
				catch (InputMismatchException re)
				{
					System.out.println();
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("                    --------- Enter Valid Input ---------                       ");
					System.out.println("--------------------------------------------------------------------------------");
					ViewPlace();
				}
				
		}

	//-------------------------------------------------------------------------------------------------------------------------------------------------

		public void OrderPlace()
		{
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("                         Your Order Placed Successfully                         ");
			System.out.println("================================================================================");

			System.out.println();
			System.out.println("                    ---------- Personal Details ----------");
			System.out.println();
			Information.AllDetails();
			System.out.println();
			System.out.println("Payment Method: COD");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                        ---------- Order List ----------");
			System.out.println();
			for (Object obj : Information.cart)     //For each loop
			{
				System.out.println(obj);
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Total Amount: Rs"+rrr);
			System.out.println();
		
			System.out.println("================================================================================");
			System.out.println();
			System.out.println("Press 1 To Continue Shopping");
			System.out.println("Press remaining any key Exit");
			System.out.print("Enter Your Choice ---> ");
			String ex1=sc.nextLine();
		
			switch (ex1)
			{
			case "1" :
				Hotel ref=new Hotel();
				ref.mainMenu();
				break;
			
			default :
				System.out.println();
				System.out.println("================================================================================");
				System.out.println("---------- Thank You " + Information.info.get(0) +" For Shopping From Hotel Aditya's ! ----------");
				System.out.println("                ----------> Have a Nice Day <-----------"); 
				System.out.println("================================================================================");
				break;
			}

		}
	}
		
		
	//====================================================================================================================================================



class Hotel extends Information{
	
	String product;
	String quantity;
	String price;
	String description;
	
	
	public void mainMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("----------------- Main Menu --------------------");
		System.out.println();
		System.out.println("Enter 1 For BreakFast");
		System.out.println("Enter 2 for Main Course");
		System.out.println("Enter 3 For Breads");
		System.out.println("Enter 4 For Drinks");
		System.out.println("Enter 5 For Desserts");
		System.out.println();
		
		
		System.out.print("Enter Your Choice ==>");		
		String a=sc.next();
		System.out.println("=================================================");
		
		switch (a)
		{
		case "1" : Breakfast ref1 = new Breakfast("","","","");
					ref1.breakfast();
			break;
			
		case "2" : MainCourse ref2 = new MainCourse();
					ref2.mainCourse();
			break;
			
		case "3" : Breads ref3 = new Breads("","","","");
						ref3.breads();
			break;
			
		case "4" : Drinks ref4 = new Drinks("","","","");
					ref4.drinks();
			break;
			
		case "5" : Desserts ref5 = new Desserts("","","","");
					ref5.desserts();
			break; 
			
			
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			mainMenu();
			break;

		}		
	}
	
	public String toString()
	{
		System.out.println("=================================================");
		System.out.println("Menu :" + product);
		System.out.println("Quantity : " + quantity);
		System.out.println("Price : " + price);
		System.out.println("Description : " + description);
		System.out.println("=================================================");
		return "";
	}
	
	
}

class Breakfast extends Hotel{
	
	
	//============================  Parameterized Construction  ==================================================================

	Breakfast( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}
	
	public void breakfast() {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Menu > Break Fast");
		System.out.println();
		System.out.println("Enter 1 For Idli");
		Breakfast iddli = new Breakfast("Idli","2 Pice ","Rs 50/-","Perfectly cooked soft and fluffy");
		System.out.println(iddli);
		System.out.println();
		System.out.println("Enter 2 For Dosa");
		Breakfast dosa = new Breakfast("Dosa","1 ","Rs 50/-","Perfectly cooked Crispy and Delicious");
		System.out.println(dosa);
		System.out.println();
		System.out.println("Enter 3 For Medu Vada");
		Breakfast meduvada = new Breakfast("Medu Vada ","2 Pice ","Rs 70/-","Perfectly cooked soft and Crispy");
		System.out.println(meduvada);
		System.out.println();
		System.out.println("Enter 4 For Masala Dosa");
		Breakfast masaladosa = new Breakfast("Masala Dosa ","1 ","Rs 90/-","Perfectly cooked soft");
		System.out.println(masaladosa);
		System.out.println();
		System.out.println("Enter 5 For Sheera");
		Breakfast shira = new Breakfast("Sheera ","1 ","Rs 50/-","Perfectly cooked soft and sweet");
		System.out.println(shira);
		System.out.println();
		System.out.println("Enter 6 For Upma");
		Breakfast upma = new Breakfast("Upma ","1 ","Rs 50/-","Perfectly cooked soft and spicy");
		System.out.println(upma);
		System.out.println();
		System.out.println("Enter 7 For Pohe");
		Breakfast pohey = new Breakfast("Pohe ","1 ","Rs 50/-","Perfectly cooked soft and tasty");
		System.out.println(pohey);
		System.out.println();
		System.out.println("Enter 8 For Main Menu");
		System.out.println();
		System.out.println("Enter 9 For Break Fast");	
		System.out.println();


		System.out.print("Enter Your Choice ==> ");
		String n = sc.next();

		System.out.println("=================================================");		
	
		switch (n)
		{
		//Iddli
		case "1" :
			String g = "Idli"+
						"2 Pice "+
						"Rs 50/-"+
						"Perfectly cooked soft and fluffy";
			Information.cart.add(g);
			rrr=rrr+50;
			break;
		
		//Dosa
		case "2":
			String f = "Dosa"+
						"1 "+
						"Rs 50/-"+
						"Perfectly cooked soft  Crispy and Delicious";
			Information.cart.add(f);
			rrr=rrr+50;
			break;
		
		//Medu Vada
		case "3":
			String e = "Medu Vada "+
						"2 Pice "+
						"Rs 70/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(e);
			rrr=rrr+70;

			break;
		
		//Masala Dosa
		case "4":
			String d = "Masala Dosa "+
						"1 "+
						"Rs 90/-"+
						"Perfectly cooked soft";
			Information.cart.add(d);
			rrr=rrr+90;
			break;
		
		//Sheera
		case "5":
			String c = "Sheera "+
						"1 "+
						"Rs 50/-"+
						"Perfectly cooked soft and Sweet";
			Information.cart.add(c);
			rrr=rrr+50;
			break;
					
		//Upma
		case "6":
			String b = "Upma "+
						"1 "+
						"Rs 50/-"+
						"Perfectly cooked soft and spicy";
			Information.cart.add(b);
			rrr=rrr+50;
			break;
		
		//Pohey
		case "7":
			String a = "Pohe "+
						"1 "+
						"Rs 50/-"+
						"Perfectly cooked soft and tasty";
			Information.cart.add(a);
			rrr=rrr+50;
			break;
		
		case "8" : mainMenu();
		break;
		
		case "9" : breakfast();
		break;

		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			breakfast();
		break;

		}
		
		OrderDetails();
	}
}

class MainCourse extends Hotel{
	
	
	public void mainCourse() {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Main Menu > Main Course");
		System.out.println();
		System.out.println("Enter 1 For Veg Menu");
		System.out.println("Enter 2 For NonVeg Menu");
		System.out.println("Enter 3 For Main Menu");	
		System.out.println();
		
		System.out.print("Enter Your Choice ==>");
		String b = sc.next();
		System.out.println("=================================================");
		
		switch (b)
		{
		
		case "1" : Veg ref1 = new Veg();
					ref1.veg();
		break;
		
		case "2" : NonVeg ref2 = new NonVeg();
					ref2.nonVeg();
		break;
		
		case "3" : mainMenu();
		break;
		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			mainCourse();
		break;
		
		}
	}
}

class Veg extends MainCourse{
	
	public void veg() {
		


		Scanner sc=new Scanner(System.in);
		System.out.println("----------------- Veg Menu --------------------");
		System.out.println();
		System.out.println("Enter 1 For Starter");
		System.out.println("Enter 2 For Gravy");
		System.out.println("Enter 3 For Rice");
		System.out.println("Enter 4 For Main Course");	
		System.out.println();

		
		System.out.print("Enter Your Choice ==>");		
		String c = sc.next();
		System.out.println("=================================================");
		
		switch(c) 
		{
		case "1" : VStarter ref1 = new VStarter("","","","");
					ref1.vstarter();
		break;

		case "2" : VGravy ref2 = new VGravy("","","","");
					ref2.vgravy();
		break;
		
		case "3" : VRice ref3 = new VRice("","","","");
					ref3.vrice();
		break;
		
		case "4" : mainCourse();
		break;

		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			mainCourse();
		break;
		}
	}
}

class VStarter extends Veg{
	
	//============================  Parameterized Construction  ==================================================================
	
	VStarter( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}
	
	public void vstarter() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Veg Menu > Starter");
		System.out.println(); 
		System.out.println("Enter 1 For Chilli Garlic Pops");
		VStarter cgpops = new VStarter("Chilli Garlic Pops","12 Pice ","Rs 85/-","Perfectly cooked soft and Crispy");
		System.out.println(cgpops);
		System.out.println();
		System.out.println("Enter 2 For Cheese Shotz");
		VStarter chshotz = new VStarter("Cheese Shotz","12 Pice ","Rs 100/-","Perfectly cooked soft and Crispy");
		System.out.println(chshotz);
		System.out.println();
		System.out.println("Enter 3 For French Fries");
		VStarter fries = new VStarter("French Fries"," 1 ","Rs 75/-","Perfectly cooked soft and Crispy");
		System.out.println(fries);
		System.out.println();
		System.out.println("Enter 4 For Veg Fingers");
		VStarter vegfingers = new VStarter("Veg Fingers"," 1 ","Rs 100/-","Perfectly cooked soft and Crispy");
		System.out.println(vegfingers);
		System.out.println();
		System.out.println("Enter 5 For Samosa Chaat ");
		VStarter schaat = new VStarter("Samosa Chaat"," 1 ","Rs 50/-","Perfectly cooked soft and Crispy");
		System.out.println(schaat);
		System.out.println();
		System.out.println("Enter 6 For Tandoori Paneer Tikka");
		VStarter tptikka = new VStarter("Tandoori Paneer Tikka"," 12 Pice ","Rs 220/-","Perfectly cooked soft and Crispy");
		System.out.println(tptikka);
		System.out.println();
		System.out.println("Enter 7 For Malai Paneer Tikka");
		VStarter mptikka = new VStarter("Malai Paneer Tikka"," 12 Pice ","Rs 220/-","Perfectly cooked soft and Crispy");
		System.out.println(mptikka);
		System.out.println();
		System.out.println("Enter 8 For Soya Tandoori Tikka");
		VStarter sttikka = new VStarter("Soya Tandoori Tikka"," 12 Pice ","Rs 220/-","Perfectly cooked soft and Crispy");
		System.out.println(sttikka);
		System.out.println();
		System.out.println("Enter 9 Hare-Bhare Kabab");	
		VStarter hbkabab = new VStarter("Hare-Bhare Kabab"," 12 Pice ","Rs 220/-","Perfectly cooked soft and Crispy");
		System.out.println(hbkabab);
		System.out.println();
		System.out.println("Enter 10 For Veg Menu");	
		System.out.println();

		System.out.print("Enter Your Choice ==>");	
		String j = sc.next();
		System.out.println("=================================================");
	
		switch(j)
		{
		
		//Chilli Garlic Pops
		case "1" : 
			String a = "Chilli Garlic Pops"+
						"12 Pice "+
						"Rs 85/-"+
						"Deep fried spicy";
			Information.cart.add(a);
			rrr=rrr+85;

		break;
		
		//Cheese Shotz
		case "2" : 
			String b = "Cheese Shotz"+
						"12 Pice "+
						"Rs 100/-"+
						"Cheezy";
			Information.cart.add(b);
			rrr=rrr+100;

		break;
		
		//French Fries
		case "3" : 
			String c = "French Fries"+
						" 1 "+
						"Rs 75/-"+
						"Perfectly cooked Crispy";
			Information.cart.add(c);
			rrr=rrr+75;

		break;
		
		//Veg Fingers
		case "4" :
			String d = 	"Veg Fingers"+
						" 1 "+
						"Rs 100/-"+
						"Perfectly cooked Crispy";
		Information.cart.add(d);
		rrr=rrr+100;

		break;
		
		//Samosa Chaat
		case "5" :
			String e = "Samosa Chaat"+
						" 1 "+
						"Rs 50/-"+
						"ChatPata";
			Information.cart.add(e);
			rrr=rrr+50;

		break;
		
		//Tandoori Paneer Tikka
		case "6" :
			String f = "Tandoori Paneer Tikka"+
						" 12 Pice "+
						"Rs 220/-"+
						"Perfectly cooked Delicious";
			Information.cart.add(f);
			rrr=rrr+220;

		break;
		
		//Malai Paneer Tikka
		case "7" : 
			String g = "Malai Paneer Tikka"+
						" 12 Pice "+
						"Rs 220/-"+
						"Perfectly cooked soft and Delicious";
			Information.cart.add(g);
			rrr=rrr+220;

		break;
		
		//Soya Tandoori Tikka
		case "8" : 
			String h = "Soya Tandoori Tikka"+
						" 12 Pice "+
							"Rs 220/-"+
					"Mouth Watering";
			Information.cart.add(h);
			rrr=rrr+220;

		break;
		
		//Hare-Bhare Kabab
		case "9" : 
			String i = "Hare-Bhare Kabab"+
						" 12 Pice "+
						"Rs 220/-"+
						"Crispy";
			Information.cart.add(i);
			rrr=rrr+220;

		break;
		
		//Method Calling Statement  
		case "10" : veg();
		break;
			
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			vstarter();
		break;
		}
		
		OrderDetails();
		
	}
}

class VGravy extends Veg{
	
	//============================  Parameterized Construction  ==================================================================

	VGravy( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}
	
	
	public void vgravy() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Veg Menu > Gravy");
		System.out.println();
		System.out.println("Enter 1 For Shahi Paneer");
		VStarter shpaneer = new VStarter("Shahi Paneer"," 1 ","Rs 210/-","Delightful");
		System.out.println(shpaneer);
		System.out.println();
		System.out.println("Enter 2 For Kadhai Paneer");
		VStarter kpaneer  = new VStarter("Kadhai Paneer "," 1 ","Rs 210/-","Yummy");
		System.out.println(kpaneer);
		System.out.println();
		System.out.println("Enter 3 For Paneer Butter Masala");
		VStarter pbmasala = new VStarter("Paneer Butter Masala"," 1 ","Rs 210/-","Delicious");
		System.out.println(pbmasala);
		System.out.println();
		System.out.println("Enter 4 For Mushroom Masala");
		VStarter mushroomasala = new VStarter("Mushroom Masala"," 1 ","Rs 215/-","Flavorful");
		System.out.println(mushroomasala);
		System.out.println();
		System.out.println("Enter 5 For Malai Kofta");
		VStarter mkofta = new VStarter("Malai Kofta"," 1 ","Rs 210/-","Super Delicious");
		System.out.println(mkofta);
		System.out.println();
		System.out.println("Enter 6 For Dal Makhani");
		VStarter dalmakhani = new VStarter("Dal Makhani"," 1 ","Rs 192/-","Perfectly cooked soft and Crispy");
		System.out.println(dalmakhani);
		System.out.println();
		System.out.println("Enter 7 For Yellow Dal");
		VStarter yellowdal = new VStarter("Yellow Dal"," 1 ","Rs 141/-","Tasty");
		System.out.println(yellowdal);
		System.out.println();
		System.out.println("Enter 8 For Rajma");
		VStarter rajma = new VStarter("Rajma"," 1 ","Rs 141/-","Luscious");
		System.out.println(rajma);
		System.out.println();
		System.out.println("Enter 9 For Chole");
		VStarter chole = new VStarter("Chole"," 1 ","Rs 141/-","Tasty");
		System.out.println(chole);
		System.out.println();
		
		System.out.println("Enter 10 For Veg Menu");	
		System.out.println();
		
		System.out.print("Enter Your Choice ==>");	
		String j = sc.next();
		System.out.println("=================================================");
	
		switch(j)
		{
		
		//Shahi Paneer
		case "1" : 
			String a = "Shahi Paneer"+
						" 1 "+
						"Rs 210/-"+
						"Delightful";
			Information.cart.add(a);
			rrr=rrr+210;

		break;
		
		//Kadhai Paneer 
		case "2" : 
			String b = "Kadhai Paneer "+
						" 1 "+
						"Rs 210/-"+
						"Yummy";
			Information.cart.add(b);
			rrr=rrr+210;

		break;
		
		//Paneer Butter Masala 	
		case "3" : 
			String c = "Paneer Butter Masala"+
						" 1 "+
						"Rs 210/-"+
						"Delicious";
			Information.cart.add(c);
			rrr=rrr+210;

		break;
		
		//Mushroom Masala
		case "4" :
			String d = "Mushroom Masala"+
						" 1 "+
						"Rs 215/-"+
						"Flavorful";
			Information.cart.add(d);
			rrr=rrr+215;

		break;
		
		//Malai Kofta
		case "5" : 
			String e = "Malai Kofta"+
						" 1 "+
						"Rs 210/-"+
						"Super Delicious";
			Information.cart.add(e);
			rrr=rrr+210;

		break;
		
		//Dal Makhani	 
		case "6" : 
			String f = "Dal Makhani"+
						" 1 "+
						"Rs 192/-"+
						"Luscious";
			Information.cart.add(f);
			rrr=rrr+192;

		break;
		
		//Yellow Dal
		case "7" : 
			String g = "Yellow Dal"+
						" 1 "+
						"Rs 141/-"+
						"Tasty";
			Information.cart.add(g);
			rrr=rrr+141;

		break;
		
		//Rajma
		case "8" : 
			String h = "Rajma"+
						" 1 "+
						"Rs 141/-"+
						"Delish";
			Information.cart.add(h);
			rrr=rrr+141;

		break;
		
		//Chole
		case "9" :
			String i = "Chole"+
						" 1 "+
						"Rs 141/-"+
						"Tasty";
			Information.cart.add(i);
			rrr=rrr+141;

		break;
		
		//Method Calling Statement  		
		case "10" : veg();
		break;
		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			vgravy();
		break;
		}
		
		OrderDetails();
		
	}
}

class VRice extends Veg {
	
	//============================  Parameterized Construction  ==================================================================

	VRice( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}
	
	public void vrice() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Veg Menu > Rice");
		System.out.println();
		System.out.println("Enter 1 For Veg Fried Rice");
		VStarter vfriedrice = new VStarter("Veg Fried Rice"," 1 ","Rs 210/-","Perfectly cooked");
	    System.out.println(vfriedrice);
	    System.out.println();
		System.out.println("Enter 2 For Dal Khichdi");
		VStarter dalkhichdi = new VStarter("Dal Khichdi"," 1 ","Rs 210/-","Perfectly cooked soft");
		System.out.println(dalkhichdi);
		System.out.println();
		System.out.println("Enter 3 For Veg Pulao");
		VStarter vegpulao = new VStarter("Veg Pulao"," 1 ","Rs 210/-","Perfectly cooked soft");
		System.out.println(vegpulao);
		System.out.println();
		System.out.println("Enter 4 For Paneer Biryani");
		VStarter vstpulao = new VStarter("Paneer Biryani"," 1 ","Rs 141/-","Perfectly cooked soft");
		System.out.println(vstpulao);
		System.out.println();
		System.out.println("Enter 5 For Tawa Pulao");
		VStarter tawapulao = new VStarter("Tawa Pulao"," 1 ","Rs 141/-","Perfectly cooked soft");
		System.out.println(tawapulao);
		System.out.println();
		System.out.println("Enter 6 For Steamed Rice");
		VStarter steamedrice = new VStarter("Steamed Rice"," 1 ","Rs 192/-","Perfectly cooked soft");
		System.out.println(steamedrice);
		System.out.println();
		System.out.println("Enter 7 For Jeera Rice");
		VStarter jeerarice = new VStarter("Jeera Rice"," 1 ","Rs 141/-","Perfectly cooked soft");
		System.out.println(jeerarice);
		System.out.println();
		System.out.println("Enter 8 For Kashmiri Pulao");
		VStarter kashmiripulao = new VStarter("Kashmiri Pulao"," 1 ","Rs 141/-","Perfectly cooked soft");
		System.out.println(kashmiripulao);
		System.out.println("Enter 9 For Veggie Special Tawa Pulao");
		VStarter vegstpulao = new VStarter("Veggie Special Tawa Pulao"," 1 ","Rs 141/-","Perfectly cooked soft");
		System.out.println(vegstpulao);
		System.out.println();
		System.out.println("Enter 10 For Veg Menu");	
		System.out.println();
		
		
		System.out.print("Enter Your Choice ==>");	
		String j = sc.next();
		System.out.println("=================================================");
	
		switch(j)
		{
		//Veg Fried Rice
		case "1" : 
			String a = "Veg Fried Rice"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
           Information.cart.add(a);
			rrr=rrr+210;

	    break;
				
		//Dal Khichdi 
		case "2" : 
			String b = "Dal Khichdi"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(b);
			rrr=rrr+210;

		break;
		
		//Veg Pulao 	
		case "3" :
			String c = "Veg Pulao"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(c);
			rrr=rrr+210;

		break;
		
		//Paneer Biryani
		case "4" : 
			String d = "Paneer Biryani"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(d);
			rrr=rrr+210;

		break;
		
		//Tawa Pulao
		case "5" : 
			String e = "Tawa Pulao"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(e);
			rrr=rrr+141;

		break;
		
		//Steamed Rice	 
		case "6" : 
			String h = "Steamed Rice"+
						" 1 "+
						"Rs 192/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(h);
			rrr=rrr+192;

		break;
		
		//Jeera Rice
		case "7" : 
			String i = "Jeera Rice"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(i);
			rrr=rrr+141;

		break;
		
		//Kashmiri Pulao
		case "8" : 
			String k = "Kashmiri Pulao"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(k);
			rrr=rrr+141;

		break;
		
		//Veggie Special Tawa Pulao
		case "9" : 
			String l = "Veggie Special Tawa Pulao"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(l);
			rrr=rrr+141;

		break;
		
		//Method Calling Statement  		
		case "10" : veg();
		break;
		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			vrice();
		break;
		}
		
		OrderDetails();
		
	}
}

class NonVeg extends MainCourse{
	
	public void nonVeg() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("----------------- NonVeg Menu --------------------");
		System.out.println();
		System.out.println("Enter 1 For Starter");
		System.out.println("Enter 2 For Gravy");
		System.out.println("Enter 3 For Rice");
		System.out.println("Enter 4 For Main Course");	
		System.out.println();
		
		System.out.print("Enter Your Choice ==>");		
		String d = sc.next();
		System.out.println("=================================================");
	
		switch(d) 
		{
		case "1" : NStarter ref1 = new NStarter("","","","");
					ref1.nstarter();
		break;

		case "2" : NGravy ref2 = new NGravy("","","","");
					ref2.ngravy();
		break;
		
		case "3" : NRice ref3 = new NRice("","","","");
					ref3.nrice();
		break;
		
		case "4" : mainCourse();
		break;

		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			mainCourse();
		break;
		}
	}
}
	
	
class NStarter extends NonVeg{
	
	//============================  Parameterized Construction  ==================================================================

	NStarter( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}

		
	public void nstarter() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("NonVeg Menu > Starter");
		System.out.println();
		System.out.println("Enter 1 For Anda Tokri");
		NStarter andatokri = new NStarter("Anda Tokri"," 1 ","Rs 210/-","Perfectly cooked soft and Crispy");
        System.out.println(andatokri);
        System.out.println();
		System.out.println("Enter 2 For Chicken Tikka");
		NStarter chickentikka = new NStarter("Chicken Tikka"," 1 ","Rs 210/-","Perfectly cooked soft and Crispy");
		System.out.println(chickentikka);
		System.out.println();
		System.out.println("Enter 3 For Tandoori Chicken");
		NStarter tchicken = new NStarter("Tandoori Chicken"," 1 ","Rs 210/-","Perfectly cooked soft and Crispy");
		System.out.println(tchicken);
		System.out.println();
		System.out.println("Enter 4 For Mutton Seekh");
		NStarter mseekh = new NStarter("Mutton Seekh"," 1 ","Rs 215/-","Perfectly cooked soft and Crispy");
		System.out.println(mseekh);
		System.out.println();
		System.out.println("Enter 5 For Prawns koliwada");
		NStarter pkoliwada = new NStarter("Prawns koliwada"," 1 ","Rs 210/-","Perfectly cooked soft and Crispy");
		System.out.println(pkoliwada);
		System.out.println();
		System.out.println("Enter 6 For Chicken Chilly Dry");
		NStarter cchillydry = new NStarter("Chicken Chilly Dry"," 1 ","Rs 192/-","Perfectly cooked soft and Crispy");
		System.out.println(cchillydry);
		System.out.println();
		System.out.println("Enter 7 For Chicken 65");
		NStarter chicken65 = new NStarter("Chicken 65"," 1 ","Rs 141/-","Perfectly cooked soft and Crispy");
		System.out.println(chicken65);
		System.out.println();
		System.out.println("Enter 8 For Masala Chicken Lollipop");
		NStarter mclollipop = new NStarter("Masala Chicken Lollipop"," 1 ","Rs 141/-","Perfectly cooked soft and Crispy");
		System.out.println(mclollipop);
		System.out.println();
		System.out.println("Enter 9 For Chicken Lollipop Dry");
		NStarter clollipopd = new NStarter("Chicken Lollipop Dry"," 1 ","Rs 141/-","Perfectly cooked soft and Crispy");
		System.out.println(clollipopd);
		System.out.println();
		System.out.println("Enter 10 For NonVeg Menu");	
		System.out.println();
		
		
		System.out.print("Enter Your Choice ==>");	
		String i = sc.next();
		System.out.println("=================================================");
	
		switch(i)
		{
		//Anda Tokri
		case "1" :
			String a = "Anda Tokri"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(a);
			rrr=rrr+210;

	    break;
				
		//Chicken Tikka 
		case "2" : 
			String b = "Chicken Tikka"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(b);
			rrr=rrr+210;

		break;
		
		//Tandoori Chicken 	
		case "3" : 
			String c = "Tandoori Chicken"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(c);
			rrr=rrr+210;

		break;
		
		//Mutton Seekh
		case "4" : 
			String d = "Mutton Seekh"+
						" 1 "+
						"Rs 215/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(d);
			rrr=rrr+215;

		break;
		
		//Prawns koliwada
		case "5" : 
			String e = "Prawns koliwada"+
					" 1 "+
					"Rs 210/-"+
					"Perfectly cooked soft and Crispy";
			Information.cart.add(e);
			rrr=rrr+210;

		break;
		
		//Chicken Chilly Dry	 
		case "6" : 
			String f = "Chicken Chilly Dry"+
						" 1 "+
						"Rs 192/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(f);
			rrr=rrr+192;

		break;
		
		//Chicken 65
		case "7" : 
			String g = "Chicken 65"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(g);
			rrr=rrr+141;

		break;
		
		//Masala Chicken Lollipop
		case "8" : 
			String h = "Masala Chicken Lollipop"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(h);
			rrr=rrr+141;

		break;
		
		//Chicken Lollipop Dry
		case "9" : 
			String j = "Chicken Lollipop Dry"+
					" 1 "+
					"Rs 141/-"+
					"Perfectly cooked soft and Crispy";
		Information.cart.add(j);
		rrr=rrr+141;

		break;
		
		case "10" : nonVeg();
		break;
		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			nstarter();
		break;
		}
		
		OrderDetails();
		
	}
}

class NGravy extends NonVeg{
	
	//============================  Parameterized Construction  ==================================================================

	NGravy( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}

		
	public void ngravy() {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("NonVeg Menu > Gravy");
		System.out.println();
		System.out.println("Enter 1 For Kolhapuri Fish");
		NGravy  kolhapurifish = new NGravy("Kolhapuri Fish"," 1 ","Rs 210/-","Perfectly cooked soft`");
        System.out.println(kolhapurifish);
        System.out.println();
		System.out.println("Enter 2 For Mutton Rassa");
		NGravy muttonrassa = new NGravy("Mutton Rassa"," 1 ","Rs 210/-","Perfectly cooked soft and tasty");
		System.out.println(muttonrassa);
		System.out.println();
		System.out.println("Enter 3 For Spicy Malvani Chicken Curry");
		NGravy smchicken = new NGravy("Spicy Malvani Chicken Curry"," 1 ","Rs 210/-","Perfectly cooked soft and Spicy");
		System.out.println(smchicken);
		System.out.println();
		System.out.println("Enter 4 For Chicken/Mutton Soup");
		NGravy cmsoup = new NGravy("Chicken/Mutton Soup"," 1 ","Rs 215/-","Perfectly cooked soft and tasty");
		System.out.println(cmsoup);
		System.out.println();
		System.out.println("Enter 5 For Prawns Curry");
		NGravy prawnscurry = new NGravy("Prawns Curry"," 1 ","Rs 210/-","Perfectly cooked soft and tasty");
		System.out.println(prawnscurry);
		System.out.println();
		System.out.println("Enter 6 For Egg Curry");
		NGravy eggcurry = new NGravy("Egg Curry"," 1 ","Rs 192/-","Perfectly cooked");
		System.out.println(eggcurry);
		System.out.println();
		System.out.println("Enter 7 For Nagpur special Saoji Anda Curry");
		NGravy andacurry = new NGravy("Nagpur special Saoji Anda Curry"," 1 ","Rs 141/-","Perfectly cooked soft");
		System.out.println(andacurry);
		System.out.println();
		System.out.println("Enter 8 For Maharashtiran Zanzanit Chicken Thali");
		NGravy zanzanit = new NGravy("Maharashtiran Zanzanit Chicken Thali"," 1 ","Rs 410/-","In Maharashtiran Zanzanit Chicken Thali in which there is Ch.Sukka, Ch.Rassa,Bhakari,Rice,salad");
		System.out.println(zanzanit);
		System.out.println();
		System.out.println("Enter 9 For Pandhra Rassa");
		NGravy pandhrarassa = new NGravy("Pandhra Rassa"," 1 ","Rs 141/-","Special Unlimited Offer");
		System.out.println(pandhrarassa);
		System.out.println();
		System.out.println("Enter 10 For NonVeg Menu");		
		System.out.println();
		
		System.out.print("Enter Your Choice ==>");	
		String h = sc.next();
		System.out.println("=================================================");
	
		switch(h)
		{
		// Kolhapuri Fish
		case "1" :
			String a = "Kolhapuri Fish"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft";
			Information.cart.add(a);
			rrr=rrr+210;

	    break;
				
		//Mutton Rassa
		case "2" : 
			String b = "Mutton Rassa"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and tasty";
			Information.cart.add(b);
			rrr=rrr+210;

		break;
		
		//Spicy Malvani Chicken Curry 	
		case "3" : 
			String c = "Spicy Malvani Chicken Curry"+
					" 1 "+
					"Rs 210/-"+
					"Perfectly cooked soft and Spicy";
			Information.cart.add(c);
			rrr=rrr+210;

		break;
		
		//Chicken/Mutton Soup
		case "4" :
			String d = "Chicken/Mutton Soup"+
						" 1 "+
						"Rs 215/-"+
						"Perfectly cooked soft and tasty";
			Information.cart.add(d);
			rrr=rrr+215;

		break;
		
		//Prawns Curry
		case "5" : 
			String e = "Prawns Curry"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and tasty";
			Information.cart.add(e);
			rrr=rrr+210;

		break;
		
		//Egg Curry	 
		case "6" :
			String f = "Prawns Curry"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked ";
			Information.cart.add(f);
			rrr=rrr+210;

		break;
		
		//Nagpur special Saoji Anda Curry
		case "7" : 
			String g = "Nagpur special Saoji Anda Curry"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft";
			Information.cart.add(g);
			rrr=rrr+141;

		break;
		
		//Maharashtiran Zanzanit Chicken Thali
		case "8" : 
			String i = "Maharashtiran Zanzanit Chicken Thali"+
						" 1 "+
						"Rs 410/-"+
						"In Maharashtiran Zanzanit Chicken Thali in which there is Ch.Sukka, Ch.Rassa,Bhakari,Rice,salad";
			Information.cart.add(i);
			rrr=rrr+410;

		break;
		
		//Pandhra Rassa
		case "9" : 
			String j = "Pandhra Rassa"+
						" 1 "+
						"Rs 141/-"+
						"Special Unlimited Offer";
			Information.cart.add(j);
			rrr=rrr+141;

		break;
				
		case "10" : nonVeg();
		break;
		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			ngravy();
		break;

		}
			
		OrderDetails();
	}
}

class NRice extends NonVeg {
		
	//============================  Parameterized Construction  ==================================================================

	NRice( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}

	public void nrice() {
			
		Scanner sc=new Scanner(System.in);
		System.out.println("NonVeg Menu > Rice");
		System.out.println();
		System.out.println("Enter 1 For Egg Biryani");
		NRice  eggbiryani = new NRice("Egg Biryani"," 1 ","Rs 210/-","Perfectly cooked soft");
        System.out.println(eggbiryani);
        System.out.println();
		System.out.println("Enter 2 For Egg Fried Rice");
		NRice eggfriedrice = new NRice("Egg Fried Rice"," 1 ","Rs 210/-","Perfectly cooked soft and Crispy");
		System.out.println(eggfriedrice);
		System.out.println();
		System.out.println("Enter 3 For Chicken Dum Biryani");
		NRice cdumb = new NRice("Chicken Dum Biryani"," 1 ","Rs 210/-","Perfectly cooked soft and Crispy");
		System.out.println(cdumb);
		System.out.println();
		System.out.println("Enter 4 For Mutton Biryani");
		NRice muttonbiryani = new NRice("Mutton Biryani"," 1 ","Rs 215/-","Perfectly cooked soft");
		System.out.println(muttonbiryani);
		System.out.println();
		System.out.println("Enter 5 For Prawns Biryani");
		NRice pbiryani = new NRice("Prawns Biryani"," 1 ","Rs 210/-","Perfectly cooked soft ");
		System.out.println(pbiryani);
		System.out.println();
		System.out.println("Enter 6 For Murgh Pulao");
		NRice murghpulao = new NRice("Murgh Pulao"," 1 ","Rs 192/-","Perfectly cooked Crispy");
		System.out.println(murghpulao);
		System.out.println();
		System.out.println("Enter 7 For Chicken Biryani");
		NRice cbiryani = new NRice("Chicken Biryani"," 1 ","Rs 141/-","Perfectly cooked ");
		System.out.println(cbiryani);
		System.out.println();
		System.out.println("Enter 8 For Mutton Dum Biryani");
		NRice mdumb = new NRice("Mutton Dum Biryani"," 1 ","Rs 141/-","Perfectly cooked soft and Crispy");
		System.out.println(mdumb);
		System.out.println();
		System.out.println("Enter 9 For Mutton Pulao");	
		NRice mpulao = new NRice("Mutton Pulao"," 1 ","Rs 141/-","Perfectly cooked soft");
		System.out.println(mpulao);
		System.out.println();
		System.out.println("Enter 10 For NonVeg Menu");		
		System.out.println();
		
		System.out.print("Enter Your Choice ==>");	
		String g = sc.next();
		System.out.println("=================================================");
	
		switch(g)
		{
		// Egg Biryani
		case "1" : 
			String a = "Egg Biryani"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft";
			Information.cart.add(a);
			rrr=rrr+210;

	    break;
				
		//Egg Fried Rice
		case "2" : 
			String b = "Egg Fried Rice"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(b);
			rrr=rrr+210;

		break;
		
		//Chicken Dum Biryani 	
		case "3" : 
			String c = "Chicken Dum Biryani"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(c);
			rrr=rrr+210;

		break;
		
		//Mutton Biryani
		case "4" : 
			String d = "Mutton Biryani"+
						" 1 "+
						"Rs 215/-"+
						"Perfectly cooked soft";
			Information.cart.add(d);
			rrr=rrr+215;

		break;
		
		//Prawns Biryani
		case "5" : 
			String e = "Prawns Biryani"+
						" 1 "+
						"Rs 210/-"+
						"Perfectly cooked soft";
			Information.cart.add(e);
			rrr=rrr+210;

		break;
		
		//Murgh Pulao	 
		case "6" :
			String f = "Murgh Pulao"+
						" 1 "+
						"Rs 192/-"+
						"Perfectly cooked Crispy";
			Information.cart.add(f);
			rrr=rrr+192;

		break;
		
		//Chicken Biryani
		case "7" :
			String h = "Chicken Biryani"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked";
			Information.cart.add(h);
			rrr=rrr+141;

		break;
		
		//Mutton Dum Biryani
		case "8" : 
			String i = "Mutton Dum Biryani"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft and Crispy";
			Information.cart.add(i);
			rrr=rrr+141;

		break;
		
		//Mutton Pulao
		case "9" : 
			String j = "Mutton Pulao"+
						" 1 "+
						"Rs 141/-"+
						"Perfectly cooked soft";
			Information.cart.add(j);
			rrr=rrr+141;

		break;
		
		
		case "10" : nonVeg();
		break;
		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			nrice();
		break;
		}
		
		OrderDetails();

	}
}

class Breads extends Hotel{
	 
	//============================  Parameterized Construction  ==================================================================

	Breads( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}
	
	
	public void breads() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Main Menu > Breads");
		System.out.println();
		System.out.println("Enter 1 For Chapati");
		Breads chapati = new Breads("Chapati","1","Rs 15/-","Perfectly cooked soft and fluffy whole wheat chapati");
		System.out.println(chapati);
		System.out.println();
		System.out.println("Enter 2 For Butter Chapati");
		Breads bchapati = new Breads("Butter Chapati","1","Rs 35/-","Perfectly cooked soft and fluffy whole wheat chapati, applied Butter");
		System.out.println(bchapati);
		System.out.println();
		System.out.println("Enter 3 For Butter Rumali Roti");
		Breads butterrroti = new Breads("Butter Rumali Roti","1","Rs 65/-","Super thin flour rotis that are served folded like a handkerchief");
		System.out.println(butterrroti);
		System.out.println();
		System.out.println("Enter 4 For Paratha");
		Breads paratha = new Breads("Paratha","1","Rs 40/-","Crisp as well as soft Paratha");
		System.out.println(paratha);
		System.out.println();
		System.out.println("Enter 5 For Butter Paratha");
		Breads bparatha = new Breads("Butter Paratha","1","Rs 40/-","Crisp as well as soft Paratha with Butter");
		System.out.println(bparatha);
		System.out.println();
		System.out.println("Enter 6 For Garlic Naan");
		Breads gnaan = new Breads("Garlic Naan","1","Rs 85/-","White flour mix with Garlic and Coriander leaves");
		System.out.println(gnaan);
		System.out.println();
		System.out.println("Enter 7 For Tandoori Paratha");
		Breads tparatha = new Breads("Tandoori Paratha","1","Rs 70/-","Crisp as well as soft Paratha");
		System.out.println(tparatha);
		System.out.println();
		System.out.println("Enter 8 For Butter Tandoori Paratha");
		Breads btparatha = new Breads("Butter Tandoori Paratha","1","Rs 90/-","Crisp as well as soft Paratha With Butter");
		System.out.println(btparatha);
		System.out.println();
		System.out.println("Enter 9 For Breads");
		System.out.println("Enter 10 For Main Menu");	
		System.out.println();


		System.out.print("Enter Your Choice To Order ==>");	
		String e = sc.next();
		System.out.println("=================================================");
	
		switch(e)
		{
		
		//Chapati
		case "1" : 
			String a = "Chapati"+
					   "1"+
					   "Rs 15/-"+
					   "Perfectly cooked soft and fluffy whole wheat chapati";
			Information.cart.add(a);
			rrr=rrr+15;

			break;
	
		//Butter Chapati
		case "2" :
			String b = "Butter Chapati"+
						"1"+
						"Rs 35/-"+
						"Perfectly cooked soft and fluffy whole wheat chapati, applied Butter";
			Information.cart.add(b);
			rrr=rrr+35;

			break;	

		// Butter Rumali Roti
		case "3" :
			String c = "Butter Rumali Roti"+
					   "1"+
					   "Rs 65/-"+
					   "Super thin flour rotis that are served folded like a handkerchief";
			Information.cart.add(c);
			rrr=rrr+65;

			break;	
		
		//Paratha
		case "4" :
			String d = "Paratha"+
						"1"+
						"Rs 40/-"+
					    "Crisp as well as soft Paratha";
			Information.cart.add(d);
			rrr=rrr+40;

			break;
		
		//Butter Paratha
		case "5" :
			String j = "Butter Paratha"+
					"1"+
					"Rs 40/-"+
					"Crisp as well as soft Paratha with Butter";
			Information.cart.add(j);
			rrr=rrr+40;
		
			break;
		
		//Garlic Naan
		case "6" :
			String k = "Garlic Naan"+
						"1"+
						"Rs 85/-"+
						"White flour mix with Garlic and Coriander leaves";
			Information.cart.add(k);
			rrr=rrr+85;

			break;
			
		//Tandoori Paratha
		case "7" :
			String l = "Tandoori Paratha"+
						"1"+
						"Rs 70/-"+
						"Crisp as well as soft Paratha";
			Information.cart.add(l);
			rrr=rrr+70;

			break;
		
		//Butter Tandoori Paratha
		case "8" :
			String m = "Butter Tandoori Paratha"+
						"1"+
						"Rs 90/-"+
						"Crisp as well as soft Paratha";
			Information.cart.add(m);
			rrr=rrr+90;

			break;
		
		
		case "9" : breads();
		
			break;
		
		case "10" : mainMenu();
		break;
		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			breads();
			
			break;
		}
		
		OrderDetails();
		
	}
}


class Drinks extends Hotel{
	
	//============================  Parameterized Construction  ==================================================================

	Drinks( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}
	
	public void drinks() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Main Menu > Drinks");
		System.out.println();
		System.out.println("Enter 1 For Solkadhi");
		Drinks solkadhi = new Drinks("Solkadhi","2","Rs 50/-","Made with kokam Aggal");
		System.out.println(solkadhi);
		System.out.println();
		System.out.println("Enter 2 For Falooda");
		Drinks falooda = new Drinks("Falooda","1","Rs 70/-","Madeup of toned milk added with crushed dry fruit's and flavoured with various Ice Cream");
		System.out.println(falooda);
		System.out.println();
		System.out.println("Enter 3 For Mojitos");
		Drinks mojitos = new Drinks("Mojitos","1","Rs 65/-","Mocktail");
		System.out.println(mojitos);
		System.out.println();
		System.out.println("Enter 4 For Smoothies");
		Drinks smoothies = new Drinks("Smoothies","1","Rs 60/-","Mixtured of toned Milk and Fruit's");
		System.out.println(smoothies);
		System.out.println();
		System.out.println("Enter 5 For Fresh Fruit juice");
		Drinks fruitjuice = new Drinks("Fresh Fruit juice","1","Rs 40/-","Mixtured of toned Milk and Fruit's");
		System.out.println(fruitjuice);
		System.out.println();
		System.out.println("Enter 6 For Nimbu Juice");
		Drinks nimbujuice = new Drinks("Nimbu Juice","1","Rs 15/-","Made of fresh Lime and Mint");
		System.out.println(nimbujuice);
		System.out.println();
		System.out.println("Enter 7 For Soft drinks");
		Drinks softdrinks = new Drinks("Soft drinks"," 1 ","Rs 40/-","Coke,Thumbs Up,Sprite");
		System.out.println(softdrinks);
		System.out.println();
		System.out.println("Enter 8 For Lassi");
		Drinks lassi = new Drinks("Lassi"," 1 ","Rs 50/-","Curd and Sugar toped with malai");
		System.out.println(lassi);
		System.out.println();
		System.out.println("Enter 9 For Drinks");
		System.out.println("Enter 10 For Main Menu");	
		System.out.println();


		System.out.print("Enter Your Choice ==>");		
		String f = sc.next();
		System.out.println("=================================================");
		
		
		
		switch(f)
		{
		//Solkadhi
		case "1" : 
			String a = "Solkadhi"+
						"2"+
						"Rs 50/-"+
						"Made with kokam Aggal";
			Information.cart.add(a);
			rrr=rrr+50;

			break;
	
		//Falooda
		case "2" :
			String b = "Falooda"+
						"1"+
						"Rs 70/-"+
						"Falooda\",\"1\",\"Rs 70/-\",\"Madeup of toned milk added with crushed dry fruit's and flavoured with various Ice Cream";
			Information.cart.add(b);
			rrr=rrr+70;

			break;	

		//Mojitos
		case "3" :
			String c = "Mojitos"+
						"1"+
						"Rs 65/-"+
						"Mocktail";
			Information.cart.add(c);
			rrr=rrr+65;

			break;	
		
		//Smoothies
		case "4" :
			String d = "Smoothies"+
						"1"+
						"Rs 60/-"+
						"Mixtured of toned Milk and Fruit's";
			Information.cart.add(d);
			rrr=rrr+60;

			break;
		
		//Fresh Fruit juice
		case "5" :
			String e = "Fresh Fruit juice"+
						"1"+
						"Rs 40/-"+
						"Mixtured of toned Milk and Fruit's";		
		Information.cart.add(e);
		rrr=rrr+40;

			break;
		
		//Nimbu Pani
		case "6" :
			String g = "Nimbu Juice"+
						"1"+
						"Rs 15/-"+
						"Made of fresh Lime and Mint";
			Information.cart.add(g);
			rrr=rrr+15;

			break;
			
		//Soft drinks
		case "7" : 
			String h = "Soft drinks"+
						" 1 "+
						"Rs 40/-"+
						"Coke,Thumbs Up,Sprite";
			Information.cart.add(h);
			rrr=rrr+40;

		break;
		
		//Lassi
		case "8" : 
			String i = "Lassi"+
						" 1 "+
						"Rs 50/-"+
						"Curd and Sugar toped with malai";
			Information.cart.add(i);
			rrr=rrr+50;

		break;		
		
		case "9" : drinks();
		
			break;
		
		case "10" : mainMenu();
		break;

		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			drinks();
		break;
		}
		
		OrderDetails();
	}
}

class Desserts extends Hotel{
	
	//============================  Parameterized Construction  ==================================================================

	Desserts( String Product , String Quantity, String Price , String Description )
	{
		this.product = Product;
		this.quantity = Quantity;
		this.price = Price;
		this.description = Description;
	}
	
	public void desserts(){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Main Menu > Desserts");
		System.out.println();
		System.out.println("Enter 1 For Puran Poli");
		Desserts  puranpoli = new Desserts("Puran Poli","2","Rs 50/-","Perfectly cooked soft and sweet");
		System.out.println(puranpoli);
		System.out.println();
		System.out.println("Enter 2 For Modak");
		Desserts modak = new Desserts("Modak","1","Rs 70/-","Perfectly cooked soft and filled with mixture of greated coconut with chopped dry fruit's");
		System.out.println(modak);
		System.out.println();
		System.out.println("Enter 3 For Shrikhand");
		Desserts shrikhand = new Desserts("Shrikhand","1","Rs 65/-","Creamy Mango Flavoured");
		System.out.println(shrikhand);
		System.out.println();
		System.out.println("Enter 4 For Basundi");
		Desserts basundi = new Desserts("Basundi","1","Rs 60/-","Madeup of toned milk added with crushed dry fruit's and flavoured with elaichi issence");
		System.out.println(basundi);
		System.out.println();
		System.out.println("Enter 5 For Aamras");
		Desserts aamras = new Desserts("Aamras","1","Rs 40/-","It is a juice of Mango");
		System.out.println(aamras);
		System.out.println();
		System.out.println("Enter 6 For Kheer");
		Desserts kheer = new Desserts("Kheer","1","Rs 15/-","Madeup of toned milk added with crushed dry fruit's and flavoured with various issence");
		System.out.println(kheer);
		System.out.println();
		System.out.println("Enter 7 For Gulab Jamun");
		Desserts gulabjamun = new Desserts("Gulab Jamun"," 1 ","Rs 40/-","Premixed and Milk Powder");
		System.out.println(gulabjamun);
		System.out.println();
		System.out.println("Enter 8 For Rabri");
		Desserts rabri = new Desserts("Rabri"," 1 ","Rs 50/-","Madeup of toned milk added with crushed dry fruit's");
		System.out.println(rabri);
		System.out.println();
		System.out.println("Enter 9 For Desserts");
		System.out.println("Enter 10 For Main Menu");	
		System.out.println();

		System.out.print("Enter Your Choice ==>");		
		String g = sc.next();
		System.out.println("=================================================");
		
		switch(g)
		{
		// Puran Poli
		case "1" : 
			String a = "Puran Poli"+
						"2"+
						"Rs 50/-"+
						"Perfectly cooked soft and sweet";
		Information.cart.add(a);
		rrr=rrr+50;

			break;
	
		//Modak
		case "2" :
			String b = "Modak"+
						"1"+
						"Rs 70/-"+
						"Perfectly cooked soft and filled with mixture of greated coconut with chopped dry fruit's";
			Information.cart.add(b);
			rrr=rrr+70;

			break;	

		//Shrikhand
		case "3" :
			String c = "Shrikhand"+
						"1"+
						"Rs 65/-"+
						"Creamy Mango Flavoured";
			Information.cart.add(c);
			rrr=rrr+65;

			break;	
		
		//Basundi
		case "4" :
			String d = "Basundi"+
						"1"+
						"Rs 60/-"+
						"Madeup of toned milk added with crushed dry fruit's and flavoured with elaichi issence";
			Information.cart.add(d);
			rrr=rrr+60;

			break;
		
		//Aamras
		case "5" :
			String e = "Aamras"+
						"1"+
						"Rs 40/-"+
						"It is a juice of Mango";
			Information.cart.add(e);
			rrr=rrr+40;

			break;
		
		//Kheer
		case "6" :
			String f = "Kheer"+
						"1"+
						"Rs 15/-"+
						"Madeup of toned milk added with crushed dry fruit's and flavoured with various issence";
			Information.cart.add(f);
			rrr=rrr+15;

			break;
			
		//Gulab Jamun
		case "7" : 
			String h = "Gulab Jamun"+
						" 1 "+
						"Rs 40/-"+
						"Premixed and Milk Powder";
			Information.cart.add(h);
			rrr=rrr+40;

		break;
		
		//Rabri
		case "8" : 
			String i = "Rabri"+
						" 1 "+
						"Rs 50/-"+
						"Madeup of toned milk added with crushed dry fruit's";
		Information.cart.add(i);
		rrr=rrr+50;

		break;
		
		case "9" : desserts();
		
			break;
		
		case "10" : mainMenu();
		break;

		
		default :
			System.out.println();
			System.out.println("=================================================");
			System.out.println("Enter Valid Input");
			System.out.println("=================================================");
			desserts();
		break;
		}
		
		OrderDetails();
		
	}
}
