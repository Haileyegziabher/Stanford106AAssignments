package week4;

import acm.program.ConsoleProgram;
import acmx.export.java.util.HashMap;

public class NameCounts extends ConsoleProgram {
	HashMap<String, Integer> list = new HashMap<String, Integer>();
	
	public void run() {
	 HashMap<String, Integer> list = new HashMap<String, Integer>();


		while(true) {
			int count = 1;
			String name = readLine("Enter name: ");
			
			if(name.equals("")) break; //If user presses enter, input stops
			
			if(checkIfKeyExists(name)){		
				list.put(name, count);
			}else if(!checkIfKeyExists(name)) {
				list.put(name, list.get(name)+1);
			}
		}
		for(String names : list.keySet()) {
			println("Entry: " + names + " has count " + list.get(names));
		}
	}
	
	private boolean checkIfKeyExists(String name) {

		for(String checkKeys : list.keySet()) {
			if(list.containsKey(name)) {
				return false;
			}
		}		
		return true;
	}
		
}
