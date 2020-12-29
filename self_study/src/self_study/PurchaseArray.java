package self_study;

import java.util.*;
public class PurchaseArray {

	public static void main(String[] args) {
		
		Purchase[] purchases = new Purchase[5];
		final int LOW = 1000, HIGH = 8000;
		
		int x;
		int num;
		double amount;
		
		try (Scanner input = new Scanner(System.in)) {
			for(x = 0; x < purchases.length; ++x) {
				purchases[x] = new Purchase();
				System.out.print("fatura numarasi > ");
				num = input.nextInt();
				
				while(num <= LOW || num >= HIGH) {
					System.out.print("fatura numarasi " + 
				LOW + " ve " + HIGH + 
				" arasinda olmalidir > ");
					num = input.nextInt();
				}
				System.out.print("satis tutari > ");
				amount = input.nextDouble();
				
				while(amount < 0) {
					System.out.println("satis tutarini 0'dan buyuk ya da 0'dan kucuk gir > ");
					amount = input.nextDouble();
				}
				purchases[x].setInvoiceNumber(num);
				purchases[x].setSaleAmount(amount);
			}
		}
		System.out.println("\nsatin alma ozeti;");
		for(x = 0; x < purchases.length; ++x)
			purchases[x].display();
	}
}
