package com.jsp;

public class Bank_Impl implements Bank{

	private int currentBalance;
	public Bank_Impl(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	@Override
	public void deposit(int amount) {
		System.out.println("Amount Deposited: "+amount);
		currentBalance=currentBalance+amount;
		System.out.println("Successfully Deposited");
		
	}

	@Override
	public void withdraw(int amount) {
		if(amount <= currentBalance) {
			System.out.println("Amountn withdraw: "+amount);
			currentBalance=currentBalance-amount;
			System.out.println("Amount Withdrawed");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public int getBalance() {
		return currentBalance;
	}

	@Override
	public String errorDisplayMessage() {
		return "Inter Valid Option";
	}
	

}
