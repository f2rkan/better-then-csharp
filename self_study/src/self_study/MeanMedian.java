package self_study;

import javax.swing.*;
public class MeanMedian {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		String entry;
		String list = "girislerin : ";
		int temp, midPos, total = 0;
		double mean;
		
		for (int i = 0; i < nums.length; i++) {
			entry = JOptionPane.showInputDialog(null, "numara " + (i+1) + " > ");
			nums[i] = Integer.parseInt(entry);
			total += nums[i];
			
			if(i == 0)
				list += " " + nums[i];
			else
				list += ", " + nums[i];
		}
		System.out.println(list);
		//bubble sort
		int comp = nums.length - 1;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < comp; j++) {
				if(nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
			--comp;
		}
		midPos = nums.length / 2;
		mean = total / nums.length;
		System.out.println("ortalama, " + mean + "; medyan, " + nums[midPos] + ".");
	}
}
