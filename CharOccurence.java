package week3.day2;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check number of occurrences of a char (eg 'e') in a String
		
			String str = "welcome to chennai";
					
		// declare and initialize a variable count to store the number of occurrences
					int count=0;
					
		// convert the string into char array
			 char[] charArray = str.toCharArray();
						
		//get the length of the array
			int length = charArray.length;
		
						
		// traverse from 0 till the array length 
			 for(int i=0;i<length;i++) {
		// Check the char array has the particular char in it 		 
				 if(charArray[i]=='e') {
		//increment 		 
					 count++;
				 }
			 }
			 
				 System.out.println("Count is  " + count);	 
			 }
					
}			


