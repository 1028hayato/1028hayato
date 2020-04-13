package vrietyArray;

import java.util.ArrayList;

public class Task2 {
	public static void main(String args[] ) {
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers2 = new ArrayList<>();
		int [] num = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				numbers.add(num[i]);
			}else{
				numbers2.add(num[i]);
			}
		}
		System.out.println("奇数:" + " " + numbers2);
		System.out.print("偶数:" + " " + numbers);
	}
}