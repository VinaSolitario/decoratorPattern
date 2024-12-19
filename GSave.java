public class GSave extends BankAccountDecorator {

	public GSave(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	@Override
	public String showAccountType() {
		return "GSave";
	}

	@Override
	public double getInterestRate() {
		return 0.025; // 2.5% interest
	}

	@Override
	public double getBalance() {
		return bankAccount.getBalance();
	}

	@Override
	public String showBenefits() {
		return bankAccount.showBenefits() + ", GCash Transfer";
	}

	@Override
	public double computeBalanceWithInterest() {
		return bankAccount.getBalance() + (bankAccount.getBalance() * getInterestRate());
	}

	@Override
	public String showInfo() {
		return bankAccount.showInfo();
	}
}
