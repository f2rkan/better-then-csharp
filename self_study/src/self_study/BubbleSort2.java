package self_study;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[]someNums = new int[10];
		
		Scanner input = new Scanner(System.in);
		int giris;
		int i = 0;
		
		//diziyi doldur
		do {
				System.out.print("sayi girisi > ");
				giris = input.nextInt();
				someNums[i] = giris;
				++i;
		}
		while(i < 10);
		
		//diziyi duzenle
		int temp;
		int comparisonsToMake = someNums.length - 1;
		for(int a = 0; a < someNums.length - 1; ++a) {
			for(int b = 0; b < comparisonsToMake; ++b) {
				if(someNums[b] > someNums[b + 1]) {
					temp = someNums[b];
					someNums[b] = someNums[b + 1];
					someNums[b + 1] = temp;
				}
			}
			--comparisonsToMake;
		}
		//duzenlenen diziyi bas
		for(i = 0; i < someNums.length; i++)
			System.out.print(someNums[i] + " ");
	}
}
