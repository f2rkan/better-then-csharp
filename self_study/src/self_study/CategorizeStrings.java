package self_study;

import java.util.*;
public class CategorizeStrings {

	public static void main(String[] args) {
		final int MAX = 10;
	      final int CUTOFF = 10;
	      final String QUIT = "ZZZ";
	      String entry;
	      int shortSub = 0;
	      int longSub = 0;
	      Scanner input = new Scanner(System.in);
	      String[] longStrings = new String[MAX];
	      String[] shortStrings = new String[MAX];

	      System.out.print("String girisi yap ya da cikmak icin " +
	               QUIT + " tusla > ");
	            entry = input.nextLine();
	      while(!entry.toUpperCase().equals(QUIT) && (shortSub + longSub < MAX))
	      {
	         if(entry.length() <= CUTOFF)
	         {
	            shortStrings[shortSub] = entry;
	            ++shortSub;
	         }
	         else
	         {
	            longStrings[longSub] = entry;
	            ++longSub;
	         }
	         if(shortSub + longSub < MAX)
	         {
	            System.out.print("String girisi yap ya da cikmak icin " +
	               QUIT + " tusla > ");
	            entry = input.nextLine();
	         }
	      }
	      System.out.println("\nHangi String'in listesini Goruntulemek Istiyorsun; longString mi shortString mi?");
	      System.out.print("   S ya da L'yi tusla ya da cikmak icin " +
	         QUIT + " tusla > ");
	      entry = input.nextLine();
	      while(!entry.toUpperCase().equals(QUIT))
	      {
	          if(entry.substring(0, 1).toLowerCase().equals("s"))
	             display(shortStrings, shortSub);
	          else
	             display(longStrings, longSub);
	          System.out.println("\nHangi String'in listesini Goruntulemek Istiyorsun; longString mi shortString mi?");
	          System.out.print("   S ya da L'yi tusla ya da cikmak icin " +
	             QUIT + " tusla > ");
	          entry = input.nextLine();
	      }
	   }
	   public static void display(String[] array, int max)
	   {
	      System.out.println();
	      if(max == 0)
	         System.out.println("bu liste bos");
	      else
	         for(int x = 0; x < max; ++x)
	            System.out.println(array[x]); 
	   }
}
