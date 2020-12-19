package all_over;

public class AbstractSiniflar {

	public static void main(String[] args) {
		Generaller a = new Generaller();
		a.EnUstKomuta("savas");
		System.out.println("---");
		Asker b = new Asker() {
			//abstract olarak tanýmlanan fonksiyonu tanýmlamaný istiyor
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
		//abstract kullanma sebebi: sonradan degisecek parametre ya da durumun kontroldan cýkmamasý ya da sorun olusturmamasý icin kullanýlýr
		//normal class yapýlarýnda abstract tanýmlama yapýlamaz
		//abs tanýmlama: kod bloðu içermeyecek þekilde; fonksiyon adý dönüþ tipi ve eriþim türü olan fonksiyondur
		//finalize: deconstructer fonksiyon
		//final: constant //override edilemez //kalýtým sonrasý türetilecek olan yeni fonksiyonlar da overrive edilemez
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
	//türetilen yeni class'larda abstract bir class'a yer veremeyiz
	//abstract olarak tanýmlanmýs fonksiyonlar kesinlikle override edilmelidir
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
