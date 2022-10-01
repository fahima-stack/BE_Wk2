
public class Loops {


	public static void main(String[] args) {
		//Loops allow performing action over and over again (repeat code) until condition is met e.g. scoop 4 cups of flour into bowl for baking. Loops will scoop flour into cup until right amount met for cup.
        //Types of loops: 'for loop'(for)- if you have a specific no. of iterations you want to perform, or have a group of items with a known no. of items and you want to perform something for each one. 
		//variable initialisation i=0 (if this value evaluates the boolean expression as true, code will run and continue until expression is met i<10 at i++ increments); to iterate = to execute the code within the for loop a certain no. of times.
		//boolean expression; going to iterate as long as i<10; increasing i by 1 after every iteration. 
		for (int i = 0; i < 10; i++) { //(variable i=0; boolean expression condition; post iteration/increment) 	
			System.out.println(i); //prints 0-9 in increments of 1
		}
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i); //prints 1-10 in increments of 1
		}
		
		for (int i = 0; i < 100; i+= 2) {
			System.out.println(i); //prints 0-100 in increments of 2
		}
		
		for (int i=0; i < 100; i++) {
			if (i % 2 == 0) 
				System.out.println(i); //this method has same output as line 18 but 2 step, longer code as i is being incremented each time and i is being evaluated as true or false every other time. 
		}
		
//Loop type: while loop; like for loop, performs action repeatedly until condition is met but have less knowledge of how many iterations is needed. E.g. want to write code on a file for each line but don't know how many lines there are. 
		int x = 0;
		while (x < 10) { //without line 31, loop would print 0 forever as it always evaluates as true. 
			System.out.println(x);
			x++; //prints 0-9 in increments
		//need to have a condition (line 32) such that loop will eventually evaluate to false (+ loop stops iterating) or loop will run forever and crash.
		}
		
		// do while loop vs while loop
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
