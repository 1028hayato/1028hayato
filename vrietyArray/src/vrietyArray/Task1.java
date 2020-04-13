package vrietyArray;

import java.util.ArrayList;

public class Task1 {
	public static void main(String args[]) {
		ArrayList<String> state = new ArrayList<>();
		state.add("北海道");
		state.add("東北");
		state.add("関東");
		state.add("中部");
		state.add("近畿");
		state.add("中国");
		state.add("九州");

		for(String statename : state) {
			System.out.println(statename);
		}
	}
}