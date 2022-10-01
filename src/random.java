
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 0;
//		while (x < 10) { //without line 31, loop would print 0 forever as it always evaluates as true. 
//			System.out.println(x);
//			x++; //prints 0-9 in increments
//		//need to have a condition (line 32) such that loop will eventually evaluate to false (+ loop stops iterating) or loop will run forever and crash.
//		}
		int y = 10; //while loop = line 37 won't print y=10, but do while loop = line 41 will print 10. 
		while (y < 10) {
			System.out.println(y); //doesn't print – while loop checks condition at beginning.
			y++; 
		}
		do { //syntax for do while loop: while is moved to the end and finished with ;  
			System.out.println(y);  //prints 10 - do while loop always executes/iterates at least once; then it checks the condition (boolean expression)  at the end of the loop and if it's false will stop. 
			y++;
		} while (y < 20);  //prints 10-19
  
		
	}

}
