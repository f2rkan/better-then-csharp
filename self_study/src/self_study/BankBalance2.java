package self_study;

import java.util.Scanner;

public class BankBalance2 {

	public static void main(String[] args) {

		double balance;
		int response;
		int year = 1;
		
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("banka bakiyeni gir > ");
		balance = keyboard.nextDouble();
		keyboard.nextLine();
		
		do {
			balance += balance * INT_RATE;
			System.out.println(year + " yil sonra " + INT_RATE + " faiz oraniyla bakiyen $" + balance + " oluyor.");
			year += 1;
			System.out.println("gelecek yilki bakiyeni ogrenmek istiyor musun?");
			System.out.println("hesaplanmasi icin 1'e");
			System.out.print("aksi icin herhangi bir sayiyi tusla > ");
			
			response = keyboard.nextInt();
		}
		while(response == 1);
	}

}
