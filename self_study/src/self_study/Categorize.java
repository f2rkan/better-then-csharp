package self_study;

import java.util.*;
public class Categorize {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		final int MAX = 10;
		final int CUTOFF = 10;
		final String QUIT = "ZZZ";
		
		int shortSub = 0;
		int longSub = 0;
		String entry;
		
		String[] longString = new String[MAX];
		String[] shortString = new String[MAX];
		
		System.out.print("bir String gir ya da programi sonlandirmak icin " + QUIT + " tusla > ");
		entry = input.nextLine();
		while(!entry.toUpperCase().equals(QUIT)) {
			if(entry.length() <= CUTOFF) {
				shortString[shortSub] = entry;
				++shortSub;
			}
			else {
				longString[longSub] = entry;
				++longSub;
			}
			if(longSub + shortSub < MAX) {
				System.out.print("bir String gir ya da programi sonlandirmak icin " + QUIT + " tusla > ");
				entry = input.nextLine();
			}
		}
		System.out.println("hangi String'i goruntulemek istiyorsun?");
		System.out.print("shortString icin S; longString icin L tusla > ");
		entry = input.nextLine();
		
		while(!entry.toUpperCase().equals(QUIT)) {
			if(entry.substring(0, 1).toLowerCase().equals("s"))
				display(shortString, shortSub);
			else
				display(longString, longSub);
			
			System.out.println("hangi String'i goruntulemek istiyorsun?");
			System.out.print("shortString icin S; longString icin L tusla > ");
			entry = input.nextLine();
		}
	}
	public static void display(String[] array, int max) {
		if(max == 0) {
			System.out.println("listede goruntulenecek bir sey yok");
		}
		else
			for(int x = 0; x < max; ++x) {
				System.out.println(array[x]);
			}
	}
}

