package self_study;

import java.util.Scanner;

public class arrayExample {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x, y, z;
		System.out.println("x: ");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		//getFuntion'ý static tanimlasaydik nesne turetmeye gerek kalmayacakti.
		arrayExample a = new arrayExample();
		double[] salesFigures = new double[a.getFunction(x, y, z)];
		
		boolean[] xx = new boolean[3];
		for(int i = 0; i < 3; i++)
		{
			System.out.println(i + 1 + " > " + xx[i]);
		}
		int[] diziDoldurma = {1, 2, 3, 4};
		
		int[] denemeDizisi = new int[5];
		for(int i = 0; i < 3; i++)
		{
			denemeDizisi[i] = s.nextInt();
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.println(denemeDizisi[i]);
		}
		//diziAdi.length > dizi buyuklugunu verir.
		System.out.println("denemeDizisi.length > " + denemeDizisi.length);
		
	}

	public int getFunction(int x, int y, int z) {
		
		int q = x+y*z;
		return q;
		
	}
}

/*NOTLAR
 * array'ler referans tipte veri türleridir
 * diziyi tanýmlamak icin new anahtar sozcugunu kullandýgýmýzda, dizi referansý bir bellek adresi deðeri alýr
 * boolean dizileri default olarak false basar
 * String dizileri default olarak null'a ayarlýdýr*/
