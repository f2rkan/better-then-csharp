package all_over;

public class Kurucu {

	public int a;
	public String ad;
	
	public static void main(String[] args) {
		
		Kurucu nesne = new Kurucu();
		System.out.println("default kurucu icin a: " + nesne.a);
		System.out.println("default kurucu icin ad: " + nesne.ad);
		System.out.println("---");
		
		Kurucu nesne2 = new Kurucu(100);
		System.out.println("default kurucu icin a: " + nesne2.a);
		System.out.println("default kurucu icin ad: " + nesne2.ad);
		System.out.println("---");
		
		Kurucu nesne3 = new Kurucu("DENEME");
		System.out.println("default kurucu icin a: " + nesne3.a);
		System.out.println("default kurucu icin ad: " + nesne3.ad);
		System.out.println("---");
		
		Kurucu nesne4 = new Kurucu(11, "Deneme2");
		System.out.println("default kurucu icin a: " + nesne4.a);
		System.out.println("default kurucu icin ad: " + nesne4.ad);
		System.out.println("---");
		
		Kurucu nesne5 = new Kurucu("ups", 17);
		System.out.println("default kurucu icin a: " + nesne5.a);
		System.out.println("default kurucu icin ad: " + nesne5.ad);
			
	}

	Kurucu(){
		this.a = 0;
		this.ad = "Varsayilan";
	}
	Kurucu(int a)
	{
		this(); //kurucularý calýstýrýr, su an olmasa da olur; parametre cinsinden de kullanýlabilir; ilk satýrda olmalýdýr.
		this.a = a;
		this.ad = "Varsayilan2";
		 
	}
	Kurucu(String ad)
	{
		this(5); //int parametreli constructer cagirildi
		this.ad = ad;
		this.a = -2;
	}
	Kurucu(int a, String ad){
		this.ad = ad;
		this.a = a;
	}
	Kurucu(String ad, int a)
	{
		this.ad = ad;
		this.a = -8;
	}
	
	//yikici fonksiyon: deconstructer -- overload edilemez
	public void finalize() {
		System.out.println("constructer tetiklendi");
	}
}
	