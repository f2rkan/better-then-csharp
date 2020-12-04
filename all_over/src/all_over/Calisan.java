package all_over;

//constructer overloading uygulamasi
public class Calisan {

	private String Ad = null, Soyad = null;
	private int dogumyil = 0;

	public Calisan(String Ad, String Soyad, int dogumyil)
	{
		Ad = Ad;
		Soyad = Soyad;
		dogumyil = dogumyil;
	}
	public Calisan(String Ad, String Soyad)
	{
		this(Ad, Soyad, -1);
	}
	public static void main(String[] args) {
	
	}
}
