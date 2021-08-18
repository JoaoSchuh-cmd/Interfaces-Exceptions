package models;

import java.io.Serializable;

public interface Transactions <Account extends Serializable> {
	void withDraw(Account ac, double value);
	
	//COMO PEGAR O BALANÇO DA ACCOUNT AQUI DENTRO DESSE MÉTODO
	default double deposit(double depositValue, double balance) {
		double newBalance = balance + depositValue;
		return newBalance;
	}
}
