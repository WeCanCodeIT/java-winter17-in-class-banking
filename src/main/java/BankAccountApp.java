import java.math.BigDecimal;
import java.util.Scanner;

public class BankAccountApp {

	public static void main(String[] args) {

		BigDecimal startingCheckingBalance = new BigDecimal("12.34");
		Account myChecking = new CheckingAccount(startingCheckingBalance);
		System.out.println("Checking account type is " + myChecking.getAccountType());

		System.out.println("Balance is " + myChecking.getBalance());
		myChecking.update();
		System.out.println("After update, balance is " + myChecking.getBalance());
		
		BigDecimal amountToDeposit = new BigDecimal("1000.00");
		myChecking.deposit(amountToDeposit);
		System.out.println("After deposit, balance is " + myChecking.getBalance());
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Choose an option:");
//		
//		System.out.println("1. View balance for checking");
		// more options here
		
//		int response = input.nextInt();
		
//		switch(response) {
//		
//		case 1:
//			// do something
//			break;
//		}
	}

}
