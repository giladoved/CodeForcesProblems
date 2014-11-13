//Gilad Oved
import java.util.Scanner;


public class Watermelon4A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//get the weight of the watermelon
		// this is the only input we get
		int weight = in.nextInt();
		
		//defining a string of either yes or no depending on if the method returns true or false
		String output = (isWatermelonEven(weight)) ? "YES" : "NO";
		//output the defined string of YES or NO
		System.out.println(output);
	}
	
	//a method that returns true if the watermelon can be divided into even pieces and false if it can't
	public static boolean isWatermelonEven(int w) {
		//If the watermelon can evenly be divided by 2 (it is even) and the watermelon weight is greater than 2 then return true
		if (w % 2 == 0 && w > 2) {
			return true;
		}
		
		//otherwise return false
		return false;
	}

}
