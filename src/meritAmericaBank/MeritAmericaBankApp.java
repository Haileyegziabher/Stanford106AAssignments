package meritAmericaBank;

public class MeritAmericaBankApp {
	
	public static void main(String args[]) {
		// 1. Instantiate an account holder with a checking balance of $100 and a savings balance of $1000
		AccountHolder myAccount = new AccountHolder("Tizz", "Tiz", "Tizz", "571-3889-347", 200.0, 10000.0);
		
		// 2. Display the account holder's toString() output
		System.out.println(myAccount.toString());

		// 3. Deposit $500 into the checking account
		myAccount.getCheckingAccount().deposit(1000);

		// 4. Withdraw $800 from the savings account
		myAccount.getSavingsAccount().withdraw(500);
		// 5. Display the checking account toString() output
		myAccount.getCheckingAccount().toString();
		System.out.println(myAccount.getCheckingAccount().toString());
		System.out.println("========================================");
		// 6. Display the savings account toString() output
		// 7. Instantiate another account holder with a checking balance of $200 and a savings balance of $500
		// 8. Deposit -$500 into the checking account
		// 9. Withdraw $600 from the savings account
		// 10. Display the second account holder's toString() output
	
	}
	

}
