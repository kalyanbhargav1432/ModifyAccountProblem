package account;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}

	public void debit(double amount) {
		balance = balance - amount;
	}

	public double getBalance() {
		return balance;
	}
}
