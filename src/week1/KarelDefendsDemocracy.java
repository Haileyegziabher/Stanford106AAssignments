package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		
		while (frontIsClear()) {
		    move();
		    checkMiddleBeeper();
		    pickExtraBeepers();
		    move();
		    }
		}
		
	
	private void checkMiddleBeeper() {
		  
		if (beepersPresent()) {
		    move();
		    move();
		  }
		}
		
	
	private void pickExtraBeepers() {
		  if (noBeepersPresent()) {
		    cleanBeepersBottomSide();
		    cleanBeepersUpperSide();


		  }
		}
		
		
	
	private void cleanBeepersBottomSide() {
		  turnRight();
		  move();
		  
		  while (beepersPresent()) {
		    pickBeeper();
		  	}
		  	turnAround();
		  	move();
			}
		
		
	
	private void cleanBeepersUpperSide() {
		
		
		move() ;
	
		while (beepersPresent()) {
		    pickBeeper();
		    }
		turnAround();
		move();
		turnLeft();				
		
	}
}
