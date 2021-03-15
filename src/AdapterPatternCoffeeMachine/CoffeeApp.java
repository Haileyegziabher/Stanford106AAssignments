package AdapterPatternCoffeeMachine;

public class CoffeeApp {
	public static void main(String[] args) {
		OldCoffeeMachine old = new OldCoffeeMachine();
		CoffeeTouchscreenApapter touchScreenObj = new CoffeeTouchscreenApapter(old);
		touchScreenObj.chooseFirstSelection();
		touchScreenObj.chooseSecondSelection();
	}
	

}
