import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //how to get user input from console. create object called Scanner, sc = identifier. Scanner is a data type like int, double,string etc. Imported line 1 by right clicking scanner. Can now get input from the user.
		
		System.out.print("Enter your name: ");
	//	sc.nextLine(); //receives input form user. You can type in your name. 
		String name = sc.nextLine(); //can create a new variable of value sc.nextLine(). Next line returns string so can store as a variable of type string.  
	
		System.out.println("Welcome, " + name);
		
		System.out.println("Select an option.");
		System.out.println("1) add candybar to shopping cart:1.99");
		System.out.println("2) add cheese to shopping cart:6/95");
		System.out.println("3) add soccer ball to shopping cart:12.99");
		
		int selection = sc.nextInt(); //user enters option
		double total = 0;  //default total before they select 
		
		
	}
}

