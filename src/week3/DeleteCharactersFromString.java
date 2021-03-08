package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		
		while (true) {
			
			String word = readLine("Enter a character string: "); 
			if (word.isEmpty()) 
				break; 
			
			String toDelete = readLine("Enter the character you want to delet.(Case Sensitive): ");
			char cha = toDelete.charAt(0);	
			
			println(DeleteCharactersFromString(word, cha));
			         }
			}

	private String DeleteCharactersFromString(String word, char cha) {
		
		String result = "";
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) != cha) {
				result = result + word.charAt(i);
			}
		}
		
		
		return result;
	}

}