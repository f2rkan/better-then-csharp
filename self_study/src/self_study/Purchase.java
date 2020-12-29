package self_study;

public class Purchase {

	private int invoiceNumber;
	private double saleAmount;
	private double tax;
	
	private static final double RATE = 0.05;
	
	public void setInvoiceNumber(int num) {
		invoiceNumber = num;
	}
	public void setSaleAmount(double amt) {
		saleAmount = amt;
		tax = saleAmount * RATE;
	}
	public void display() {
		System.out.println("Fatura #" + invoiceNumber +
				" $" + saleAmount + "; vergisi, " + tax);
	}
}
