package meritAmericaBank;

public class SavingAccount extends CheckingAccount {
	
	private static final double ANNUAL_INTEREST_RATE =  .01;

	public SavingAccount(double openingBalance) {
		super(openingBalance);
	}

	public String toString(){
		return "Savings Account Balance: $" + currentBalance + "\n" +
			"Savings Account Interest Rate: " + ANNUAL_INTEREST_RATE*100 + "\n" +
			"Savings Account Balance in 3 years: $" + futureValue(3) + "\n";		
	}


}

