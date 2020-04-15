package method;

public class Task4 {
	public static void main(String args[]) {
		String[] array1 = {"a","b","c"};
		String[] array2 = {"a",null,"c"};

		System.out.println("---配列にnullがない場合---");
		boolean true_or_false = nullCheck(array1);
		System.out.println(true_or_false);

		System.out.println("---配列にnullがある場合---");
		boolean true_or_false2 = nullCheck(array2);
		System.out.println(true_or_false2);
	}
	static boolean nullCheck(String[] array) {
		boolean result = false;
		for(int i= 0;i < array.length;i++) {
			if(array[i] == null) {
				return true;
			}
		}
		return result;
	}
}