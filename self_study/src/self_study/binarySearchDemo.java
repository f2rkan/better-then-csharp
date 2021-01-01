package self_study;

import java.util.Arrays;

public class binarySearchDemo {

	public static void main(String[] args) {
		int[] sz = {
			1, 2, 3, 54, 4, 5, 6, 7, 9, 10, 11, 12
		};
		//binarySearch oncesinde diziyi sort fonksiyonuna basmazsan ya da kendi yazdigin sort fonksiyonuna basip siralamazsan
		//binarySearch, siralamanin hata verdigi indisi -(eksi) olarak dondurur
		System.out.println(Arrays.binarySearch(sz, 2));
		
		int[] z = {
				0, 1, 4, 16, 6, 8, 11, 13, 15
			};
		System.out.println(Arrays.binarySearch(z, 11));
	}
}
