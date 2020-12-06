package self_study;

import java.util.Scanner;
public class DiagonalLetter {

	public static void main(String[] args) {
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("diagonal siralanmasi icin harf gir > ");
			String key = keyboard.next();
			
			int i;
			final int LIMIT = 10;
			String a = " ";
			for(i = 0; i < LIMIT; i++)
			{
				for(int j = 0; j < i; j++) {
					System.out.print(a);
				}
				System.out.println(key);
			}
		}
	}
}
