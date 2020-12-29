package self_study;

public class PassArray {

	public static void main(String[] args) {
	
		final int NUM_ELEMENTS = 4;
		int[] someNums = {
			5, 10, 15, 20	
		};
		int x;
		System.out.print("main basladi > ");
		for(x = 0; x < NUM_ELEMENTS; ++x)
			System.out.print(" " + someNums[x]);
		System.out.println();
		methodGetsArray(someNums);
		System.out.print("main sonu > ");
		for(x = 0; x < NUM_ELEMENTS; ++x)
			System.out.print(" " + someNums[x]);
		System.out.println();
	}
	//PassArrayElement'teki method ile arasýndaki fark, burada dizinin adresini kullandýk orada degerini manipule ettik
	//bu yuzden burada dizideki mevcut indis degerini degistirdik, orada ise sadece kopyalama yaptýk
	public static void methodGetsArray(int[] arr) {
		int x;
		System.out.print("method arr ile basladi > ");
		for(x = 0; x < arr.length; ++x)
			System.out.print(" " + arr[x]);
		System.out.println();
		for(x = 0; x < arr.length; ++x)
			arr[x] = 888;
		System.out.print(" ve method arr bitti > ");
		for(x = 0; x < arr.length; ++x)
		System.out.print(" " + arr[x]);
		System.out.println();
	}
}

