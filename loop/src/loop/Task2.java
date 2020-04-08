package loop;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		int a = sc.nextInt();
		System.out.println("数字を入力してください:" + a);
		System.out.print(1);
		for(int i = 2; i <= a; i++) {
			sum += i;
			System.out.print( "+" + i);
		}
		System.out.print("=" + sum);
		sc.close();
	}
}