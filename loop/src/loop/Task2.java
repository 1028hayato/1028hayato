package loop;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください:" + " ");
		int sum = 1;
		int a = sc.nextInt();
		System.out.print(1 + " ");
		for(int i = 2; i <= a; i++) {
			sum += i;
			System.out.print( "+" + " " + i + " ");
		}
		System.out.print("=" + " " + sum);
		sc.close();
	}
}