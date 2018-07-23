// Created by Virginia Cordero
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		System.out.println("Welcome to the Pig Latin Translator");
		
		//This loop will ask the user to enter a word to translate to pig Latin
		do {			
			System.out.println("Please enter the word to translate: ");
			String wordToCheck = scanner.next(); 
			
			if (wordToCheck.length() == 0) {
				System.out.println("You need a full word, try harder.");
				break;
			}
			
			wordToCheck = wordToCheck.toLowerCase(); // Converting word to lower case! (build spec 1)
			
			boolean isFirstLetterAVowel = isFirstLetterAVowel(wordToCheck);
			
			if (isFirstLetterAVowel == true) {
				wordToCheck += "way";	
				System.out.println(wordToCheck);
			} else {
				int foundIndex = indexOfFirstVowel(wordToCheck);
				if (foundIndex > 0) {					
					String prefix = wordToCheck.substring(0, foundIndex); //To remove vowel at the beginning, locate first letter.
					String posix = wordToCheck.substring(foundIndex, wordToCheck.length());
					posix += prefix; // To print the word without the first
				    System.out.println(posix + "ay");
				} else {
					System.out.println("Word doesn't have vowels! OMG! Are you sure this is English?...");
				}
			}

//			Asking the user if she/he wishes to continue
			System.out.println("Would you like to translate another word? (y/n)");
			userInput = scanner.next();
		} while (userInput.equalsIgnoreCase("y"));
		
		scanner.close();
		System.out.println("Program ended");
	}
		
	public static boolean isFirstLetterAVowel(String wordToCheck) {	    	
		String vowels = "aeiouAEIOU";
		char firstLetter = wordToCheck.charAt(0);
		boolean result = vowels.contains(firstLetter + "");	   
		return result;
	}
	
	public static int indexOfFirstVowel(String wordToCheck) {
		int foundIndex = -1;
		for (int i = 0; i < wordToCheck.length(); i++) {
			String vowels = "aeiouAEIOU";
			char letter = wordToCheck.charAt(i);
			boolean result = vowels.contains(letter + "");
			if (result == true) {
				foundIndex = i;
				break;
			}
		}
		return foundIndex;
	}
}
