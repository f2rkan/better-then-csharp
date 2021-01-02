package self_study;

import javax.swing.*;
public class MeanMedian2 {

	public static void main(String[] args) {
		
		int[] nums = new int[20];
		
		String entry, list = "girislerin > ";
		int a, b, temp, size = 0, num = 0;
		double median, total = 0, mean = 0;
		final int QUIT = 9999;
		
		
		for(a = 0; num != QUIT && a < nums.length; ++a) {
			entry = JOptionPane.showInputDialog(null, "sayi " + (a + 1) + " girisini yap ya da " + 
					QUIT + " tuslayarak programi sonlandir > ");
			num = Integer.parseInt(entry);
			if(num != QUIT) {
				nums[a] = num;
				total += nums[a];
				if(a == 0)
					list += " " + nums[a];
				else
					list += ", " + nums[a];
			}
		}
		
		if(num != QUIT)
			size = nums.length;
		else
			size = a - 1;
		System.out.println("boyut: " + size);
		
		System.out.println(list);
		
		int comp = size - 1;
		
		for(a = 0; a < size - 1; ++a) {
			for(b = 0; b < comp; ++b) {
				if(nums[b] > nums[b + 1]) {
					temp = nums[b];
					nums[b] = nums[b + 1];
					nums[b + 1] = temp;
				}
			}
			--comp;
		}
		if(size % 2 == 0)
			median = (nums[(size / 2)] + nums[(size / 2) - 1]) / 2;
		else
			median = nums[(size / 2)];
		
		if(size != 0)
			mean = total / size;
		System.out.println("ortalama, " + mean + "; medyan, " + median);
	}
}
