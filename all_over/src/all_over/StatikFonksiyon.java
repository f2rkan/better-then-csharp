package all_over;

public class StatikFonksiyon {

	public int x = 5;
	public static String ad = "Deneme";
	public static void StatikFonk(int i) {
		//this.x = i // this kullanýlmaz
		ad += "-" + i;
	}
	public void StatikOlmayanFonk() {
		
	}
	
	public static void main(String[] args) {
		System.out.println(ad); 
//statik fonksiyonlarýn en onemli avantaji nesne uretmeden kullanma imkanimiz olmasidir.
		System.out.println("---");
		
		StatikFonksiyon n = new StatikFonksiyon();
		System.out.println(n.x);
	}

}
