package calc;

import java.util.Scanner;


public interface Task3{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3つの数字の合計と平均を出力します。1つ目の数字を入力してください。");
		int x = sc.nextInt();
		System.out.println("2つ目の数字を入力してください。");
		int y = sc.nextInt();
		System.out.println("3つ目の数字を入力してください。");
		int z = sc.nextInt();
		String total = "合計:",ava = "平均";
		System.out.println(total + (x + y + z));
		System.out.println(ava +"(3で割った時):"+ (x + y + z) / 3);
		System.out.print(ava + "(3.0で割った時):"+ (x + y + z) / 3.0);
		sc.close();
	}
}