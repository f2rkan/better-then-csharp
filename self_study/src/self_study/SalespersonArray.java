package self_study;

public class SalespersonArray {

	private int id;
	private double sales;
	
	SalespersonArray(int idNum, double amt){
		id = idNum;
		sales = amt;
	}
	public int getId() { return id; }
	public double getSales() { return sales; }
	public void setId(int idNum) { id = idNum; }
	public void setSales(double amt) { sales = amt; }
}