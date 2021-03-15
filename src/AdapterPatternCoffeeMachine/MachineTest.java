package AdapterPatternCoffeeMachine;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MachineTest {

	@Test
	public void test() {
		OldCoffeeMachine oldMachine= new OldCoffeeMachine();
		oldMachine.selectA();
		String output = oldMachine.selectA();
		assertEquals("Selected A flavor: Vanilla",output);
	}

}
