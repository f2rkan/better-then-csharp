package self_study;

import java.util.Scanner;
public class BankBalance {

	public static void main(String[] args) {
		
		double balance;
		int response, year = 1;
		final double INT_RATE = 0.03;
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("banka bakiyeni gir: $");
				balance = keyboard.nextDouble();
			System.out.println("gelecek yilin bakiyesini gormek ister misin?");
			System.out.println("evet icin 1'e");
			System.out.print("hayir icin baska bir numarayi tusla: ");
				response = keyboard.nextInt();
			while(response == 1)
			{
				balance += balance * INT_RATE;
				System.out.println(year + " yil sonra " + INT_RATE + " faiz oraniyla bakiyen $" + balance + " olacak.");
				year += 1;
				
				System.out.println("gelecek yilin bakiyesini gormek ister misin?");
				System.out.println("evet icin 1'e");
				System.out.print("hayir icin baska bir numarayi tusla: ");
				response = keyboard.nextInt();
			}
		}
	}
}
