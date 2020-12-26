package self_study;

public class DemoArray3 {

	public static void main(String[] args) {
		double[] salaries = {6.25, 6.55, 10.25, 16.85};
		System.out.println("maaslara tek tek ulastigimizda;");
		
		for(int x = 0; x < salaries.length; x++) {
			System.out.print(salaries[x] + " ");
		}
	}
}
