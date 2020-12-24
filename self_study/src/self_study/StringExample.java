package self_study;

public class StringExample {

	public static void main(String[] args) {
		String[] deptNames = {"Accounting", "Human Resources", "Sales"};
		
		for(int a = 0; a < deptNames.length; ++a) {
			System.out.println(deptNames[a]);
		}
		System.out.println("---");
		for(String b : deptNames) {
			System.out.println(b);
		}
		System.out.println("deptNames[0].length() > " + deptNames[0].length());
	}

}
