package piglatin.tdd;

import java.util.Scanner;

public class PigLatin {

	
	static boolean isVowel(char ch) {   
		
		// if you don't want to convert incoming string to lowercase, use this return type:
		//  return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u');   
		
		// if you converted incoming string to lowercase, use this return type :
		return (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u');
	} 
	

	public static String translate (String userWordInput) {
		
		   
			// convert incoming string to lowercase
			String userInput = userWordInput.toLowerCase();
		
			//the index of the first vowel is stored   
			int stringlength=userInput.length();   
		
			int index=-1;   
			
			for (int i=0; i<stringlength; i++){   
				
				if (isVowel(userInput.charAt(i))){   
					index=i;   
					break;   
				}   
			}   
			
			//Pig Latin is possible only if vowels is present   
				if(index==-1) {   
					return "-1";   
				}	
		
		// Take all characters after index (including index). Append all characters which are before index. Finally append "ay"   
		 return userInput.substring(index) + userInput.substring(0, index) + "ay";   			  		
	}		
		


	
	//  Main method to test program using Scanner for user self test ---------
	public static void main(String[] args) {
		 			 
			Scanner scnr = new Scanner(System.in);	
			
			System.out.println("Please Enter word to convert to Pig Latin: ");
		
			String word = scnr.nextLine();
			
			System.out.println(translate(word));

			scnr.close(); 
		 }	
	
	
}


















/*		 

// If word starts with first two letters of consonants, then it adds them in the back and adds "way" behind it 
if ((incomingString.charAt(0) != 'a' || incomingString.charAt(0) != 'e' || incomingString.charAt(0) != 'i' || incomingString.charAt(0) != 'o' || incomingString.charAt(0) != 'u') && (incomingString.charAt(1) != 'a' || incomingString.charAt(1) != 'e' || incomingString.charAt(1) != 'i' || incomingString.charAt(1) != 'o' || incomingString.charAt(1) != 'u') ) {
				
	 String newString =  incomingString.substring(2);
		
 	 newString += "" + incomingString.charAt(0) + incomingString.charAt(1) ;
	 
	 String modifiedString = newString.concat("ay"); 
	 
	 System.out.println("The Pig Latin for word starting with first two letter of Consonants is :" + modifiedString);

	 return modifiedString;
	 
// if word starts with one consonant, then it adds in the back and adds "way" behind it	 
} else if (incomingString.charAt(0) != 'a' || incomingString.charAt(0) != 'e' || incomingString.charAt(0) != 'i' || incomingString.charAt(0) != 'o' || incomingString.charAt(0) != 'u')  {
	 
	 String newString =  incomingString.substring(1);
			 			
 	 newString += "" + incomingString.charAt(0);
	 
	 String modifiedString = newString.concat("ay"); 
	 
	 System.out.println("The Pig Latin for word starting with first letter as a consonant is :" + modifiedString);

	 return modifiedString;
	 
} 
   //  If a word starts with a vowel, just add “ay” onto the ending.
	else {
	
	 String modifiedString =  incomingString.concat("ay");
	 
	 System.out.println("The Pig Latin for word starting with vowel is :" + modifiedString);
	
	 return modifiedString; 			 
}

}

*/	










