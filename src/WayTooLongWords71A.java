import java.util.Scanner;


public class WayTooLongWords71A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = Integer.parseInt(in.nextLine());
		String words[] = new String[count]; //the list of words to check
		
		//load the list of words
		for (int i = 0; i < words.length; i++) {
			words[i] = in.nextLine();
		}
		
		//for each word in the list, output the result of the method abbreviation
		for (int i = 0; i < words.length; i++) {
			System.out.println(getAbbreviation(words[i]));
		}
	}

	//calculate and return the abbreviation based on the rules
	private static String getAbbreviation(String word) {
		if (word.length() <= 10) //if the word is not strictly greater than 10, there is no abbreviation, it is the whole word so return the word.
			return word;
		
		//the result is the first character plus length of the word minus the first and last letter (which is 2) plus the last letter
		return Character.toString(word.charAt(0)).toString() + (word.length() - 2) + word.charAt(word.length() - 1);
	}

}
