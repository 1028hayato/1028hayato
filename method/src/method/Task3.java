package method;

public class Task3 {
	public static void main(String args[]) {
		System.out.println("--①文字だけの場合---");
		String moji = add("文字列1","文字列2");
		System.out.println(moji);

		System.out.println("---②整数だけの場合----");
		int integral = add(3,5);
		System.out.println(integral);

		System.out.println("---③小数だけの場合----");
		double decimal = add(3.5,5.5);
		System.out.println(decimal);
	}
	static String add(String name1,String name2) {
		return name1 + name2;
	}
	static int add(int num1,int num2){
		return num1 + num2;
	}
	static double add(double num01,double num02) {
		return num01 + num02;
	}
}