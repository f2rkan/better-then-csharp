package all_over;

//try'a dikkat
import java.util.Scanner;
public class mesafe_hesaplama {

	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.print("1. aracin hizi: ");
				double hiz1 = keyboard.nextDouble();
			System.out.print("2. aracin hizi: ");
				double hiz2 = keyboard.nextDouble();
			
				System.out.println("sure gir, dakika cinsi: ");
					int sure = keyboard.nextInt();
			
					hesapla(hiz1, hiz2, sure);
					System.out.println(sure + " dk sonra iki arac arasi mesafe: " + hesapla2(hiz1, hiz2, sure) + " km");

					mesafe_hesaplama d = new mesafe_hesaplama();
					System.out.println(sure + " dk sonra iki arac arasi mesafe: " + d.hesapla3(hiz1, hiz2, sure) + " km");
		}

	}

	public static void hesapla(double a, double b, double c)
	{
		if(a > b) System.out.println(c + " dk sonra iki arac arasi mesafe: " + (a-b)*c + " km");
		else System.out.println(c + " dk sonra iki arac arasi mesafe: " + (b-a)*c + " km");
	}
	public static double hesapla2(double a, double b, double c)
	{
		return (Math.abs(a-b)*c);
	}
	public double hesapla3(double a, double b, double c)
	{
		return (Math.abs(b-a)*c);
	}

}

