package method;

public class Task2 {
	public static void main(String args[]) {
		System.out.println("三角形の面積");

		double TriangleArea = getTriangleArea(30, 9);
		System.out.println(TriangleArea);
	}
	static double getTriangleArea(double num1,double num2) {
		return (double)Math.round(num1 * num2 / 2);
		//三角形の面積を求める計算式
	}
}