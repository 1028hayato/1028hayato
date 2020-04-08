package calc;

public class Task2 {
	public static void main(String args[]){
		int a = 10, b = 12, c = 13,	total = a + b + c, ava = total / 3;
		double ava2 = total / 3.0;
		System.out.println("合計:" + total);
		System.out.println("平均(3で割った時):"+ ava);
		System.out.print("平均(3.0で割った時):"+ ava2);
	}
}