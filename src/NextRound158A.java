import java.util.ArrayList;
import java.util.Scanner;


public class NextRound158A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Scanner lineScanner = new Scanner(in.nextLine());
		int n = lineScanner.nextInt();
		int k = lineScanner.nextInt();
		int scores[] = new int[n];
		
		lineScanner = new Scanner(in.nextLine());
		for (int i = 0; i < n; i++) {
			scores[i] = lineScanner.nextInt();
		}
		
		System.out.println(getNumberOfNextRounds(n, k, scores));
	}

	public static int getNumberOfNextRounds(int n, int k, int[] scores)  {	
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (scores[i] >= scores[k-1] && scores[i] > 0) {
				count++;
			}
		}
		
		return count;
	}
	
}
