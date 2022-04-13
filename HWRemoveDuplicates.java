package week3.day2;

public class HWRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
// b) Initialize an integer variable as count	
	int count =0;
 // c) Split the String into array and iterate over it 
	String[] split = text.split(" ");
// * d) Initialize another loop to check whether the word is there in the array
	for (int i = 0; i < split.length; i++) {
		// * e) if it is available then increase and count by 1. 
		// * f) if the count > 1 then replace the word as "" 
		for (int j = i+1; j < split.length; j++) {
			if (split[i].equals(split[j])) {
				split[j] ="";
			}
		}}
// g) Displaying the String without duplicate words	
	for (int i = 0; i < split.length; i++) {
		System.out.print(split[i] +" ");
		
	}

	}}


