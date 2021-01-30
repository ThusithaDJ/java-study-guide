package threads.volatiles;

public class BankAccount {

	private String accNo;
	private volatile double balance;
	
	public BankAccount(String accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public double deposite(double amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public double withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			throw new IllegalArgumentException("Insuficient funds");
		}
		return this.balance;
	}
}
