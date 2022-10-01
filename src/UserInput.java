import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) { //java suggested instead of Scanner sc = Scanner(System.in) 
			//how to get user input from console. create object called Scanner, sc = identifier. Scanner is a data type like int, double,string etc. Imported line 1 by right clicking scanner. Can now get input from the user.
			
			System.out.print("Enter your name: ");
//	sc.nextLine(); //receives input form user. You can type in your name. 
			String name = sc.nextLine(); //can create a new variable of value sc.nextLine(). Next line returns string so can store as a variable of type string.  

			System.out.println("Welcome, " + name);
			
			int selection = 0; //0 as default. has to be before the loop so switch can be performed if while evaluates to false. 
			double total = 0;  //default total before they select. has to be before loop as well. 
			
			while (selection != 4) { //wrapping the switch statement in a while loop. if selection not equal to true, loop is true and will perform iteration.  
			System.out.println("Select an option.");
			System.out.println("1) add candybar to shopping cart:1.99");
			System.out.println("2) add cheese to shopping cart:6.95");
			System.out.println("3) add soccer ball to shopping cart:12.99");
			System.out.println("4) check out"); //to wrap the switch statement in a loop so user can keep picking until finished shopping. 
			
			selection = sc.nextInt(); //user enters option and selection is set to this 
			
			switch (selection) {  
			case 1:
					total += 1.99;
			case 2:
					total += 6.95;
			case 3:
					total += 12.99;
					break;
			case 4:
					break;
				default:
					System.out.println("Please pick a valid option."); //If they don't pick,  this will print 
				}
			}
			
			
			System.out.println("Your current total is: " + total); }
		} 
		
	}


