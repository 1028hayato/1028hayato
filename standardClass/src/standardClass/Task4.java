package standardClass;

import java.util.Scanner;

public class Task4 {
	public static void main(String args[]){
		String str = "ABCDGOPQRSYZ";
		Scanner sc = new Scanner(System.in);

		System.out.print("検索したい文字:"+ " ");

		String alph = sc.next();

		System.out.println(alph);//標準入力の出力

		if(str.contains(alph)) {
			System.out.println(str + "は" + alph + "を含む");//文字が含まれる場合の出力
		}else{
			System.out.println(str + "は" + alph + "を含まない");//文字が含まれない場合の出力
		}
		sc.close();
	}
}