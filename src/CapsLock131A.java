import java.util.Scanner;


public class CapsLock131A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		String originalWord = word;
		
		if (word.substring(1).equals(word.substring(1).toUpperCase())) {
			if (Character.isLowerCase(originalWord.charAt(0))) {
				System.out.println(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
			} else {
				System.out.println(word.substring(0,1).toLowerCase() + word.substring(1).toLowerCase());
			}
		}
		else {
			System.out.println(originalWord);
		}
	}

}
