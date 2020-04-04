package calc;

import java.util.Scanner;


public interface Task3{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3つの数字の合計と平均を出力します。1つ目の数字を入力してください。");
		int x = sc.nextInt();
		System.out.println(x);
		System.out.println("2つ目の数字を入力してください。");
		int y = sc.nextInt();
		System.out.println(y);
		System.out.println("3つ目の数字を入力してください。");
		int z = sc.nextInt();
		System.out.println(z);
		System.out.print("合計:");
		System.out.println(x + y + z);
		System.out.print("平均(3で割った時):");
		System.out.println((x + y + z) / 3);
		System.out.print("平均(3.0で割った時):");
		System.out.println((x + y + z) / 3.0);
		System.out.println("3つの数字の合計と平均を出力します。1つ目の数字を入力してください。");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("2つ目の数字を入力してください。");
		int b = sc.nextInt();
		System.out.println(b);
		System.out.println("3つ目の数字を入力してください。");
		int c = sc.nextInt();
		System.out.println(c);
		System.out.print("合計:");
		System.out.println(a + b + c);
		System.out.print("平均(3で割った時):");
		System.out.println((a + b + c) / 3);
		System.out.print("平均(3.0で割った時):");
		System.out.println((a + b + c) / 3.0);
		sc.close();
	}
}