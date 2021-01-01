package self_study;

import java.util.ArrayList;
import javax.swing.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		ArrayList<String>students = new ArrayList<String>();
		String name;
		final int LIMIT = 4;
		for(int x = 0; x < LIMIT; ++x) {
			name = JOptionPane.showInputDialog(null, "ogrenci ismi > ");
			students.add(name);
		}
		System.out.println("ogrenci isimleri: " + students);
	}
}
