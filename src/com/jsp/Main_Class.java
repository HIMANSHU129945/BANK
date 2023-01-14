package com.jsp;

import java.util.Scanner;

public class Main_Class {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank_Impl(5000);
		System.out.println("Welcome In Bank");
		while(true) {
			System.out.println("Choose An Option");
			System.out.println("1: Deposit\n2: Withdraw\n3: Check Balance\n4: Exit");
			int choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Amount To Be Deposite");
				int depositAmout=sc.nextInt();
				b.deposit(depositAmout);
				break;
			case 2:
				System.out.println("Enter Amount To Be Withdraw");
				int withdrawAmount=sc.nextInt();
				b.withdraw(withdrawAmount);
				break;
			case 3:
				System.out.println(b.getBalance());
				break;
			case 4:
				System.out.println("Thank You!!!!!");
				System.exit(0);
			default:
					System.out.println(b.errorDisplayMessage());
			}
			System.out.println();
		}
	}

}
