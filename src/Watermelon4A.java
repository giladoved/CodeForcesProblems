import java.util.Scanner;


public class Watermelon4A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int weight = in.nextInt();
		
		String output = (isWatermelonEven(weight)) ? "YES" : "NO";
		System.out.println(output);
	}
	
	public static boolean isWatermelonEven(int w) {
		if (w < 3)
			return false;
		
		if (w % 2 == 0)
			return true;

		return false;
	}

}
