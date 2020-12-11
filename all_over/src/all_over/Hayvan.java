package all_over;

public class Hayvan {
	public static double kilo = 0, boy = 0;
	public static String yasadigiYer = "";
	
	Hayvan(){
		System.out.println("Hayvan PARAMETRESÝZ kurucusu tetiklendi");
	}
	Hayvan(double kilo){
		this.kilo = kilo;
		System.out.println("Hayvan kurucusu tetiklendi, kilo = " + kilo);
	}
	//kurucu deðildir cunku kurucular donus tipi ve void ifadesi almaz
	public void Hayvan(){
		System.out.println("Hayvan ismindeki fonksiyon calistirildi (kurucu degil)");
	}
	public void Beslenme() {
		System.out.println("Hayvan.beslenme fonksiyonu - her hayvan beslenir.");
	}
	public static void yasadigiYer() {
		System.out.println("Hayvan.yasadigiYer fonksiyonu tetiklendi");
	}
	public void Solunum() {
		System.out.println("Hayvan.Solunum fonksiyonu tetiklendi");
	}
	public void ceneYapisi() {
		System.out.println("Hayvan.ceneYapisi fonksiyonu tetiklendi");
	}
	public void Goster() {
		System.out.println("Kilo: " + this.kilo + "; Boyu: " + this.boy);
	}
}
class Etcil extends Hayvan{
	public Etcil()//Etcil constructer
	{
		System.out.println("Etcil class'inin kurucusu tetiklendi");
	}
	public Etcil(double boy, double kilo) {
		this.boy = boy;
		this.kilo = kilo;
		/*
		super.kilo = kilo;
		super.boy = boy;
		*/
	}
	
	@Override //kalitildigi sinifta var olan fonksiyonu uzerine bindirmek demek
	public void Beslenme() {
		System.out.println("Etcil.Beslenme - Hayvan'dan turedi - Etcil hayvanlar et ile beslenir");
	}
	@Override
	public void ceneYapisi() {
		System.out.println("Etcil.ceneYapisi tetiklendi - Etcil'lerde kesici disler gelismistir.");
	}
	/* @Override : override edilemez cunku static tanimli bir fonksiyon;
	 * sebebi: RAM uzerinde yalnizca bir defa olusturulmasidir; uretilen her nesnede oldugu gibi her yeni class'ta da ayni adres kullanilir
	 public static void yasadigiYer() {
		System.out.println("Etcil.yasadigiYer tetiklendi");
	}
	*/
	public void EtcilGoster() {
		super.Goster();
	}
}
class Otcul extends Hayvan{
	public Otcul() {
		System.out.println("Otcul sinifinin kurucusu tetiklendi");
	}
	@Override
	public void Beslenme() {
		System.out.println("Otcul.Beslenme fonksiyonu tetiklendi - Otcul hayvanlar ot ile beslenir.");
	}
	@Override
	public void ceneYapisi() {
		System.out.println("Otcul.ceneYapisi fonksiyonu tetiklendi - Otcul hayvanlarda ogutucu disler gelismistir.");
	}
	public void mideYapisi() {
		System.out.println("Otcullarin mideleri 4 bolumden olusur.");
	}
}
class Kuslar extends Etcil{
	public Kuslar() {
		System.out.println("Etcil'den tureyen Kuslar sinifinin kurucu fonksiyonu tetiklendi.");
	}
	@Override
	public void Beslenme() {
		System.out.println("Kuslar.Beslenme fonksiyonu tetiklendi - Etcil kuslar et ile beslenir.");
	}
	@Override
	public void ceneYapisi() {
		System.out.println("Kuslar.ceneYapisi fonksiyonu tetiklendi - Kuslar keskin gagalidir.");
	}
	public void KuslarGoster() {
		super.Goster();
	}
}