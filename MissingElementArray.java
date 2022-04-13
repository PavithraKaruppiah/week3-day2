package week3.day2;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8,11,12};

		// Sort the array	
		//Arrays.sort(arr);
		
		int count=0;
		
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length-1; i++) {
		// check if the iterator variable is not equal to the array values respectively
			if (arr[i] != i+count) {
				//arr[0] != 0+1
				//1==1
				// print the number
				System.out.println(i + count);
				count++;
				
			}
			
		}
	

	}

}
