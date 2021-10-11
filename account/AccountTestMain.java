package account;

import java.util.Scanner;

public class AccountTestMain {
	public static void main(String[] args) {
		Account account1 = new Account(500);
		Account account2 = new Account(-150);
		System.out.println("account1 balance:" + account1.getBalance());
		System.out.println(" account2 balance:" + account2.getBalance());
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter deposit amount of account1:");
		double depositAmount = scanner.nextDouble();
		System.out.println("account1  deposit amount is:" + depositAmount);
		account1.deposit(depositAmount);
		System.out.println("after deposit total balance is:" + account1.getBalance());
		System.out.println("enter debit amount of account1:");
		double debitAmount = scanner.nextDouble();
		System.out.println("account1 debit amount is:" + debitAmount);
		if (account1.getBalance() >= debitAmount) {
			account1.debit(debitAmount);
			System.out.println("after debit remaining balance is:" + account1.getBalance());
		} else
			System.out.println("Debit amount exceeded account balance");
		System.out.println("enter deposit amount of account2:");
		depositAmount = scanner.nextDouble();
		System.out.println("account2 deposit amount is:" + depositAmount);
		account2.deposit(depositAmount);
		System.out.println(" after deposit total balance is:" + account2.getBalance());
		System.out.println("enter debit amount of account2:");
		debitAmount = scanner.nextDouble();
		System.out.println("account2 debit amount is:" + debitAmount);
		if (account2.getBalance() >= debitAmount) {
			account2.debit(debitAmount);
			System.out.println("after debit remaining balance is:" + account2.getBalance());
		} else
			System.out.println("Debit amount exceeded account balance");
	}
}
