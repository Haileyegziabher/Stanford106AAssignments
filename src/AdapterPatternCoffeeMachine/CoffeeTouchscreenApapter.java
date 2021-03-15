package AdapterPatternCoffeeMachine;

public class CoffeeTouchscreenApapter implements CoffeeMachine {
OldCoffeeMachine oldObj;
	
	public CoffeeTouchscreenApapter(OldCoffeeMachine oldMachineObject) {
		oldObj=oldMachineObject;
	}
	public void chooseFirstSelection() {
		System.out.println(oldObj.selectA());
	}
	public void chooseSecondSelection() {
		System.out.println(oldObj.selectB());
	}
	
}
