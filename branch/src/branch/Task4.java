package branch;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("numA:" + a);
		System.out.println("numB:"+ b);
		if(a <= 0 || b <= 0) {
			System.out.println("正の整数を入力してください。");
		}else if(a % b == 0) {
			System.out.println("numBはnumAの約数です。");
		}else{
			System.out.println("numBはnumAの約数ではありません。");
		}
		sc.close();
	}
}
