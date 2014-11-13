import java.util.Scanner;


public class StringTask118A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.println(getManiString(word));
	}

	private static String getManiString(String word) {
		String s = word.trim().replaceAll("[a,e,i,o,u,y,A,E,I,O,U,Y]", "");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append("." + s.charAt(i));
		}
		return sb.toString().toLowerCase();
	}

}
