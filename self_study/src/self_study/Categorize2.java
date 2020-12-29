package self_study;

import java.util.*;
public class Categorize2 {

	public static void main(String[] args) {
		
		final int MAX = 10;
		final int CUTOFF = 10;
		final String QUIT = "ZZZ";
		
		int oneWordSub = 0;
		int twoWordsSub = 0;
		int threeWordsSub = 0;
		int spaces;
		String entry;
		
		String[] oneWord = new String[MAX];
		String[] twoWords = new String[MAX];
		String[] threeWords = new String[MAX];
		
		Scanner input = new Scanner(System.in);
		System.out.print("bir String giris yap ya da programi sonlandirmak icin " + QUIT + " tusla > ");
		entry = input.nextLine();
		
		while(!entry.toUpperCase().equals(QUIT) && (oneWordSub + twoWordsSub + threeWordsSub < MAX)) {
			spaces = 0;
			for(int x = 0; x < entry.length(); ++x) {
				if(entry.charAt(x) == ' ')
					++spaces;
			}
			if(spaces == 0) {
				oneWord[oneWordSub] = entry;
				++oneWordSub;
			}
			else if(spaces == 1) {
				twoWords[twoWordsSub] = entry;
				++twoWordsSub;
			}
			else {
				threeWords[threeWordsSub] = entry;
				++threeWordsSub;
			}
			
			if(oneWordSub + twoWordsSub + threeWordsSub < MAX) {
				System.out.print("bir String giris yap ya da programi sonlandirmak icin " + QUIT + " tusla > ");
				entry = input.nextLine();
			}
		}
		//view ekraný
		System.out.print("hangi ekrani goruntulemek istiyosun; one-word, O;\ntwo-words, T;\nthree-words, L tusla ya da " + QUIT + " basarak cik > ");
		entry = input.nextLine();
		while(!entry.toUpperCase().equals(QUIT)) {
			String letter = entry.substring(0, 1).toLowerCase();
			if(letter.equals("o"))
				display(oneWord, twoWordsSub, "one-word");
			else if(letter.equals("t"))
				display(twoWords, twoWordsSub, "two-words");
			else if(letter.equals("l"))
				display(threeWords, threeWordsSub, "three-words");
			else {
				System.out.println("hatali giris yaptigin icin listenin tamamini goruntuluyorum:");
				display(oneWord, twoWordsSub, "one-word;");
				display(twoWords, twoWordsSub, "two-words");
				display(threeWords, threeWordsSub, "three-words");
			}
			System.out.print("hangi ekrani goruntulemek istiyosun; one-word, O;\ntwo-words, T;\nthree-words, L tusla ya da " + QUIT + " basarak cik > ");
			entry = input.nextLine();
		}
	}
	public static void display(String[] array, int max, String msg) {
		
		System.out.println(msg + ";");
		if(max == 0) System.out.println("liste bos");
		else
			for(int x = 0; x < max; ++x)
				System.out.println(array[x]);
	}
}
