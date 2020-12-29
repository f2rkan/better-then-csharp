package self_study;

public class DemoSalesperson {

	public static void main(String[] args) {
		
		Salesperson[] salesPeople = new Salesperson[10];
		int i;
		for(i = 0; i < salesPeople.length; ++i)
			salesPeople[i] = new Salesperson(0, 0); //0, 0 dedik cunku kurucuyu 'int int' olarak tanýmladýk
		for(i = 0; i < salesPeople.length; ++i)
			System.out.println("Salesperson " + i + 
					" ID'si #" + 
					salesPeople[i].getId()+ 
					"ve bu id'nin yillik satisinin ederi $" + 
					salesPeople[i].getSales());
	}
}
