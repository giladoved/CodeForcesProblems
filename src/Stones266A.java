import java.util.Scanner;


public class Stones266A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.nextLine());
		char[] stones = new char[n];
		stones = in.nextLine().toCharArray();
		int currentSeq = 0;
		char last = stones[0];
		for (int i = 1; i < n; i++) {
			if (stones[i] == last) {
				//System.out.println("i : " + i + " - " + stones[i] + " is " + last);
				currentSeq++;
			}
			last = stones[i];
		}
		System.out.println("" + currentSeq);
	}

}
