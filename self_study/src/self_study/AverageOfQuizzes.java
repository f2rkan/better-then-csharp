package self_study;

import java.util.*;
public class AverageOfQuizzes {

	public static void main(String[] args) {
		int[] scores = new int[10];
		int score = 0;
		int count = 0;
		int total = 0;
		final int MAX = 10;
		final int QUIT = 999;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("not degerini gir > ");
		score = keyboard.nextInt();
		while(score != QUIT) {
			scores[count] = score;
			total += scores[count];
			++count;
			if(count == MAX) score = QUIT;
			else {
				System.out.print("siradaki not degerini gir > ");
				score = keyboard.nextInt();
			}
		}
		System.out.print("bu skorlari girdin > ");
		for(int i = 0; i < count; i++)
		{
			System.out.print(scores[i] + " ");
		}
		if(count != 0) System.out.println("girdigin notlarin ortalamasi > " + total / count);
		else System.out.println("ortalamasi hesaplanacak bir not girmedin.");
	}
}
