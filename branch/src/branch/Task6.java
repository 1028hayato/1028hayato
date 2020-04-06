package branch;

import java.util.Scanner;

public class Task6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1～5までの数字を入力してください");
		int intNum = sc.nextInt();
		switch(intNum){
		case 1:
			System.out.print("1 -> I" );
			break;
		case 2:
			System.out.print("2 -> Ⅱ");
			break;
		case 3:
			System.out.print("3 -> Ⅲ");
			break;
		case 4:
			System.out.print("4 -> Ⅳ");
			break;
		case 5:
			System.out.print("5 -> Ⅴ");
			break;
		default:
			System.out.print(intNum + " -> unknown");
			break;
		}
		sc.close();
	}
}