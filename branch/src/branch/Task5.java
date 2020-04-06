package branch;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = a;
		int b = sc.nextInt();
		if(max < b) {
			max = b;
		}
		int c = sc.nextInt();
		if(max < c) {
			max = c;
		}
		System.out.println("numA:" + a);
		System.out.println("numB:" + b);
		System.out.println("numC:" + c);
		System.out.println("最大値:" + max);
		sc.close();
	}
}