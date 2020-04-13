package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;


public class Task4 {
	public static void main(String args[] ) {
		ArrayList<Integer> numbers = new ArrayList<>();
		HashMap<Integer,ArrayList<Integer>> even = new HashMap<>();
		even.put(1,numbers);
		ArrayList<Integer> numbers2 = new ArrayList<>();
		HashMap<Integer,ArrayList<Integer>> odd = new HashMap<>();
		odd.put(2,numbers2);
		int [] num = {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				numbers.add(num[i]);
			}else{
				numbers2.add(num[i]);
			}
		}
		System.out.println("{" + "偶数" + " " + "=" + even.get(1));
		System.out.println("奇数" + " " + "=" + odd.get(2) + "}");
	}
}