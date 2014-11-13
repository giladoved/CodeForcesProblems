import java.util.Scanner;


public class WayTooLongWords71A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = Integer.parseInt(in.nextLine());
		String words[] = new String[count];
		
		for (int i = 0; i < words.length; i++) {
			words[i] = in.nextLine();
		}
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(getAbbreviation(words[i]));
		}
	}

	private static String getAbbreviation(String word) {
		if (word.length() <= 10)
			return word;
		return Character.toString(word.charAt(0)).toString() + (word.length() - 2) + word.charAt(word.length() - 1);
	}

}
