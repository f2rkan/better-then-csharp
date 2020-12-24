package self_study;

public class Employee {

	private int empNum;
	private double empSal;
	Employee(int e, double s){
		empNum = e;
		empSal = s;
	}
	public int getEmpNum() {
		return empNum;
	}
	public double getSalary() {
		return empSal;
	}
	public static void main(String[] args) {
		
		
		final int START_NUM = 101;
		final double STARTING_SALARY = 15_000;
		Employee[] emps = new Employee[7];
		
		for(int x = 0; x < emps.length; ++x)
		{
			emps[x] = new Employee(START_NUM + x, STARTING_SALARY);
		}
		//Employee view
		for(int x = 0; x < emps.length; ++x)
			System.out.println(emps[x].getEmpNum() + " " +
					emps[x].getSalary());
		//ya da
		System.out.println("---");
		for(Employee worker : emps)
			System.out.println(worker.getEmpNum() + " " + worker.getSalary());
	}
	
	//default constructer kullanarak bir nesne dizisi olusturmak icin, bildirilen her dizi öðesi icin
	//new anahtar sozcugu kullanarak constructer'ý cagýrmalýyýz: örneðin InventoryItem adýnda bir sýnýf olusturdugumuzu dusunelim
	//ve bu sýnýfa constructer yazmadýgýmýzý varsayalým. 1000 elemanlý InventoryItem dizisi olusturmak icin;
	
	/*
	  final int NUM_ITEMS = 1000;
	  InventoryItem[] items = new InventoryItem[NUM_ITEMS];
	  for(int x = 0; x < NUM_ITEMS; ++x)
	  	items[x] = new InventoryItem();
	  */
}
