package loop;

public class Task5 {
	public static void main(String args[]) {
		for(int x = 1; x <= 9; x++) {
			for(int y =1; y <= 9; y++) {
				int z = x * y;
				System.out.print(" ");
				if(10 > z) {
					System.out.print(" ");
				}
				System.out.print(z);
			}
			System.out.println();
		}
	}
}