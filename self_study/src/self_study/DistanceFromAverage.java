package self_study;

import java.util.*;
public class DistanceFromAverage {

	public static void main(String[] args) {
		
		final int MAX_MEMBER = 20;		
		final int QUIT = 9999;
		
		double[] numbers = new double[MAX_MEMBER];
		double entry;
		double total = 0;
		double average = 0;
		int x = 0, y;
		
		Scanner input = new Scanner(System.in);
		System.out.print("bir sayi gir ya da cikmak icin " +
				QUIT + " tusla > ");
		entry = input.nextDouble();
		
		while(entry != QUIT && x < numbers.length) {
			numbers[x] = entry;
			total += numbers[x];
			++x;
			
			if(x < numbers.length) {
				System.out.print("bir sayi gir ya da cikmak icin " +
						QUIT + " tusla > ");
				entry = input.nextDouble();
			}
		}
		if(x == 0)
			System.out.println("otalamasi hesaplanacak bir sayi girilmedi");
		else {
			average = total / x;
			System.out.print("girdigin " + x + " sayinin ortalamasi > " + average);
			System.out.println();
			for(y = 0; y < x; ++y)
				System.out.println(numbers[y] + ", ortalamadan " +
						Math.abs((numbers[y] - average)) + " kadar uzakta");
		}
	}
}
