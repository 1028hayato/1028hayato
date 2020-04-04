package branch;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1つ目の数字を入力してください。");
		int a = sc.nextInt();
		System.out.println("2つ目の数字を入力してください。");
		int b = sc.nextInt();
		System.out.println("3つ目の数字を入力してください。");
		int c = sc.nextInt();
		if(a >= b && a >= c) {
			System.out.println("最大値:" + a);
		}else  if(b >= a && b >= c)
			System.out.println("最大値:" + b);
		else if(c >= a && c >= b)
			System.out.println("最大値:" + c);
		sc.close();
	}
}