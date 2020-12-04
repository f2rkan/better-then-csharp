package all_over;

public class OrnekClass {

	public static void main(String[] args) {
		
		int a = 11, b = 6;
		int c = minFonksiyonu(a, b);
		System.out.println("en kucuk deger: " + c);
	}
	
	public static int minFonksiyonu(int a, int b)
	{
		int min;
		if(a > b) min = b;
		else min = a;
		
		return min;
	}

}
