package self_study;

import java.util.Scanner;

public class EnterSmallValue {

	public static void main(String[] args) {
		
		int userEntry;
		final int LIMIT = 3;
		int sayac = 0;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Lutfen " + LIMIT + "'ten kucuk bir deger gir > ");
			userEntry = input.nextInt();
			
			while(userEntry > LIMIT)
			{
				sayac++;
				System.out.print("bu sayi cok buyuk. bize " + LIMIT + "'ten kucuk olan bir sayi lazim > ");
				userEntry = input.nextInt();
			}
		}
		if(sayac == 0) System.out.println("\"" + userEntry + "\" girisin kabul edildi.");
		else System.out.println("sonunda " + "\"" + userEntry + "\"" + " sayisi kabul edildi." );
	}

}
