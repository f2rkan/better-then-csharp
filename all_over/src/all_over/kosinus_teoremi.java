package all_over;

import java.util.Scanner;
public class kosinus_teoremi {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1.kenar: ");
			double a= keyboard.nextDouble();
		System.out.print("2.kenar: ");
			double b=keyboard.nextDouble();		
		System.out.print("aci: ");
			double aci = keyboard.nextDouble();
		
		kosinus_teoremi obje = new kosinus_teoremi();
		obje.Kosinus(a, b, aci);
		
	}
	public void Kosinus(double a, double b, double aci){
		
		double aciRadyan=Math.toRadians(aci);
		double sonuc=Math.pow(a, 2)+ b*b-(2*a*b*Math.cos(aciRadyan));
		System.out.println("3.kenar uzunlugu, cos teoremi ile: "+ sonuc);
	}

}

