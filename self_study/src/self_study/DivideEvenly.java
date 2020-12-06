package self_study;

public class DivideEvenly {
	
	public static final int LIMIT = 100;
	
	public static void main(String[] args) {
		
		int var;
		for(var = 1; var < LIMIT; var++)
		{
			if(LIMIT % var == 0) System.out.print(var + " ");
			
		}
	}
}
