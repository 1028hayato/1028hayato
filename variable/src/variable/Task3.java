package variable;

public class Task3 {
	public static void main(String args[]){
		System.out.println("変換前");
		int intNum = 219;
		System.out.println(intNum);
		double doubleNum = 364.2;
		System.out.println(doubleNum);
		long longNum = 123456L;
		System.out.println(longNum);
		System.out.println("変換後");
		long longAfter = intNum;
		System.out.println(longAfter);
		float floatAfter = (float)doubleNum;
		System.out.println(floatAfter);
		double doubleAfter = longNum;
		System.out.println(doubleAfter);
	}
}