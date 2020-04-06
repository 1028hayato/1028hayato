package calc;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		String a = "ノートの値段:";
		int b = 89800;
		char c = '円';
		System.out.println(a + b + c);
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String y = sc.nextLine();
		String z = sc.nextLine();
		System.out.println(x + y + z);
		sc.close();
	}
}