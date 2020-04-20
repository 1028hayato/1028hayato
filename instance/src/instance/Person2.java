package instance;

//Task1のでPersonクラスがすでにある為、Person2にしています
public class Person2 {
	//名前
	String name;
	//年齢
	int age;

	public  void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}