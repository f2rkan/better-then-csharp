package self_study;

public class sales {

	private int id;
	private double sale;
	
	sales(int idNum, double amt){
		id = idNum;
		sale = amt;
	}
	public int getId() {
		return id;
	}
	public double getSale() {
		return sale;
	}
}
