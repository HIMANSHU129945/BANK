package com.jsp;

public interface Bank {
	
	void deposit(int amount);
	void withdraw(int amount);
	int getBalance();
	String errorDisplayMessage();

}
