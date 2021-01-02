package all_over;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListler {

	public static void main(String[] args) {
		
		//() fonksiyon
		//Generic type: <> ile belirtilir, <String>
		
		int n = 5;
		ArrayList<String>listem = new ArrayList<>();
		ArrayList<String>listem2 = new ArrayList<String>();
		//ArrayList<String>listem3 = new ArrayList<String>(5);
		
		ArrayList<Integer>listem3 = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			listem2.add(i + ". eleman");
			//add islemi sona ekleme yapar
		}
		
		//ArrayList'lerde liste boyutu onceden verilmis olsa dahi yeni gelecek eklemeler icin
		//dinamik olarak yer acar.
		System.out.println(listem2);
		//belirli bir indise eleman ekleme
		listem2.add(2, "deneme");
		System.out.println(listem2);
		
		listem2.add("deneme");
		System.out.println(listem2);
		
		System.out.println(listem2.indexOf("deneme"));
		//indexOf, aranan degerin ilk hangi indiste oldugunu getirir
		
		System.out.println(listem2.lastIndexOf("deneme"));
		//lastIndexOf, aranan degerin en son oldugu index'i getirir
		
		System.out.println(listem2.contains("deneme2"));
		//listede aranan elemanin olup olmadigini donderir, boolean tipindedir.
		
		if (listem2.contains("deneme")) {
			System.out.println("liste, deneme metnini iceriyor");
		}
		else {
			System.out.println("listede deneme metni yok");
		}
		System.out.println(listem2);
		//listenin tamamini yazdirir
		
		listem2.remove("deneme");
		//remove, aranan degerin ilk index'indeki degeri siler.
		System.out.println(listem2);
		
		listem2.remove(5);
		//remove ile belirli bir index'in degerini de silebiliriz
		
		for (String deger : listem2) {
			System.out.println(deger);
		}
		
		int ArrayListBoyutu = listem3.size();
		System.out.println("---");
		for (int i = 0; i < listem2.size(); i++) {
			System.out.println(listem2.get(i)); 
		}
		
		listem2.set(2, "XXXXXXXXX");
		//set, belirlenen index'in degerini degistirir
		System.out.println(listem2);
		
		listem2.clear();
		//listenin tum elemanlarini siler
		
		listem2.isEmpty();
		//listede deger olup olmadigini kontrol eder
		
		//siralamalar
		Collections.sort(listem2);
		//A----Z siralama
		
		Collections.sort(listem2, Collections.reverseOrder());
		//Z----A siralama
		
		
	}

}
