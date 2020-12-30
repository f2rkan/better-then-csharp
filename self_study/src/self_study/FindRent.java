package self_study;

import javax.swing.*;
public class FindRent {

	public static void main(String[] args) {
		
		int[][] rents = { 
				{400, 450, 510},
				{500, 560, 630},
				{625, 676, 740},
				{1000, 1250, 1600} 
		};
		
		String entry;
		int floor, bedrooms;
		
		entry = JOptionPane.showInputDialog(null, 
				"Kat numarasini gir > ");
		floor = Integer.parseInt(entry);
		entry = JOptionPane.showInputDialog(null, 
				"Yatak odasi numarasini gir > ");
		
		bedrooms = Integer.parseInt(entry);
		JOptionPane.showMessageDialog(null, 
				"Kiraladigin oda, " + bedrooms + 
				"; kat numarasi, " + 
						floor + 
						"; fiyati > $" + 
						rents[floor][bedrooms]);
	}
}
