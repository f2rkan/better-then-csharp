package self_study;

public class Hayvan {
	public static double kilo;
	public static double boy;
	String YasadigiYer = "";
	
	Hayvan()
	{
		System.out.println("Hayvan parametresiz kurucusu tetiklendi");
	}
	Hayvan(double a)
	{
		this.kilo = a;
	}
	Hayvan(double a, double b){
		this.kilo = a;
		this.boy = b;
	}
	public void Solunum() {
		System.out.println("Hayvan.Solunum > Her hayvan solunum yapar");
	}
	public void Beslenme() {
		System.out.println("Hayvan.Beslenme > Her hayvanin beslenme ihtiyaci vardir");
	}
}
class Etcil extends Hayvan {
	public Etcil() {
		System.out.println("Hayvan:Etcil parametresiz kurucusu tetiklendi");
	}
	
}
