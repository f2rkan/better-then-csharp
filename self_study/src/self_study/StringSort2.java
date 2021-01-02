package self_study;

import java.util.*;
import javax.swing.*;

public class StringSort2 {

	public static void main(String[] args) {

		String[] values = new String[5];
		int i = 0, count = 0;
		String word;
		
		final String QUIT = "zzz";
		boolean didUserQuit = false;
		
		Arrays.fill(values, QUIT);
		
		
		while(i < values.length) {
			word = JOptionPane.showInputDialog(null, "bir kelime gir " +
				" ya da " + QUIT + " girerek programi sonlandir > ");
			
			if(word.equals(QUIT)) {
				count = i;
				i = values.length;
				didUserQuit = true;
			}
			else {
				values[i] = word;
				++i;
			}
		}
		if(!didUserQuit)
			count = values.length;
		String message = "Values > ";
		Arrays.sort(values);
		for (i = 0; i < count; i++)
			message += " " + values[i];
		
		JOptionPane.showMessageDialog(null, message);
	}
}
