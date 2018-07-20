// Created by Virginia Cordero
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		
		//This loop will ask the user to enter a word to translate to pig Latin
		do {
			System.out.println("Welcome to the Pig Latin Translator");
			System.out.println("Please enter the word to translate: ");
			String wordToTranslate = scanner.next(); 
			wordToTranslate = wordToTranslate.toLowerCase(); // Converting word to lower case! (build spec 1)
			
		    // Call method to find out if firstLetter is a vowel, if so add "way" at the end
			
			String wordToCheck = hasVowel(wordToTranslate);
		    System.out.println(wordToTranslate + "way");
		     
		    // Call method to find out if it is consonant, if so 
		    // find position of vowel
		    // print substring after vowel position
		    // move consonants before first vowel to the end 
		    // add "ay" to the end
		     
			String firstLetter = wordToTranslate.substring(0,1); //To remove vowel at the beginning, locate first letter.
		    String restOfTheWord = wordToTranslate.substring(1); // To print the word without the first
		    System.out.println(restOfTheWord + firstLetter + "way");
			
			//Asking the user if she/he wishes to continue
			System.out.println("Would you like to translate another word? (y/n)");
			userInput = scanner.next();
		} while (userInput.equalsIgnoreCase("y"));

	}
	
	
	String vowels = "aeiouAEIOU";
	if (vowels.indexOf(
			Character.toLowerCase(
					testString.charAt(0))) != -1) {
		
	}

	private static String hasVowel(wordToCheck) {
	    	String vowels = "aeiouAEIOU";
	    	if (wordToCheck.contains("a")
	    			{
	    	return vowels;
	    }
	    	  String s1 = "My name is GFG";
	    	  
	          // prints true
	          System.out.println(s1.contains("GFG"));
	   return
	    }
	    
}
