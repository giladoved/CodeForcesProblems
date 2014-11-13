import java.util.Scanner;


public class Tram116A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		int maxCapacity = 0;
		int capacity = 0;
		
		for (int i = 0; i < n; i++) {
			capacity -= in.nextInt();
			capacity += in.nextInt();
			maxCapacity = Math.max(maxCapacity, capacity);
		}
		
		System.out.println("" + maxCapacity);
	}

}
