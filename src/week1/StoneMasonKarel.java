package week1;
/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;



public class StoneMasonKarel extends SuperKarel {

	public void run() {
		
		for(int i=0; i<12; i++) {
			
			if(frontIsClear()) {
				move();
				while(frontIsBlocked()) {
					checkLeft();
				}
			} else {
				checkOtherRow();
			}
		}
	}
		
			
			
		public void checkOtherRow() {
			checkLeft();
//			checkRight();
		}
		 
		
		
		public void checkLeft() {
			if(frontIsBlocked()) {
				turnLeft();
				while(frontIsClear())
				move();
				turnLeft();
			}
		}
}
		
			
			
			
			
			
		
//		while(frontIsClear()) {
//			move();
////			checkFirstRow();
////			checkNextRow();
//			otherRow();
//		
//		}
//	}
		
		
		
			
	
	
//	public void checkFirstRow() {
//		while(frontIsClear()) {
//			move();
//			
//			if(beepersPresent()) {
//				pickBeeper();
//			}
//		}
//
//	}
//	
//	public void checkNextRow() {
//		while(frontIsBlocked()) {
//			turnLeft();
//			move();
//			turnLeft();
//			if(beepersPresent()) {
//				pickBeeper();
//				pickBeeper();
//				move();
//			}	
//			
//			
//		}
//		
//		if(frontIsBlocked()) {
//			turnRight();
//			move();
//			turnRight();
//			
//			if(beepersPresent()) {
//				pickBeeper();
//				move();
//			}
//		}
//		
//		
//		
//	}
	
	
//	public void otherRow() {
//		
//		
//		for(int i=1; i<11; i--) {
//			
//			if(frontIsClear()) {
//				turnLeft();
//				move();
//				turnLeft();
//				move();
//			}





	
	