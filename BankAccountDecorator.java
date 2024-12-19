public abstract class BankAccountDecorator implements BankAccount {
	protected BankAccount bankAccount;
	
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
}
