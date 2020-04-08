package loop;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("正の整数を入力してください:" + num);
		System.out.print(num +"の約数:" + "1");
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(  "," + i);
			}
			sc.close();
		}
	}
}