package self_study;

import java.util.Scanner;
public class StringClassExample {

	public static void main(String[] args) {
	
		String a = "abc";
		String b = "AbC";
		
		if(a.equals(b)) System.out.println(a + " ve " + b + " icerik ayni.");
		else System.out.println(a + " ve " + b + " icerik farkli.");
		System.out.println("---");
		
		if(a.equalsIgnoreCase(b)) System.out.println(a + " ve " + b + " icerik ayni.");
		else System.out.println(a + " ve " + " icerik farkli.");
		System.out.println("---");
		
		String c = "";
		int var1 = a.compareTo(b);
		int var2 = b.compareTo(c);
		int var3 = c.compareTo(a);
		System.out.println(var1 + ", " + var2 + ", " + var3);
		System.out.println("---");
		
		String greeting = "hello";
		int len = greeting.length();
		System.out.println(len);
		System.out.println("---");
		
		String mySentence = "benim adim furkan";
		int countOfSpaces = 0;
		for(int x = 0; x < mySentence.length(); ++x) {
			if(mySentence.charAt(x) == ' ') ++countOfSpaces;
		}
		System.out.println(mySentence + " dizinde " + countOfSpaces + " bosluk var.");
		System.out.println(mySentence + " dizinde u harfinin ilk olustugu konum(harf sirasina gore gidiyor) > " + mySentence.indexOf("u"));
		System.out.println("---");
		
		
		System.out.println("---");
		//ilk kelime ya da harf aramak - aradigimizi bulursak true dondurur; tam tersi icin de endsWith() kullaniriz
		String myName = "Furkan";
		System.out.println(myName.startsWith("Fur"));
		System.out.println("---");
		
		//replace() function; belirledigimiz degeri belirledigimiz deger yerine yazar
		String replaceDeneme = "guzel bir gun geciriyoruz";
		System.out.println(replaceDeneme.replace(' ', '-')); //bosluk gordugu yere - (tire) ceker; case-sensitive vardir.
		System.out.println("---");
		
		//toString() function; degerin tipini String'e cevirir
		int someInt = 4;
		Integer.toString(someInt); //bu satirdan sonra someInt degiskenini ekrana basarsak int tipinde degil String tipinde cikti verecek
		System.out.println(someInt);
		System.out.println("---");
		
		//int tipini String'e cevirmenin bir diger yolu
		String theString;
		int a1 = 5;
		theString = "" + a1;
		System.out.println(theString);
		System.out.println("---");
		
		try (//girilen karakterde ilk harfi basmak
				Scanner keyboard = new Scanner(System.in)) {
					char example = keyboard.nextLine().charAt(0);
					System.out.println(example);
		}
	}
}
