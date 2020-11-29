package all_over;

import java.util.Scanner;
public class mesafe_hesaplama_gelismis {

	public static void main(String[] args) {
		Scanner tara=new Scanner(System.in);
		System.out.print("1.aracin hizi: ");
			double v1= tara.nextDouble();
		
		System.out.print("2.aracin hizi: ");
			double v2=tara.nextDouble();
		
		System.out.print("t süre gir (dk):");
			double t=tara.nextDouble();	
		t/=60;	
		
		System.out.print("araclarin surumu (ayni-farkli): ");
			String durum=tara.next();
		
		
		System.out.println("aradaki mesafe:"+ Hesapla(v1, v2, t, durum)+ " km");
	}
	
	
	public static double Hesapla(double v1, String yonu1, double v2, String yonu2, double sure){
		if (yonu1.equals(yonu2)) {
			return ( Math.abs(v1-v2)*sure);
		}
		else{
			return ((v1+v2)*sure);
		}		
	}
	public static double Hesapla(double v1, double v2, double sure, String yon){
		double sonuc;
		if (yon.equals("ayni")) {
			sonuc=( Math.abs(v1-v2)*sure);		
		}
		else if (yon.equals("farkli")) {
			sonuc=((v1+v2)*sure);
		}
		else{
			System.out.println("hatali yon girisi");
			sonuc=-1;
		}
		return sonuc;
	}
}


