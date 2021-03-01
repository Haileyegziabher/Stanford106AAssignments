package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	
	private static final long serialVersionUID = 1L;

	public void run() {
	         while (true) {
	String digits = readLine("Enter a numeric string: "); 
	if (digits.length() == 0) break; 
		println(addCommasToNumericString(digits));
	         }
	}


		private String addCommasToNumericString(String digits) {
			String result = "";
			int counter = 0;
			for (int i =  digits.length()- 1; i>= 0; i--) {
				result = digits.charAt(i) + result;
				counter++;
				if ((counter % 3 ==0 && counter > 0)) {
					result = "," + result;
				}
			}
			return result;
	}
}
