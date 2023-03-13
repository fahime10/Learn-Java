package lib.bankaccounts;

public class IsaAccount extends InterestAccount {

	private int depositRemaining;
	
	public IsaAccount() {
		super();
		depositRemaining = 1000;
	}
	
	public int getDepositRemaining() {
		return depositRemaining;
	}
	
	public void resetDepositRemaining() {
		depositRemaining = 1000;
	}
	
	@Override
	public void deposit(int amount) {
		if(amount > 0) {
		if(depositRemaining > 0 && (depositRemaining - amount >= 0)) {
		depositRemaining = depositRemaining - amount;
	}
	}
	}
	
	@Override
	public String toString() {
		return super.toString() + "[depositRemaining=" + getDepositRemaining() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) {
			return false;
		}
		
		IsaAccount other = (IsaAccount) obj;
		return this.depositRemaining == other.depositRemaining;
	}
}
