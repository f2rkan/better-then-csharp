package all_over;

public class StatikDegisken {

	public static int x = 0;
	public static int y = 0;
	
	public static void main(String[] args) {
	
		StatikDegisken sd1 = new StatikDegisken();
		StatikDegisken sd2 = new StatikDegisken();
		
		x = 10;
		sd1.y = 55;
	
		System.out.println("x degeri: " + x);
		System.out.println("sd1 y degeri: " + sd1.y);
		System.out.println("sd2 y degeri: " + sd2.y);
		System.out.println("sd1 x degeri: " + sd1.x);
		System.out.println("sd2 x degeri: " + sd2.x);
		
		sd1.x = 33;
		System.out.println("---");
		System.out.println("x degeri: " + x);
		System.out.println("sd1 y degeri: " + sd1.y);
		System.out.println("sd2 y degeri: " + sd2.y);
		System.out.println("sd1 x degeri: " + sd1.x);
		System.out.println("sd2 x degeri: " + sd2.x);
		
		StatikDegisken sd3 = new StatikDegisken();
		sd3.x = 2;
		sd3.y = 4;
		
		System.out.println("x degeri: " + x);
		System.out.println("sd1 y degeri: " + sd1.y);
		System.out.println("sd2 y degeri: " + sd2.y);
		System.out.println("sd1 x degeri: " + sd1.x);
		System.out.println("sd2 x degeri: " + sd2.x);
		System.out.println("sd3 y degeri: " + sd3.y);
		System.out.println("sd3 x degeri: " + sd3.x);
		
		StatikFonksiyon nesne1 = new StatikFonksiyon();
		StatikFonksiyon nesne2 = new StatikFonksiyon();
		
		nesne1.StatikFonk(55);
		nesne2.StatikOlmayanFonk();
		System.out.println("Nesne 1 ad: " + nesne1.ad);
		System.out.println("Nesne 2 ad: " + nesne2.ad);
		
		StatikFonksiyon.StatikFonk(5);
		//Statik fonksiyonlar nesne uretmeden kullanilabilir
		System.out.println("Nesne 1 ad: " + nesne1.ad);
		System.out.println("Nesne 2 ad: " + nesne2.ad);
	}
}
