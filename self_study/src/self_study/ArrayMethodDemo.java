package self_study;

public class ArrayMethodDemo {

	public static void main(String[] args) {

		int[] numbers = {
			12, 15, 34, 67, 4, 9, 10, 7, 13, 50
		};
		int limit = 12;
		
		display(numbers);
		displayReverse(numbers);
		displaySum(numbers);
		displayLessThan(numbers, limit);
		displayHigherThanAverage(numbers);
	}
	public static void display(int[] numbers) {
		System.out.print("numbers > ");
		for(int x = 0; x < numbers.length; ++x)
			System.out.print(" " + numbers[x]);
	}
	public static void displayReverse(int[] numbers) {
		System.out.print("\nreversed numbers  > ");
		for(int x = numbers.length- 1; x >= 0; x--)
			System.out.print(" " + numbers[x]);
	}
	public static void displaySum(int[] numbers) {
		System.out.print("\nsum of numbers > ");
		int total = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			total += numbers[i];
		}
		System.out.println(total);
	}
	public static void displayLessThan(int[]numbers, int limit) {
		for(int i = 0; i < numbers.length; ++i)
			if(numbers[i] < limit)
				System.out.print(numbers[i] + " ");
		System.out.println(limit + " limitin altinda");
	}	
	public static void displayHigherThanAverage(int[] numbers) {
		double average;
		int sum = 0;
		
		for(int i = 0; i < numbers.length; ++i)
			sum += numbers[i];
		average = sum / numbers.length;
		System.out.println("ortalama > " + average);
		
		for(int i = 0; i < numbers.length; ++i)
			if(numbers[i] > average)
				System.out.print(numbers[i] + " ");
		System.out.println("sayilari ortalamanin ustunde.");
	}
}
