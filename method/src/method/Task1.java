package method;

public class Task1 {
	public static void main(String args[]) {

		myProfile("コラボ",30,178.0); //引数の受け渡し

		System.out.println("よろしくお願いします。");
	}
	static void myProfile(String name,int age, double height) {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
	}
}