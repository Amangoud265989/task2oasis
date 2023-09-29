
		import java.util.Scanner;
		class Account {
		    private String accountNumber;
		    private double balance;

		    public Account(String accountNumber, double balance) {
		        this.accountNumber = accountNumber;
		        this.balance = balance;
		    }

		    public String getAccountNumber() {
		        return accountNumber;
		    }

		    public double getBalance() {
		        return balance;
		    }

		    public void deposit(double amount) {
		        balance += amount;
		    }

		    public void withdraw(double amount) {
		        if (amount > balance) {
		            System.out.println("Insufficient funds");
		        } else {
		            balance -= amount;
		            System.out.println("Withdrawal successful. Remaining balance: " + balance);
		        }
		    }
		}

		class ATM {
		    private Account account;

		    public ATM(Account account) {
		        this.account = account;
		    }

		    public void displayMenu() {
		    	System.out.println("=======================OASIS INFOBYTE======================");
		    	System.out.println("=======================TASK======3====================");
		    	System.out.println("--------------------ATM USER INTERFACE---------------------");
		        System.out.println("Welcome to the ATM");
		        System.out.println("1. Check Balance");
		        System.out.println("2. Deposit");
		        System.out.println("3. Withdraw");
		        System.out.println("4. Exit");
		    }

		    public void processTransaction() {
		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            displayMenu();
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Balance: " + account.getBalance());
		                    break;

		                case 2:
		                    System.out.print("Enter deposit amount: ");
		                    double depositAmount = scanner.nextDouble();
		                    account.deposit(depositAmount);
		                    break;

		                case 3:
		                    System.out.print("Enter withdrawal amount: ");
		                    double withdrawalAmount = scanner.nextDouble();
		                    account.withdraw(withdrawalAmount);
		                    break;

		                case 4:
		                    System.out.println("======Thank you for using the ATM. Goodbye! VISIT AGAIN======");
		                    return;

		                default:
		                    System.out.println("=====Invalid choice. Please try again.=====");
		            }
		        } while (true);
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        // Sample account details
		        String accountNumber = "123456";
		        double initialBalance = 1000.0;

		        Account account = new Account(accountNumber, initialBalance);
		        ATM atm = new ATM(account);
		        atm.processTransaction();
		    }
		}

		
		
	


