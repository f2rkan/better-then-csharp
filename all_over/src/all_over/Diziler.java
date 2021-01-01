package all_over;

import java.util.Arrays;

public class Diziler {

	public static void main(String[] args) {
		
		int[] dizi1 = new int[10];
		int[] dizi2 = {
			11, 1453, 1071, 2020	
		};
		int[] dizi3;
		
		dizi3 = new int[5];
		
		for(int i = 0; i < dizi2.length; ++i) {
			System.out.println("dizinin " + (i) + ". indisi > " + dizi2[i]);
		}
		int elemanSayisi = dizi2.length;
		
		//foreach
		for(int eleman : dizi2) {
			System.out.println(eleman);
		}
		System.out.println(Arrays.binarySearch(dizi2, 2020));
		//1071 icin dene
		
		//Arrays.sort(dizi2);
		//diziyi siralar
		
		//Arrays.sort(dizi2, 2, 5);
		//belirli bolgedeki siralama
		
		Arrays.fill(dizi3, 2);
		Arrays.fill(dizi3, 2, 4, 100);
		
		for(int eleman : dizi3) {
			System.out.println(eleman);
		}
		
		//Arrays.equals(dizi2, dizi3);
		//iki dizinin birbirine esit olup olmadigina bakar
		
		//iki boyutlu diziler
		
		//matris
		int[][] dizi4 = new int[5][5];
		//tensor
		int[][][] dizi5 = new int[4][4][4];
		
		dizi4[2][3] = 45;
		//2. satir 3. sutuna 45 degerini atar
		
		int[][] dizi6 = {
				{1, 2}
		};
		int[][][] dizi7 = {
				{
					{1, 2, 3}
				}
		};
	}
	

}
