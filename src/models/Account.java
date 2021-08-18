package models;

import java.io.Serializable;

public class Account implements Serializable {
	double balance = 5000;
	
	public void setBalance(double value) {
		this.balance = balance - value;
	}
	public double getBalance() {
		 return balance;
	}
}
