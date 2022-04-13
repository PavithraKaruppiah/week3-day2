package week3.day2;

import java.util.Arrays;

public class FindSecLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7};

	//			 1) Arrange the array in ascending order
				Arrays.sort(data);
	//			 2) Pick the 2nd element from the last and print it
				int length = data.length;
				System.out.println(data[length-2]);
	}

}
