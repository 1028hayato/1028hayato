package array;

public class Task1 {
	public static void main(String args[]) {
		int[] numbers = {4,9,19,5,8,21,42,64,73,18,2};
		System.out.print("配列:" + " " + "[");
		for (int i = 0; i < numbers.length; i++) {
			if (i <= 9) {
				System.out.print(numbers[i] + ",");
			}else{
				System.out.println(numbers[i] + "]");
			}
			int sum = 0;
			for (int a : numbers) {
				sum += a;
			}
			System.out.println("合計:" + " " + sum);
		}
	}
}