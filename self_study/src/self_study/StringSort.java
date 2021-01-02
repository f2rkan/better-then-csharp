package self_study;

import java.util.*;
import javax.swing.*;

public class StringSort {

	public static void main(String[] args) {
		
		String[] values = {
				 "mouse", "dog", "cat", "horse", "cow",
		         "moose", "tiger", "lion", "elephant", "bird", "hamster",
		         "guina pig", "leopard", "aardvark", "hummingbird",
		         "rat", "pig", "sheep", "bumble bee", "dolphin"	
		};
		
		String message = "";
		Arrays.sort(values);
		for (int i = 0; i < values.length; i++) {
			message += " " + values[i];
		}
		JOptionPane.showMessageDialog(null, message);
	}
}
