package all_over;

import all_over.Islemler;

public class EnumlarUygulamasi {

	public static void main(String[] args) {
		System.out.println(Islemler.carp.hesapla(3, 5));
	}
}

enum Islemler{
	topla, cikar, carp, bol;
	public double hesapla(double sayi1, double sayi2) {
		double sonuc = 0;
		switch (this) {
		case topla:
				sonuc = sayi1 + sayi2;
			break;
		case cikar: 
				if(sayi1 >= sayi2) sonuc = sayi1 - sayi2;
				else sonuc = sayi2-sayi1;
			break;
		case carp:
			sonuc = sayi1 * sayi2;
			break;
		case bol: 
				if(sayi1 >= sayi2) sonuc = sayi1 / sayi2;
				else sonuc = sayi2 / sayi1;
			break;
		default: 
				sonuc = -1;
			break;
		}
		return sonuc;
	}
}