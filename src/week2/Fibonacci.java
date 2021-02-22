package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	private static final int MAX_TERM_VALUE = 10000;


	public void run() {
		println("This program list the Fibonacci numbers.");
		int number = readInt("Enter number: ");
		Fibona(number);
	}
	
	
	public void Fibona(int number) {
		int a = 0;
		int b =1;
		
		while(a < MAX_TERM_VALUE) {
			println(a);
			int c = a+b;

			a=b;
			b=c;

		}
	}
}

	
