package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int number = readInt("Enter number: ");
		for (int i=0; i<=number; i++) {
			println(findFib1(i));
      
		}

		}
	
	
	public static int findFib(int number){ 
		if(number == 1 || number == 2){
		return 1; 
		} 
		return findFib(number-1) + findFib(number -2);
	}
	
	
	public static int findFib1(int number) {
	
		
		
		if (number == 0) {
			return 0;
		}
		
		
		if (number ==1 || number == 2) {
			return 1;
		}
	
		
		int a = 1, b=1, c=2;
		for(int i=3; i<number; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
		
	}
}