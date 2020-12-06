package self_study;

public class TriangleWithLoops {

	public static void main(String[] args) {
		
		
		for (int i = 6, k = 0; i > 0 && k < 6; i--, k++) {
			for (int j = 0; j < i; j++) System.out.print(" ");
		    
		    for (int j = 0; j < k; j++) System.out.print("*");
		    for (int j = 1; j < k; j++) System.out.print("*");
		    
		    System.out.println();
		}
	}
}
