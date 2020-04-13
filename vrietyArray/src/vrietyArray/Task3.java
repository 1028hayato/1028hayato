package vrietyArray;

import java.util.HashMap;

public class Task3 {
	public static void main(String args[]) {
		HashMap<String,Integer> fruitcost = new HashMap<>();
		fruitcost.put("りんご",130);
		fruitcost.put("メロン",6000);
		fruitcost.put("みかん",120);
		fruitcost.put("バナナ",98);
		for(HashMap.Entry<String,Integer> fruit : fruitcost.entrySet()) {
			System.out.println(fruit.getKey() + ":" + fruit.getValue() +"円");
		}
	}
}