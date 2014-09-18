package MainPackagel;

public class Test {
	
	public static void main (String [] args) {
			
		Account tester = new Account(1122, 20000);
			
		tester.setId(1122);
		tester.setBalance(20000);
		tester.setannualRate(4.5);
		tester.deposit(3000);
		
		System.out.println("Your account was created on " + tester.getdateCreated());
		System.out.println("Your balance is $" + tester.getBalance());
		System.out.println("Your monthly interest is " + tester.getMonthlyInterestRate() + "%");		
	
	      try {
	         System.out.println("Withdrawing, balance is now $" + tester.withdraw(2500));
	      }
	      catch(InsufficientFundsException a) {
	         System.out.println("Sorry you are short $" + a.getAmountNeeded());
	         a.printStackTrace();
	      }
	}
}
