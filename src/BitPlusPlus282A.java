import java.util.Scanner;


public class BitPlusPlus282A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		int x = 0;
		for (int i = 0; i < n; i++) {
			if (in.nextLine().charAt(1) == '+')
				x++;
			else
				x--;
		}
		
		System.out.println("" + x);
	}

}
