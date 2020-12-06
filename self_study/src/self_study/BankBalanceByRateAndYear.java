package self_study;

import java.util.Scanner;
public class BankBalanceByRateAndYear {

	public static void main(String[] args) {
	
		double initialBalance;
		double balance;
		int year;
		double interest;
		final double LOW = 0.02;
		final double HIGH = 0.05;
		final double INCREMENT = 0.01;
		final int MAX_YEAR = 4;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("ilk bakiye > ");
		initialBalance = keyboard.nextDouble();
		keyboard.nextLine();
		
		for(interest = LOW; interest <= HIGH; interest += INCREMENT)
		{
			balance = initialBalance;
			System.out.println("\n$" + initialBalance + " baslangic degeri ile ve " + interest + " faiz oraniyla;");
			for(year = 1; year <= MAX_YEAR; ++year) {
				balance += balance * interest;
				System.out.println(year + " yil sonra bakiyen > $" + balance);
			}
		}
	}
}
