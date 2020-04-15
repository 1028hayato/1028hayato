package method;

public class Task1 {
	public static void main(String args[]) {

		myProfile("コラボ");
		myProfile(30);
		myProfile(178.0);

		System.out.println("よろしくお願いします。");
	}
	static void myProfile(String name) {
		System.out.println("私の名前は" + name + "です。");
	}
	static void myProfile(int age) {
		System.out.println("年齢は" + age + "歳です。");
	}
	static void myProfile(double height) {
		System.out.println("身長は" + height + "cmです。");
	}
}