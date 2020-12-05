package self_study;

//Kepler'in gezegensel hareket yasalarý, Güneþ Sisteminde bulunan gezegenlerin hareketlerini açýklayan üç matematiksel yasadýr.
import java.util.Scanner;
public class Kepler {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("a: ");
				double a = s.nextDouble();
			System.out.println("b: ");
				double b = s.nextDouble();
			System.out.println("teta: ");
				double teta = s.nextDouble();
				
			Kepler k = new Kepler();
			
			System.out.println("Eksentri: " + Eksentri(a, b));
			System.out.println("Polar: " + k.Polar(a, b, teta));
		}
	}
	
	public static double Eksentri(double q, double w)
	{
		return (Math.sqrt(1-(Math.pow((w/q), 2))));	
	}
	public double Polar(double a, double b, double q)
	{
		double t = Eksentri(a, b);
		double O = Math.toRadians(q);
		return (a*(1-(Math.pow(t,2)))/(1+t*Math.cos(O)));
	}
}


