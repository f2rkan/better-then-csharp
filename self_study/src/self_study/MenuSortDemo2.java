package self_study;

import java.util.Arrays;
import javax.swing.*;

public class MenuSortDemo2 {

	public static void main(String[] args) {
		
		String[] menu = new String[10];
		String entry, menuString = "";
		int highestSub = menu.length - 1;
		int x = 0;
		int numEntered;
		//diziye aldigimiz elemanlari islemek icin neden bilmiyorum ama fill cekmemiz gerekiyor, yoksa aldigimiz verileri isleyemiyoruz hata veriyor derleyici
		Arrays.fill(menu, "zzzz");
		//menuye alim burada basliyor
		menu[x] = JOptionPane.showInputDialog(null, "menuye giris yap, cikis icin zzz yaz > ");
		//kontrol ve alim devami
		while(!menu[x].equals("zzz") && x < highestSub) {
			menuString += menu[x] + "\n";
			++x;
			if(x < highestSub)
				menu[x] = JOptionPane.showInputDialog(null, "menuye giris yap, cikis icin zzz yaz > ");
		}
		//diziye sort cekimi ve binarySearch ile x degerini aliyor, kontrol edip islem yapiyoruz
		numEntered = x;
		Arrays.sort(menu, 0, numEntered);
		entry = JOptionPane.showInputDialog(null, "menu;\n" + menuString + "tercihin nedir > ");
		x = Arrays.binarySearch(menu, entry);
		
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, "cok iyi bir secim!");
		else
			JOptionPane.showMessageDialog(null, "uzgunum, bu secim bugunun menusunde yok.");
	}
}
