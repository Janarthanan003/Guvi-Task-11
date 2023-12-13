package oopsconcept;

public class BankAccount {
	private String Accountnumber;
	private double Balance;
	public BankAccount() {
		this.Accountnumber="Default";
		this.Balance=0.0;
	}
	public BankAccount(String Accountnumber,double Balance) {
		this.Accountnumber=Accountnumber;
		this.Balance=Balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			Balance+=amount;
			System.out.println("Deposited: $" + amount);
			displayBalance();
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
	}
	public void displayBalance() {
        System.out.println("Current Balance: $" + Balance);
    }
	public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount("B67890", 500.0);
        System.out.println("Account created with default values.");
        System.out.println("\nAccount created with account number 'B67890' and initial balance $500.");
        account.displayBalance();
        account.deposit(500.0);
        account.deposit(200.0);
    }
	}
}
        



		