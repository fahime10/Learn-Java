package lib.bankaccounts;

public class StudentAccount extends BankAccount {

	private int overdraftLimit;
	
	public StudentAccount() {
		super();
		overdraftLimit = 1000;
	}
	
	public StudentAccount(int balance, int overdraft) {
		super(balance);
		overdraftLimit = overdraft;
	}
	
	@Override
	public void withdraw(int amount) {
		if(super.getBalance() > -overdraftLimit) {
			super.withdraw(amount);
			if(super.getBalance() < -overdraftLimit) {
				super.deposit(amount);
			}
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "[overdraftLimit=" + overdraftLimit + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) {
			return false;
		}
		
		StudentAccount other = (StudentAccount) obj;
		return this.overdraftLimit == other.overdraftLimit;
	}
}
