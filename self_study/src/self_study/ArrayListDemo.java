package self_study;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Furkan");
		System.out.print("names.add(Furkan)\t");
			display(names);
		names.add("Brian");
		System.out.print("names.add(Brian)\t");
			display(names);
		names.add("Zachary");
		System.out.print("names.add(Zachary)\t");
			display(names);
		names.add(2, "Christy");
		System.out.print("names.add(2, Christy)\t");
			display(names);
		names.remove(1);
		System.out.print("names.remove(1)\t");
			display(names);
		names.set(0, "Annette");
		System.out.print("names.set(0, Annette)\t");
			display(names);
	}
	public static void display(ArrayList<String> names) {
		System.out.println("\nliste boyutu > " + names.size());
		for(int x = 0; x < names.size(); ++x)
			System.out.println(x + ". indis > " + names.get(x));
	}
}
