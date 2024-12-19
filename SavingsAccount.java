public class SavingsAccount implements BankAccount {
	private int accountNumber;
	private String accountName;
	private double balance;
	
	// Setters (allowed as per instructions)
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String showAccountType() {
		return "Savings Account";
	}

	@Override
	public double getInterestRate() {
		return 0.01; // 1% interest
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public String showBenefits() {
		return "Standard Savings Account";
	}

	@Override
	public double computeBalanceWithInterest() {
		return this.balance + (this.balance * getInterestRate());
	}

	@Override
	public String showInfo() {
		return "Account number: " + accountNumber + "\n" +
			   "Account name: " + accountName + "\n" +
			   "Balance: " + balance;
	}
}
