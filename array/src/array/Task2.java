package array;

public class Task2 {
	public static void main(String args[]) {
		int[] numbers = new int[7];
		int a = 7;
		for (int i = 0; i < numbers.length ; i++) {
			numbers[i]= a--;
			//配列に数字を代入
		}
		for (int i = numbers.length -1; i >= 0 ; i--) {
			if (i >= 1) {
				System.out.print(numbers[i] + ",");
			}else{
				System.out.println(numbers[i]);
				//7～1の数字を出力
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length -1) {
				System.out.print(numbers[i] + ",");
			}else{
				System.out.println(numbers[i]);
				//1～7の数字を出力
			}
		}
	}
}