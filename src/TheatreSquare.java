import java.util.Scanner;


public class TheatreSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		double squareWidth = a.nextInt();
		double squareHeight = a.nextInt();
		double tileWidth = a.nextInt();
		double width = Math.ceil(squareWidth/tileWidth);
		double height = (int) Math.ceil(squareHeight/tileWidth);
		System.out.println((long)(width*height));
	}

}
