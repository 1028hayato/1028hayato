package array;

import java.util.Random;

public class Task3 {
	public static void main(String args[]) {
		Random rnd = new Random();
		int[] nums = new int[6];
		int max = 0,min = 9999;

		System.out.print("[");

		for(int i = 0; i < nums.length; i++){
			nums[i] = rnd.nextInt(10);
			//0～9の乱数を配列に代入
		}
		for(int i = 0; i < nums.length; i++) {
			if(i < nums.length -1){
				System.out.print(nums[i] + ",");
			}else{
				System.out.println(nums[i] + "]");
				//ランダムな6つの整数を出力
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