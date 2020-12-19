package all_over;

public interface BasitInterface {
		
	//final tan�mlama static tan�mlama s�n�f�na girer, dinamik degildir; de�i�tirilemez.
		final int a = 10;
		
		//interface'lerin abstract class'tan ve normal class'tan fark� inter 
		void Goruntule();
		int degerGetir(int a, double b);
		double Degerler();
		
		//final double Deneme();
		//interface'ler abstract tan�mlama ifadesi vermeye cal�st�g� icin fonksiyonlar�n final tan�mlanmas�na izin vermez; 
		//degiskenlerin final tan�mlanmas�na izin verilir.
		
		//static double Deneme2();
		//interface'lerde static tan�ml� fonksiyon kullan�lamaz cunku static tan�ml� fonksiyonlar TEK B�R adrese dayan�r;
		//bizim yapmam�z gereken sey adresten bag�ms�z bir PUBLIC atamad�r.
		
		
		/*public String Deneme3() {
			System.out.println("XXxxX");
		}
		*/
		//Interface'de abstract tan�mlama d�s�nda fonksiyon tan�m� yap�lamaz.
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
/*interface'lerin varl�g�n�n sebebi, abstract olarak belirlenmi� yap�lar vard�r; biz bunlardan class t�retmek istiyoruz.
nesne turetebilmemiz icin class'tan t�retmemiz laz�m. 
interface'ten nesne t�retebilmemiz icin bizim bunu bir class'a d�n��t�rmemiz laz�m. */
/*interface'ten dogrudan nesne turetilemez, dolay�s�yla bu eylem class turetilerek gerceklestirilir*/

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
	/*yeni class'a yeni fonksiyonlar yaz�labilir*/
	public void Deneme() {
		System.out.println("sonradan uretilen ilk fonksiyon olan Deneme() tetiklendi");
	}
}

/*class ciftSinif extends class1, class2{
	
}
* siniflarda cift sinifi tek sinifa direkt kalitamay�z, bu islem interface'lere �zg�d�r
*/