package self_study;

import javax.swing.*;
public class SalespersonArraySort {

	public static void main(String[] args) {
		
		SalespersonArray[] salespeople = new SalespersonArray[2];
		int x, id;
		double sales;
		String order, message = "";
		
		for(x = 0; x < salespeople.length; ++x) {
			id = Integer.parseInt(JOptionPane.showInputDialog(null,
					"id numarasi > "));
			sales = Double.parseDouble(JOptionPane.showInputDialog(null, 
					"satis degeri > $"));
			salespeople[x] = new SalespersonArray(id, sales);
		}
		
		order = JOptionPane.showInputDialog(null, 
				"Siralama neye gore olsun?\n" + 
		"(I)d or (S)ales > ");
		order.toUpperCase();
		if(order.charAt(0) == 'I')
			sortById(salespeople);
		else
			sortBySales(salespeople);
		
		for(x = 0; x < salespeople.length; ++x)
			message += "\nID > " + salespeople[x].getId() +
			"; satis degeri > " + salespeople[x].getSales();
		JOptionPane.showMessageDialog(null, message);
	}

	public static void sortById(SalespersonArray[] array) {
		int a, b;
		SalespersonArray temp;
		
		int highSubscript = array.length - 1;
		
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b) {
				if(array[b].getId() > array[b + 1].getId()) {
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
	}
	public static void sortBySales(SalespersonArray[] array) {
		int a, b;
		SalespersonArray temp;
		int highSubscript = array.length - 1;
		
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b) {
				if(array[b].getSales() > array[b + 1].getSales()) {
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
	}
}
