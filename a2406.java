package a2406;
class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;
	
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited: " + amount);
	}
	
	void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void displayBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void displayDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}
}

public class a2406 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b = new BankAccount();
		
		b.accountNumber = 101;
		b.accountHolderName = "Kapil";
		b.balance = 5000;
		b.displayDetails();
		b.deposit(2000);
		b.displayBalance();
		b.withdraw(1500);
		b.displayBalance();
	}
}


