package self_study;

import java.util.*;
public class EnumDemo {

	enum Month {
			JAN, FEB, MAR, APR, MAY, JUN,
	        JUL, AUG, SEP, OCT, NOV, DEC
	};
	
	public static void main(String[] args) {
		Month birthMonth;
		String userEntry;
		int position;
		int comparison;
		
		Scanner keyboard = new Scanner(System.in);
		
		for(Month mon : Month.values())
			System.out.print(mon + " ");
		System.out.print("\n\ndogdugun ayin ilk uc harfini gir > ");
		userEntry = keyboard.nextLine().toUpperCase();
		birthMonth = Month.valueOf(userEntry);
		
		System.out.println("girdigin ay > " + birthMonth);
		position = birthMonth.ordinal();
		System.out.print(birthMonth + " konumu, " + (position + 1) + ". indis.");
		System.out.println(" ve " + (position + 1) + ". ay.");
		
		comparison = birthMonth.compareTo(Month.JUN);
		
		if(comparison < 0)
			System.out.println(birthMonth + ", yil icinde " + Month.JUN + "'dan daha once.");
		else if(comparison == 0)
			System.out.println("");
		else
			System.out.println(birthMonth + ", " + Month.JUN + " ayindan sonra.");
	}

}
