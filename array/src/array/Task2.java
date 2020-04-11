package array;

public class Task2 {
	public static void main(String args[]) {
		int[] numbers = {7,6,5,4,3,2,1};
		for (int i = 0; i < numbers.length; i++) {
			if (i <= 5) {
				System.out.print(numbers[i] + ",");
			}else{
				System.out.println(numbers[i]);
			}
			}
		for (int a = numbers.length - 1; a >= 0; a--) {
			if (a >= 1) {
				System.out.print(numbers[a] + ",");
			}else{
				System.out.println(numbers[a]);
			}
		}
	}
}