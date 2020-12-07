package self_study;

public class StringClassExample2 {

	public static void main(String[] args) {
		
		String firstString = "abcde";
		String secondString = "xxbcdef";
		
		System.out.println(firstString.regionMatches(1,  secondString, 2, 4));
		//1; ilk degiskenin 1. indexi; 2; ikinci String'in 2. indexi; 4; kýyaslanacak uzunluk
	}
}
