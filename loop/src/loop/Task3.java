package loop;

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください:" + " ");
		int num = sc.nextInt();
		int digits = 0;
		while(num > 0) {
			num /= 10;
			digits++;
		}
		System.out.print("桁数:" + " " + digits);
		sc.close();
	}
}