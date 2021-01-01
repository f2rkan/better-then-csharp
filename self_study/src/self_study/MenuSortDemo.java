package self_study;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MenuSortDemo {

	public static void main(String[] args) {

		String[] menu = new String[10];
		String entry = "", menuString = "";
		int x = 0, numEntered;
		int highestSub = menu.length - 1;
		
		Arrays.fill(menu, "zzzz");
		menu[x] = JOptionPane.showInputDialog(null, "menuye giris yap, cikis icin zzz gir > ");
		while(!menu[x].equals("zzz") && x < highestSub) {
			menuString += menu[x] + "\n";
			++x;
			if(x < highestSub) 
				menu[x] = JOptionPane.showInputDialog(null, "menuye giris yap, cikis icin zzz gir > ");
		}
		numEntered = x;
		entry = JOptionPane.showInputDialog(null, "bugunun menusu;\n" + menuString + "secim > ");
		Arrays.sort(menu, 0, numEntered);
		x = Arrays.binarySearch(menu, entry);
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, "cok iyi bir secim!");
		else
			JOptionPane.showMessageDialog(null, "bugunun menusunde maalesef yok");
	}
}
