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










/*   ===============================   Requirements ===================================================


TDD PIG LATIN
TDD
Intro: Pig Latin is a children’s word game in English where starting consonants are flipped to the ends of words and -ay added to each word.  Hello World would be ellohay orldway in Pig Latin, for instance.  Many languages have games similar to this--read more at http://mentalfloss.com/article/50242/pig-latins-11-other-languages 

Task: Use TDD practices to build a function that translates from English to Pig Latin.

Build Specifications
Translation must all be done in a translate() method that takes a string parameter and returns the translated Pig Latin string.
The translation functionality must be developed with TDD using tests on the translate() method.
If desired, you may also create other helper functions and optionally test them.

Additional Build Specifications
Convert each word to lowercase before translating.
If a word starts with a vowel, just add “way” onto the ending.
If a word starts with a consonant, move all of the consonants that appear before the first vowel to the end of the word, then add “ay” to the end of the word.

Hints
Treat “y” as a consonant.
Start with the simplest cases and work up, for example…
words that start with vowels… write tests for several different starting vowels
words that start with vowels with capital letters are converted to lowercase
words that start with one consonant… write tests for the second letter being several different vowels
words that start with two consonants
words that start with more consonants

Extended Challenges
In a separate Class/file PigLatinPrompt.java, prompt the user for a word or phrase and then pass it into the translate method 
Allow punctuation in the input string.
Translate words with contractions. Ex: can't become an'tcay
Don’t translate words that have numbers or symbols. Ex: 189 should be left as 189 and hello@grandcircus.co should be left as hello@grandcircus.co.
Make the function take a phrase or sentence instead of a single word, and then find the Pig Latin for each word in the line.
Keep the case of the word, whether its uppercase (WORD), title case (Word), or lowercase (word).

Test Cases
Start with these sample test cases, then you must create more of your own (see Grading Criteria)
Words starting with different vowels
translate("apple") → "appleway"
translate("else") → "elseway"
Words starting with one consonant
translate("giraffe") → "iraffegay"

Remember: Never delete your old tests. Keep adding more and more.

Grading Criteria
At least five (5) tests for words starting with different vowels.
These tests are correct and pass.
At least two (2) tests for words starting with one consonant.
These tests are correct and pass.
At least one (1) test for words starting with two consonants.
These tests are correct and pass.
At least one (1) test for words starting with three consonants.
These tests are correct and pass.
At least one (1) test checking for lower case conversion.
These tests are correct and pass.

*/









