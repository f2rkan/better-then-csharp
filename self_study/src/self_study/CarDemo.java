package self_study;

public class CarDemo {

	public static void main(String[] args) {

	      Car firstCar = new Car(2012, Model.SEDAN, Color.RED);
	      Car secondCar = new Car(2014, Model.CONVERTIBLE, Color.RED);
		
	      firstCar.Display();
	      secondCar.Display();
	}
}