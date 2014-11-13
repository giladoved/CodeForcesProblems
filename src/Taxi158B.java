import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Taxi158B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int groups = Integer.valueOf(in.nextLine());
		int[] numbers = new int[groups];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		Arrays.sort(numbers);
		
		int[] descendingNums = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			descendingNums[i] = numbers[numbers.length - i - 1];
		}
		
		int start = 0;
		int end = descendingNums.length - 1;
		int taxis = 0;
		while (start <= end) {
			int four = 4 - descendingNums[start];
			while (end >= 0 && descendingNums[end] <= four && end >= start)  {
				four -= descendingNums[end];
				end--;
			}
			start++;
			taxis++;
		}
		
		System.out.println("" + taxis);
	}

}
