package self_study;

public class AbstractDeneme {

	public static void main(String[] args) {

	}
}
abstract class Askeriye{
	int yas = 18;
	public int setYas() {
		return 0;
	}
	public void getYas(int yas) {
		this.yas = yas;
	}
	public abstract void Yetki();
	public final void EnUstKademe(String durum) {
		if(durum == "savas") {
			System.out.println("orduyu cbaskani yonetir");
		}
		else {
			System.out.println("orduyu genelkurmay baskani yonetir");
		}
	}
}
class General extends Asker{
	@Override
	public void Yetki() {
		System.out.println("komutada en yuksek mertebededirler");
		
	}
}
class Erler extends Asker{
	@Override
	public void Yetki() {
		System.out.println("komuta kademesinin en altindadir");
		
	}
}