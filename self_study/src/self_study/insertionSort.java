package self_study;

public class insertionSort {

	public static void main(String[] args) {
		int[]someNums = {
			5, 4, 3, 2, 1	
		};
		int a = 1;
		int temp;
		int b;
		while(a < someNums.length) {
			temp = someNums[a];
			b = a - 1;
			while(b >= 0 && someNums[b] > temp) {
				someNums[b + 1] = someNums[b];
				--b;
			}
			someNums[b + 1] = temp;			
			++a;
		}
	}
}
