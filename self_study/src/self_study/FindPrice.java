package self_study;

import java.util.*;
public class FindPrice {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final int NUMBER_OF_ITEMS = 10;
		
		int[] validValues = {101, 108, 201, 213, 266,
				304, 311, 409, 411, 412
		};
		double[] prices = {0.29, 1.23, 3.50, 0.69, 6.79,
				3.19, 0.99, 0.89, 1.26, 8.00
		};
		String strItem;
		int itemOrdered;
		double itemPrice = 0.0;
		boolean isValidItem = false;
		System.out.print("kac no'lu elemani istiyorsun > ");
		strItem = keyboard.nextLine();
		itemOrdered = Integer.parseInt(strItem);
		System.out.println(strItem);
		
		for(int x = 0; x < NUMBER_OF_ITEMS; ++x) {
			if(itemOrdered == validValues[x]) {
				isValidItem = true;
				itemPrice = prices[x];
			}
		}
		if(isValidItem) {
			System.out.println(itemOrdered + " elemaninin" +
		" fiyati > $" + itemPrice);
		}
		else {
			System.out.println("aradigin eleman yok");
		}
	}
}
