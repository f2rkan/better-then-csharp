package self_study;

import javax.swing.*;
public class BusinessLetter {

	public static void main(String[] args) {
		String name = null;
		String firstName = "";
		String familyName = "";
		int x;
		
		name = JOptionPane.showInputDialog(null, "Lutfen musterinin adini ve soyadini girin");
		x = 0;
		while(x < name.length()) {
			if(name.charAt(x) == ' ') {
				firstName = name.substring(0, x); //0'dan x'e kadar olan icerigi firstName'e ata
				familyName = name.substring(x + 1, name.length()); //boslugu 1 atla, metni sonuna kadar familyName degiskenine ata
				x = name.length();
			}
			++x;
		}
		JOptionPane.showMessageDialog(null, "Sevgili " + firstName + 
				",\nSizinle tanistigim icin cok mutluyum ve " + familyName +
				" ailenizin ihtiyaclari icin lutfen\nXXxXxxX no'lu numaradan hizmetlimiz ile iletisime gecin");
	}
}
