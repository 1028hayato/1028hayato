package standardClass;

public class Task3 {
	public static void main(String args[]){
		String str ="文字列: ABCDEFG";

		System.out.println(str); //文字列を順番に出力

		for(int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));//文字列を逆順に出力
		}
	}
}