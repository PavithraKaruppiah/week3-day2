package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String 
		String text1 = "stops";
	// Declare another String
		String text2 = "potss"; 
		
		//Check length of the strings are same then (Use A Condition)
		
		int a=text1.length();//5
		int b= text2.length();//5
		//5 =5 
		if(a==b) {
		System.out.println("same length");
		}
		else
		 {
		System.out.println("not same length");
	}
		
		//Convert both Strings in to characters
		
		char[] charArray = text1.toCharArray(); //stops
		char[] charArray2 = text2.toCharArray();//potss
		
		//sort Array
		Arrays.sort(charArray);//opsst
		Arrays.sort(charArray2);//opsst
		
		//Check both the arrays has same value
		
	 boolean result = Arrays.equals(charArray, charArray2);//opSst = opsst
		
		if(result==true) {
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not a Anagram");
		}
	}
	
	
	}


