package self_study;

import java.util.*;
public class SalespersonDatabase {

	public static int addOption(SalespersonArray[] array, int count) {
		
		Scanner keyboard = new Scanner(System.in);
		int id;
		double sales;
		boolean alreadyEntered;
		if(count == array.length)
			System.out.println("uzgunum - dizi dolu; kaydini ekleyemem.");
		else {
			System.out.println("personel id > ");
			id = keyboard.nextInt();
			alreadyEntered = false;
			
			for(int x = 0; x < count; ++x)
				if(array[x].getId() == id) {
					System.out.println("uzgunum, bu id girildi.");
					alreadyEntered = true;
				}
			if(!alreadyEntered) {
				System.out.print("degeri gir > ");
				sales = keyboard.nextDouble();
				array[count] = new SalespersonArray(id, sales);
				++count;
			}
		}
		display(array, count);
		keyboard.nextLine();
		return count;
	}
	public static int deleteOption(SalespersonArray[] array, int count) {
		Scanner keyboard = new Scanner(System.in);
		int id, position = 0;
		if(count == 0)
			System.out.println("veri tabaninda kayit yok, silinme islemi basarisiz.");
		else {
			System.out.print("silinmesini istedigin id > ");
			id = keyboard.nextInt();
			boolean exist = false;
			for(int i = 0; i < count; ++i)
				if(array[i].getId() == id) {
					exist = true;
					position = i;
				}
			if(!exist)
				System.out.println("uzgunum, " + id + " numarali id veritabaninda yok.");
			else
				for(int i = position; i < count - 1; ++i)
					array[i] = array[i + 1];
			if(exist)
				--count;
			keyboard.nextLine();
			display(array, count);
		}
		return count;
	}
	public static void changeOption(SalespersonArray[] array, int count) {
		Scanner keyboard = new Scanner(System.in);
		int id, position = 0;
		double sales;
		if(count == 0)
			System.out.println("veritabani bos -- kayit degistirilemedi.");
		else {
			System.out.print("degistirmek istedigin id > ");
			id = keyboard.nextInt();
			boolean exist = false;
			for(int i = 0; i < count; ++i)
				if(array[i].getId() == id) {
					exist = true;
					position = i;
				}
			if(!exist)
				System.out.println("uzgunum, " + id + " numarali id veritabaninda bulunamadi.");
			else {
				System.out.print("degeri gir > ");
				sales = keyboard.nextDouble();
				array[position].setSales(sales);
			}
			keyboard.nextLine();
			display(array, count);
		}
	}
	public static void display(SalespersonArray[] array, int count) {
		int a, b;
		SalespersonArray temp;
		int highSubscript = count - 1;
		
		for(a = 0; a < highSubscript; ++a)
			for(b = 0; b < highSubscript; ++b) {
				if(array[b].getId() > array[b + 1].getId()) {
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
		System.out.println("\nmevcut database;");
		for(a = 0; a < count; ++a)
			System.out.println("id #" + array[a].getId() + ", $" + array[a].getSales());
		
		System.out.println();
	}
	public static void main(String[] args) {
	
		SalespersonArray[] salespeople = new SalespersonArray[2];
		
		int id, count = 0;
		double sales;
		
		final int QUIT = 999;
		char option;
		String message = "";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("yapmak istedigin islem: (A)dd, (D)elete, (C)hange or (Q)uit > ");
		
		option = keyboard.nextLine().charAt(0);

		while(option != 'Q') {
			if(option == 'A')
				count = addOption(salespeople, count);
			else if(option == 'D')
				count = deleteOption(salespeople, count);
			else if(option == 'C')
				changeOption(salespeople, count);
			else
				System.out.println("gecersiz giris");
			
			System.out.print("yapmak istedigin islem: (A)dd, (D)elete, (C)hange or (Q)uit > ");
			
			option = keyboard.nextLine().charAt(0);
			
		}
	}
}
