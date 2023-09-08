public class Main {
  private String accountNumber;
  private double balance;
  private String accountHolderName;

  // Constructor
  public Main(String accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }

  // Getter methods
  public String getAccountNumber() {
    return accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  // Setter method for deposit
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println(amount + " deposited successfully.");
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  // Setter method for withdrawal
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println(amount + " withdrawn successfully.");
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }

  public static void main(String[] args) {
    // Create a new bank account
    Main account = new Main("123456789", 1000.0, "John Doe");

    // Display initial account information
    System.out.println("Account Number: " + account.getAccountNumber());
    System.out.println("Account Holder: " + account.getAccountHolderName());
    System.out.println("Balance: $" + account.getBalance());

    // Deposit some money
    account.deposit(500.0);
    System.out.println("Balance after deposit: $" + account.getBalance());

    // Attempt to withdraw an amount greater than the balance
    account.withdraw(2000.0);
    System.out.println("Balance after invalid withdrawal: $" + account.getBalance());

    // Withdraw a valid amount
    account.withdraw(300.0);
    System.out.println("Balance after withdrawal: $" + account.getBalance());
  }
}

// Note: 1. Accessor/Getter: It must have the same type as the returned
// variable.
// It does not need to have arguments.
// 2. Mutator/Setter : It should have as parameter, the value to be assigned to
// the data member. The parameter must be of the same type as the data member.
// Does not need to return a value.
// In mutator/setter function, data should be validated before setting it to
// private data members.
