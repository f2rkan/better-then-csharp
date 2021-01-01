package self_study;

import java.util.Arrays;
import javax.swing.*;
public class MenuSearch {

	public static void main(String[] args) {
		
		String[] menuChoices = new String[10];
		String entry = "", menuString = "";
		int x = 0, numEntered;
		int highestSub = menuChoices.length - 1;
		
		Arrays.fill(menuChoices, "zzzzz");
		menuChoices[x] = JOptionPane.showInputDialog(null, 
				"bugunun menusunde bir eleman gir ya da QUIT icin zzz yaz > ");
		while(!menuChoices[x].equals("zzz") && x < highestSub) {
			menuString += menuChoices[x] + "\n";
			++x;
			if(x < highestSub)
				menuChoices[x] = JOptionPane.showInputDialog(null, 
						"bugunun menusunde bir eleman gir ya da QUIT icin zzz yaz > ");
		}
		numEntered = x;
		entry = JOptionPane.showInputDialog(null, 
				"bugunun menusu;\n" + menuString + "Lutfen sec:");
		Arrays.sort(menuChoices, 0, numEntered);
		x = Arrays.binarySearch(menuChoices, entry);
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, "cok iyi bir secim");
		else
			JOptionPane.showMessageDialog(null, "bugunun menusunde bu yok, uzgunum");
	}

}
