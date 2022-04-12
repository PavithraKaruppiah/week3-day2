package week3.day2;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseEvenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		 
		// * Declare the input as Follow
	      		String test = "I am a software tester"; 
//		a) split the words and have it in an array
	      		String[] split = test.split(" ");
	      		//Arrays.sort(split);
	      		
	      		//declare two empty string 
	      	
	      		String temp ="";
//		b) Traverse through each word (using loop)
	      		//i=0 because array strt with 0
	      		//even Position is 3 5 7  9
	      		for (int i = 0; i < split.length; i++) {
	      			String reverse ="";
	      //	c) find the odd index within the loop (use mod operator)	
	      			if(i%2==1) {
	      				// split that to character array inorder to reverse it
	      				char[] charArray = split[i].toCharArray();
	      			//use loop to reverse it
	      				for (int j = charArray.length-1; j>=0; j--) {
	      					//add each char in reverse string
	      				reverse = reverse +charArray[j];
							
						}
	      				//after the above iteration add reverse string to temp string
	      				
	      				temp = temp + reverse +" ";
	      			}else {
	      				
	      				temp=temp +split[i]+" ";
	      			}
				}
	      		   		
	      			System.out.println(temp);

	}

}
