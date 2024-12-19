public class UpSave extends BankAccountDecorator {

	public UpSave(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	@Override
	public String showAccountType() {
		return "UpSave";
	}

	@Override
	public double getInterestRate() {
		return 0.04; // 4% interest
	}

	@Override
	public double getBalance() {
		return bankAccount.getBalance();
	}

	@Override
	public String showBenefits() {
		return bankAccount.showBenefits() + ", With Insurance";
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
