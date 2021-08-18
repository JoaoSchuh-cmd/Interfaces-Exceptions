package models;

public class SavingAccount extends Account implements Transactions<Account>  {
	public SavingAccount() {
		System.out.println("Your income: " + income());
		//PEDIR PARA PROFESSOR SOBRE ISSO
		super.setBalance(-income());
	}
	
	@Override
	public void withDraw(Account ac, double value) {
		System.out.println("Your actual balance is: " + super.getBalance());
		super.setBalance(value);
		System.out.println("Your withDraw: " + value + "\n"
						+ "Your New Balance: " + super.getBalance());
	}
	
	public double income() {
		double income = super.getBalance() * 0.2;
		return income;
	}
}
