package all_over;

public class AbstractSiniflar {

	public static void main(String[] args) {
		Generaller a = new Generaller();
		a.EnUstKomuta("savas");
		System.out.println("---");
		Asker b = new Asker() {
			//abstract olarak tan�mlanan fonksiyonu tan�mlaman� istiyor
			//abstract class'tan nesne olusturulmak istenirse sinif icerisinde override edilecek fonksiyon getirilir
			@Override
			public void Yetki() {
				// TODO Auto-generated method stub
				
			}
		};
		b.EnUstKomuta("xx");
		
	}
}
	abstract class Asker{
	int yas = 18;
	
	//getter fonsiyonu
	public int getYas() {
		return yas;
	}
	//setter fonksiyonu
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public abstract void Yetki();
		//abstract kullanma sebebi: sonradan degisecek parametre ya da durumun kontroldan c�kmamas� ya da sorun olusturmamas� icin kullan�l�r
		//normal class yap�lar�nda abstract tan�mlama yap�lamaz
		//abs tan�mlama: kod blo�u i�ermeyecek �ekilde; fonksiyon ad� d�n�� tipi ve eri�im t�r� olan fonksiyondur
		//finalize: deconstructer fonksiyon
		//final: constant //override edilemez //kal�t�m sonras� t�retilecek olan yeni fonksiyonlar da overrive edilemez
		public final void EnUstKomuta(String durum) {
			if(durum == "savas") {
				System.out.println("askeriyeyi cbaskani yonetir");
			}
			else {
				System.out.println("askeriyeyi genelkurmay baskani yonetir");
			}
	}
}
	//abstractlar RAM'de yer kaplamaz sadece adres kaplar
class Generaller extends Asker{
	@Override
	//t�retilen yeni class'larda abstract bir class'a yer veremeyiz
	//abstract olarak tan�mlanm�s fonksiyonlar kesinlikle override edilmelidir
		public void Yetki() {
			System.out.println("komuta zincirinin en ustundedir");
	}
	/*	
	@Override
		public final void EnUstKomuta(String durum) {
			
		}
	*/
}
class Er extends Asker{
	public void Yetki() {
		System.out.println("komuta zincirinin alt kademesindedir");
	}
}
