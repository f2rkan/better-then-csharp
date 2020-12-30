package self_study;

import java.util.Arrays;

public class binarySearchDemo {

	public static void main(String[] args) {
		int[] sz = {
			1, 2, 3 , 35, 79, 110, 111, 112, 190, 113, 115
		};
		//binarySearch oncesinde diziyi sort fonksiyonuna basmazsan ya da kendi yazdigin sort fonksiyonuna basip siralamazsan
		//binarySearch, siralamanin hata verdigi indisi -(eksi) olarak dondurur
		System.out.println(Arrays.binarySearch(sz, 113));		
	}
}
