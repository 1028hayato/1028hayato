package calc;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[]) {
		String a = "ノートの値段:";
		int b = 89800;
		char c = '円';
		System.out.println(a + b + c);
		Scanner sc = new Scanner(System.in);
		System.out.println("どの商品の値段を調べますか。");
		String x = sc.nextLine();
		System.out.println("希望買い取り額を入力してください。");
		String y = sc.nextLine();
		System.out.println("円、外貨どちらを希望しますか。");
		String z = sc.nextLine();
		System.out.println(x +":" + y + z);
		sc.close();
	}
}