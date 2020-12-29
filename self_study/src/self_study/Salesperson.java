package self_study;

public class Salesperson {

	private int id;
	private double sales;
	
	Salesperson(int idNum, double amt){
		id = idNum;
	    sales = amt;
	}
	public int getId() {
		return id;
	}
	public double getSales() {
		return sales;
	}
}
