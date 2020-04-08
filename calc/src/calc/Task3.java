package calc;

import java.util.Scanner;


public interface Task3{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int total = x + y + z, ava = total / 3;
		double ava2 = total / 3.0;
		System.out.println("合計:" + total);
		System.out.println("平均(3で割った時):"+ ava);
		System.out.println("平均(3.0で割った時):"+ ava2);
		sc.close();
	}
}