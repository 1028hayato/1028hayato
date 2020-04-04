package branch;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1つ目の数字を入力してください。");
		int a = sc.nextInt();
		System.out.println("2つ目の数字を入力してください。");
		int b = sc.nextInt();
		System.out.println("numA:" + a);
		System.out.println("numB:" + b);
		if(a % b == 0) {
			System.out.println("numBはnumAの約数です。");
		}
		if(a % b > 0) {
			System.out.println("numBはnumAの約数ではありません。");
		}
		if(a >= 0) {
			System.out.println("正の整数を入力してください。");
		}else{
			if(b >= 0) {
				System.out.println("正の整数を入力してください。");
			}
		}
		sc.close();
	}
}