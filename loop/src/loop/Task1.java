package loop;

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = sc.nextInt();
		for(int i = 0; i <= a; i++) {
			sum += i;
		}
		System.out.println("数字を入力してください:" + a);
		System.out.println("1～" + a + "の合計:" + sum);
		sc.close();
	}
}