package com.assignmentQ3;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	@Override
	public double getBalance(long accountId) {
		System.out.println("The user's account balance is: "+initialBalance);
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		System.out.println("The user's account balance is: "+newBalance);
		return 0;
	}

}
