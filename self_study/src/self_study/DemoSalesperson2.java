package self_study;

public class DemoSalesperson2 {

	public static void main(String[] args) {
		Salesperson[] salesPeople = new Salesperson[10];
		int i;
		int assignId = 111;
		int assignSales = 25_000;
		final int SALES_INCREASE = 5000;
		
		for(i = 0; i < salesPeople.length; ++i) {
			salesPeople[i] = new Salesperson(assignId, assignSales);
			++assignId;
			assignSales += SALES_INCREASE;
		}
		for(i = 0; i < salesPeople.length; ++i)
			System.out.println("Salesperson " + i +
					" id'si #" + 
					salesPeople[i].getId() + 
					" ve yillik satis ederi $" + 
					salesPeople[i].getSales());
	}
}
