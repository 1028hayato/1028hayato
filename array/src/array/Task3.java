package array;

import java.util.Random;

public class Task3 {
	public static void main(String args[]) {
		Random rnd = new Random();
		int[] nums = new int[5];
		System.out.print("[");
		int max = 0,min = 9999;
		for(int i = 0; i < nums.length; i++){
			nums[i] = rnd.nextInt(10);
		}
		for(int i = 0; i <= 4; i++) {
			if(i <= 3){
				System.out.print(nums[i] + ",");
			}else{
				System.out.println(nums[i] + "]");
			}
			if(max < nums[i]) {
				max = nums[i];
			}
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("最大値:"	+ " " + max);
		System.out.println("最小値:"	+ " " + min);
	}
}