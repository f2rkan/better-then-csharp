package self_study;

import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] myScores = new int[5];
		display("orijinal dizi:\t\t\t", myScores);
		Arrays.fill(myScores, 8); //dizinin butun elemanlari 8'e ayarlandi
		display("dizinin butun elemanlari 8'e ayarlandi:\t\t\t", myScores);
		myScores[2] = 6;
		myScores[4] = 3;
		display("dizideki 2 degeri degistirdik, guncel dizi:\t\t", myScores);
		Arrays.sort(myScores);
		display("Arrays.sort sonrasi dizi:\t\t\t", myScores);
	}
	public static void display(String message, int array[]) {
		int sz = array.length;
		System.out.println(message);
		for(int x = 0; x < sz; ++x)
			System.out.print(array[x] + " ");
		System.out.println();
	}

}
