package self_study;


public class Car {
	
	private int year;
	private Model model;
	private Color color;
	
	
	
	public Car(int a, Model minivan, Color blue) {
		year = a;
		model = minivan;
		color = blue;
	}
	public void Display() {
		System.out.println("araba, " + year + " model ve " + 
	color + " renk; tipi ise " + model);
	}
}

