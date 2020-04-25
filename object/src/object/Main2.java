package object;

//課題5

public class Main2 {
	public static void main(String[]args) {
		Dog dog = new Dog("ポチ", 5, 12.3);
		Animal animal = new Animal();

		System.out.println("名前:" + dog.name);
		System.out.println("年齢:" + dog.age + "歳");
		System.out.println("体重:" + dog.weight);
		dog.run();
		animal.Sleep();
		dog.Sleep();
	}
}