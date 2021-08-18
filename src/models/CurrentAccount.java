package models;

import javax.swing.JOptionPane;
 
public class CurrentAccount extends Account implements Transactions<Account> {

	@Override
	public void withDraw(Account ac, double value) {
		String wantToAddCheckLimit = JOptionPane.showInputDialog("Do you want to add your checkLimit to withdraw? [Y/N]");
			if (wantToAddCheckLimit.equals("Y")) {value = value + 3.90 + checkLimit();}
			else {value = value + 3.90;}
		super.setBalance(value);
		System.out.println("Your withDraw: " + value + "\n"
						+ "WithDraw Tax: 3.90 \n"
						+ "Your New Balance: " + super.getBalance());
	}
	
	public double checkLimit() {
		double checkLimitValue = 1500;
		return checkLimitValue;
	}
}
