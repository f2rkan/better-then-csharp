package self_study;

public class MethodArray {

	public static void main(String[] args) {
		
		int[] vize = getArray();
		for(int x = 0; x < vize.length; ++x)
			System.out.print(vize[x] + " ");
		
	}
	public static int[] getArray() {
		int[] scores = {
			10, 20, 30, 40, 50	
		};
		return scores;
	}
}
