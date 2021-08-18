package runner;

import models.*;

public class Main {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.withDraw(new Account(), 200.00);
		savingAccount.deposit(200, 5000);
		
		System.out.println("\n");
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.withDraw(new Account(), 200.00);
		currentAccount.deposit(200, 5000);
	}
}
