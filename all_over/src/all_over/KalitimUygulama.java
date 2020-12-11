package all_over;

public class KalitimUygulama {

	public static void main(String[] args) {
		Hayvan a = new Hayvan();
		
		System.out.println("---");
		Etcil b = new Etcil();
		b.ceneYapisi();
		b.Beslenme();
		b.yasadigiYer(); //normal fonksiyon olarak cagirir cunku static tanimli oldugundan override edilmez
		System.out.println("kilo: " + b.kilo);
		System.out.println("---");
		
		Otcul c = new Otcul();
		c.Beslenme();
		c.ceneYapisi();
		c.mideYapisi();
		System.out.println("---");
		
		Kuslar d = new Kuslar();
		d.Beslenme();
		d.ceneYapisi();
		d.Solunum();
		System.out.println("---");
	
		Hayvan e = new Hayvan(45);
		Etcil f = new Etcil();
		System.out.println("Etcil kilo: " + f.kilo);
	}
}
