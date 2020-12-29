package self_study;

public class sales1 {

	public static void main(String[] args) {
		
		sales[] salesPerson = new sales[10];
		int i;
		int assignId = 111;
		double assignSales = 25_000;
		
		final int SALES_INCREMENT = 5000;
		
		for(i = 0; i < salesPerson.length; ++i) {
			salesPerson[i] = new sales(assignId, assignSales);
			++assignId;
			assignSales += SALES_INCREMENT;
		}
		for(i = 0; i < salesPerson.length; ++i)
			System.out.println("salesPerson " + i + " id'si #" + salesPerson[i].getId() + " ve satis $" + salesPerson[i].getSale());

	}

}
