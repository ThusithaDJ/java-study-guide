package threads.volatiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BankAccount {

	private String accNo;
	private volatile double balance;
	private List<Double> amountList;
	
	public BankAccount(String accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		amountList = new ArrayList<>();
	}
	
	public double deposite(double amount) {
		this.balance += amount;
		amountList.add(amount);
		return this.balance;
	}
	
	public double withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			amountList.add(-amount);
		} else {
			throw new IllegalArgumentException("Insuficient funds");
		}
		return this.balance;
	}
	public List<Double> getAmountList() {
		return this.amountList;
	}
}
