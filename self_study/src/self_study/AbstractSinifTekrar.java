package self_study;

public class AbstractSinifTekrar {

	public static void main(String[] args) {
	
	}
}

abstract class Asker{
	
	int yas = 18;
	
	//getter function
	public int getYas() {
		return 0;
	}
	//setter function
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public abstract void Yetki();
	public final void EnUstKademe(String durum) {
		if(durum == "savas") {
			System.out.println("komuta cbaskaninda");
		}
		else {
			System.out.println("komuta genelkurmay baskaninda");
		}
	}
}

class Generaller extends Asker{
	@Override
	public void Yetki() {
		System.out.println("komuta kademesinin en ustundedir");
	}
}
class Er extends Asker{
	@Override
	public void Yetki() {
		System.out.println("komuta kademesinin en altindadir");
	}
}
