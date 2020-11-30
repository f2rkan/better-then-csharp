package all_over;

public class foreach_deneme {

	public static void main(String[] args) {
		
		String[] araba = {"Volvo", "BMW", "FERRARI", "LAMBO"};
		
		for(String liste : araba)
			if(liste != "LAMBO") System.out.print(liste + ", ");
				else System.out.print(liste);
	}
}
