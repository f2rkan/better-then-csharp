package self_study;

import javax.swing.*;
public class CarCareChoice2 {

	public static void main(String[] args) {
	
		String[] items = {
				"yag degisimi",
				"lastik degisimi",
				"aku kontrolu",
				"fren - balata kontrolu"	
		};
		int[] prices = {
			25, 22, 15, 5	
		};
		
		int x;
		boolean isMatch = false;
		int matchIndex = 0;
		String menu = "secimini gir > ";
		
		for(x = 0; x < items.length; ++x)
			menu += "\n" + items[x];
		String selection = JOptionPane.showInputDialog(null, menu);
		
		for(x = 0; x < items.length; ++x)
			if(selection.substring(0, 3).equals(items[x].substring(0, 3))){
				isMatch = true;
				matchIndex = x;
			}
		if(isMatch)
			JOptionPane.showMessageDialog(null, selection + " hizmeti, $" + prices[matchIndex]);
		else
			JOptionPane.showMessageDialog(null, "Gecersiz Giris");
	}

}
