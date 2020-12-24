package self_study;

public class arrayExample2 {

	public static void main(String[] args) {
		
		int[] scoreArray = new int[10];
		for(int sub = 0; sub < scoreArray.length; ++sub) {
			System.out.println(scoreArray[sub]);
		}
		System.out.println("---");
		//foreach
		for(int val : scoreArray) {
			System.out.println(val);
		}
	}
}
