//Gilad Oved
import java.util.Scanner;

public class TheatreSquare1A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read in all the parameters first
        long n = scanner.nextLong(); 
        long m = scanner.nextLong();
        long a = scanner.nextLong(); //the reason for using a long, is because the range of a is very large (so large an int won't work)
        
        //then output the result of the method which calculates the number of flag stones based on the parameters
        System.out.println(getNumberOfFlagStones(n, m, a));
    }
    
    public static long getNumberOfFlagStones(long n, long m, long a) {
    	//the trick is to divide the vertical length by 'a' separately
        long vert = n / a;
        if (n % a != 0) //if there is any sort of remainder, we need to round up so that we cover the required amount
            vert++;
        
        //same for the horizontal
        long hori = m / a;
        if (m % a != 0)
            hori++;
        
        //the result is just multiplying the modified quotient 
        return vert * hori;
    }

}
