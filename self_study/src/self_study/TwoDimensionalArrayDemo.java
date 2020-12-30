package self_study;

import java.util.*;
public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		int[][] count = new int[3][3];
		
		Scanner keyboard = new Scanner(System.in);
		int row, column;
		
		final int QUIT = 99;
		System.out.print("row > ");
		row = keyboard.nextInt();
		while(row != QUIT) {
			System.out.print("sutun > ");
			column = keyboard.nextInt();
			if(row < count.length && column < count[row].length) {
				count[row][column]++;
				for(int r = 0; r < count.length; ++r) {
					for(int c = 0; c < count[r].length; ++c)
						System.out.print(count[r][c] + " ");
						System.out.println();
				}
			}
			else
				System.out.println("gecersiz pozisyon sectin");
			System.out.print("row degeri gir ya da " + QUIT + " girerek " + 
				"programi sonlandir > ");
			row = keyboard.nextInt();
		}
	}
}
