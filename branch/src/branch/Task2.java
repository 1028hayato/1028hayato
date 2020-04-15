package branch;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int a = sc.nextInt();
		if(a >= 10) {
			System.out.println("値:" +  a);
		}else{
			System.out.println("値:" + "0" + a);
		}
		sc.close();
	}
}