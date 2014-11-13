import java.util.Scanner;


public class Team231A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int problems = Integer.valueOf(in.nextLine());
		int answer = 0;
		int count = 0;
		for (int i = 0; i < problems; i++) {
			count = 0;
			for (int j = 0; j < 3; j++) {
				count += in.nextInt();
			}
			if (count >= 2)
				answer++;
		}
		
		System.out.println("" + answer);
	}

}
