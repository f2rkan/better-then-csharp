package self_study;

import java.util.Scanner;
public class StringBuilderExample {

	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("input a String > ");
			String example = keyboard.nextLine();
			StringBuilder examp = new StringBuilder(example);
			
			System.out.println(examp);
			System.out.println("---");
			
			//alternative
			System.out.print("input a String > ");
			StringBuilder anString = new StringBuilder(keyboard.nextLine());
			System.out.println(anString);
		}
		StringBuilder newStringBuilder = null; //bos bir StringBuilder
		/*bir String olusturdugumuzda 'new' anahtar sozcugunu ihmal etme
		secenegimiz vardir ama StringBuilder nesnesini baslatirken yok;  
		yapici adini ve yapicinin parantezleri arasinda bir baslatma degerini kullanmamiz gerekir.*/
	}
}
