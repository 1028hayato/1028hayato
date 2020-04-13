package loop;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("正の整数を入力してください:" + " ");
		int num = sc.nextInt();
		System.out.print(num +"の約数:" + " ");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0 && i == 1) {
				System.out.print(i);
			}else if(num % i == 0 && i >= 2) {
				System.out.print("," + i);
			}
		}
		sc.close();
	}
}