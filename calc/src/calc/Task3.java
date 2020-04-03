package calc;

import java.util.Scanner;


public interface Task3{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x);
		int y = sc.nextInt();
		System.out.println(y);
		int z = sc.nextInt();
		System.out.println(z);
		System.out.print("合計:");
		System.out.println(x + y + z);
		System.out.print("平均(3で割った時):");
		System.out.println((x + y + z) / 3);
		System.out.print("平均(3.0で割った時):");
		System.out.println((x + y + z) / 3.0);

		int a = sc.nextInt();
		System.out.println(a);
		int b = sc.nextInt();
		System.out.println(b);
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