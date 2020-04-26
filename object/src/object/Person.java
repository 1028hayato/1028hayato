package object;

//課題1,2

public class Person {
	//名前
	String name;
	//年齢
	int age;

	static int wallet;//課題2用のフィールド

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Person(){}

	public Person(int num){
		Person.wallet += num;
	}

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}