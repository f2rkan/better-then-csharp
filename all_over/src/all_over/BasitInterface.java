package all_over;

public interface BasitInterface {
		
	//final tanýmlama static tanýmlama sýnýfýna girer, dinamik degildir; deðiþtirilemez.
		final int a = 10;
		
		//interface'lerin abstract class'tan ve normal class'tan farký inter 
		void Goruntule();
		int degerGetir(int a, double b);
		double Degerler();
		
		//final double Deneme();
		//interface'ler abstract tanýmlama ifadesi vermeye calýstýgý icin fonksiyonlarýn final tanýmlanmasýna izin vermez; 
		//degiskenlerin final tanýmlanmasýna izin verilir.
		
		//static double Deneme2();
		//interface'lerde static tanýmlý fonksiyon kullanýlamaz cunku static tanýmlý fonksiyonlar TEK BÝR adrese dayanýr;
		//bizim yapmamýz gereken sey adresten bagýmsýz bir PUBLIC atamadýr.
		
		
		/*public String Deneme3() {
			System.out.println("XXxxX");
		}
		*/
		//Interface'de abstract tanýmlama dýsýnda fonksiyon tanýmý yapýlamaz.
}

interface BasitInterface2{
	int Durum1();
	double Durum2(double a);
}

class TestInterface2 implements BasitInterface, BasitInterface2{
	@Override
	public int degerGetir(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public double Degerler() {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public void Goruntule() {
		// TODO Auto-generated method stub
		
	}@Override
	public int Durum1() {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public double Durum2(double a) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void Deneme3() {
		
	}
}
/*interface'lerin varlýgýnýn sebebi, abstract olarak belirlenmiþ yapýlar vardýr; biz bunlardan class türetmek istiyoruz.
nesne turetebilmemiz icin class'tan türetmemiz lazým. 
interface'ten nesne türetebilmemiz icin bizim bunu bir class'a dönüþtürmemiz lazým. */
/*interface'ten dogrudan nesne turetilemez, dolayýsýyla bu eylem class turetilerek gerceklestirilir*/

class TestInterface1 implements BasitInterface{
	@Override
	public void Goruntule() {
		System.out.println("goruntule fonksiyonu tetiklendi");
		
	}
	@Override
	public int degerGetir(int a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double Degerler() {
		// TODO Auto-generated method stub
		return 0;
	}
	/*yeni class'a yeni fonksiyonlar yazýlabilir*/
	public void Deneme() {
		System.out.println("sonradan uretilen ilk fonksiyon olan Deneme() tetiklendi");
	}
}

/*class ciftSinif extends class1, class2{
	
}
* siniflarda cift sinifi tek sinifa direkt kalitamayýz, bu islem interface'lere özgüdür
*/