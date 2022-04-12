package week3.day2;

import org.apache.poi.util.SystemOutLogger;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome
		
		String name ="Madam";
		String reverse ="";
		//Iterate over the String in reverse order
		for(int i=name.length()-1;i>=0;i--) {
			//Add the char into reverse
			System.out.print(name.charAt(i));
			reverse = reverse + (name.charAt(i));	
		}
		//Compare the original String with the reversed String, if it is same then print palinDrome 
		System.out.println(reverse);
		//boolean equal = name.equals(reverse);
		
		if(name.equals(reverse))
		{
		System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("not a Palindrome");
			}
		
		
		if(name.equalsIgnoreCase(reverse))
		{
			System.out.println("Palindrome");
			}
			else 
			{
				System.out.println("not a Palindrome");
				}
	}
		}


