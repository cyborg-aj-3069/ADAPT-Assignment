import java.util.*;

class SavingAccount implements Comparable<SavingAccount> {

	private double acc_balance;
	private int acc_ID;
	private String accountHolderName;
	private boolean isSalaryAccount;

	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public void deposite(double dep) {
		this.acc_balance = dep;
	}

	public void withdraw(double with) {
		if (with <= this.acc_balance) {
			this.acc_balance = with;
		}
	}

	@Override
	public int compareTo(SavingAccount b) {
		if (this.acc_ID > b.acc_ID) {
			return 1;
		} else if (this.acc_ID < b.acc_ID) {
			return -1;
		} else {
			return 0;
		}
	}

}

class BankAccountList {

	private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

	public boolean addSavingAccount(SavingAccount savingAccount) {
		if (savingAccount != null) {
			savingAccounts.add(savingAccount);
			return true;
		}
		return false;

	}

	public List<Integer> displaySavingAccountIds() {
		Iterator<SavingAccount> iterator = savingAccounts.iterator();
		List<Integer> list = new ArrayList<>();
		
		while (iterator.hasNext()) {
			list.add(iterator.next().getAcc_ID());
		}
		return list;

	}
}

public class Assignment3Q9 {
	public static void main(String[] args) {
	}
}