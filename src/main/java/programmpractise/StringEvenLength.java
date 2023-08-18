package programmpractise;

public class StringEvenLength {
	
	Input: s = "This is a java language"
			Output: This
			        is
			        java
			        language 

			Input: s = "i am GFG"
			Output: am

			Approach:


			    Take the string
			    Break the string into words with the help of split() method in String class. It takes the string by which the sentence is to be broken. So here ” “(space) is passed as the parameter. As a result, the words of the string are split and returned as a string array

			    String[] words = str.split(" ");

			    Traverse each word in the string array returned with the help of Foreach loop in Java.

			    for(String word : words)
			    { }

			    Calculate the length of each word using String.length() function.

			    int lengthOfWord = word.length();

			    If the length is even, then print the word.

			Below is the implementation of the above approach:
			filter_none

			edit

			play_arrow

			brightness_4
			// Java program to print 
			// even length words in a string 
			  
			class GfG { 
			    public static void printWords(String s) 
			    { 
			  
			        // Splits Str into all possible tokens 
			        for (String word : s.split(" ")) 
			  
			            // if length is even 
			            if (word.length() % 2 == 0) 
			  
			                // Print the word 
			                System.out.println(word); 
			    } 
			  
			    // Driver Code 
			    public static void main(String[] args) 
			    { 
			  
			        String s = "i am Geeks for Geeks and a Geek"; 
			        printWords(s); 
			    } 
			} 
			Output:

			am
			Geek





}
