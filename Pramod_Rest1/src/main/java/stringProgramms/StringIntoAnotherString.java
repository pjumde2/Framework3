package stringProgramms;

public class StringIntoAnotherString {

	/*
	Input: originalString = "Computer Portal", 
            stringToBeInserted = "Science ", 
            index = 8
Output: "Computer Science Portal"

The various methods to do this are as follows:


  Without using any pre-defined method

  Approach:
      Get the Strings and the index.
      Create a new String
      Traverse the string till the specified index and copy this into the new String.
      Copy the String to be inserted into this new String
      Copy the remaining characters of the first string into the new String
      Return/Print the new String

  Below is the implementation of the above approach:

  Program:
  filter_none

  edit

  play_arrow

  brightness_4
  // Java program to insert a string into another string 
  // without using any pre-defined method 
   * 
   * 
   */
    
  import java.lang.*; 
    
  class GFG { 
    
      // Function to insert string 
      public static String insertString( 
          String originalString, 
          String stringToBeInserted, 
          int index) 
      { 
    
          // Create a new string 
          String newString = new String(); 
    
          for (int i = 0; i < originalString.length(); i++) { 
    
              // Insert the original string character 
              // into the new string 
              newString += originalString.charAt(i); 
    
              if (i == index) { 
    
                  // Insert the string to be inserted 
                  // into the new string 
                  newString += stringToBeInserted; 
              } 
          } 
    
          // return the modified String 
          return newString; 
      } 
    
      // Driver code 
      public static void main(String[] args) 
      { 
    
          // Get the Strings 
          String originalString = "GeeksGeeks"; 
          String stringToBeInserted = "For"; 
          int index = 4; 
    
          System.out.println("Original String: "
                             + originalString); 
          System.out.println("String to be inserted: "
                             + stringToBeInserted); 
          System.out.println("String to be inserted at index: "
                             + index); 
    
          // Insert the String 
          System.out.println("Modified String: "
                             + insertString(originalString, 
                                            stringToBeInserted, 
                                            index)); 
      } 
  } 
  Output:

  Original String: GeeksGeeks
  String to be inserted: For
  String to be inserted at index: 4
  Modified String: GeeksForGeeks

  Using String.substring() method

  Approach:
      Get the Strings and the index.
      Create a new String
      Insert the substring from 0 to the specified (index + 1) using substring(0, index+1) method. Then insert the string to be inserted into the string. Then insert the remaining part of the original string into the new string using substring(index+1) method.
      Return/Print the new String

  Below is the implementation of the above approach:

  Program:
  filter_none

  edit

  play_arrow

  brightness_4
  // Java program to insert a string into another string 
  // without using any pre-defined method 
    
  import java.lang.*; 
    
  class GFG { 
    
      // Function to insert string 
      public static String insertString( 
          String originalString, 
          String stringToBeInserted, 
          int index) 
      { 
    
          // Create a new string 
          String newString = originalString.substring(0, index + 1) 
                             + stringToBeInserted 
                             + originalString.substring(index + 1); 
    
          // return the modified String 
          return newString; 
      } 
    
      // Driver code 
      public static void main(String[] args) 
      { 
    
          // Get the Strings 
          String originalString = "GeeksGeeks"; 
          String stringToBeInserted = "For"; 
          int index = 4; 
    
          System.out.println("Original String: "
                             + originalString); 
          System.out.println("String to be inserted: "
                             + stringToBeInserted); 
          System.out.println("String to be inserted at index: "
                             + index); 
    
          // Insert the String 
          System.out.println("Modified String: "
                             + insertString(originalString, 
                                            stringToBeInserted, 
                                            index)); 
      } 
  } 
  Output:

  Original String: GeeksGeeks
  String to be inserted: For
  String to be inserted at index: 4
  Modified String: GeeksForGeeks

  Using StringBuffer.insert() method

  Approach:
      Get the Strings and the index.
      Create a new StringBuffer
      Insert the stringToBeInserted into the original string using StringBuffer.insert() method.
      Return/Print the String from the StringBuffer using StringBuffer.toString() method.

  Below is the implementation of the above approach:

  Program:
  filter_none

  edit

  play_arrow

  brightness_4
  // Java program to insert a string into another string 
  // without using any pre-defined method 
    
  import java.lang.*; 
    
  class GFG { 
    
      // Function to insert string 
      public static String insertString( 
          String originalString, 
          String stringToBeInserted, 
          int index) 
      { 
    
          // Create a new StringBuffer 
          StringBuffer newString 
              = new StringBuffer(originalString); 
    
          // Insert the strings to be inserted 
          // using insert() method 
          newString.insert(index + 1, stringToBeInserted); 
          newString.
    
          // return the modified String 
          return newString.toString(); 
      } 
    
      // Driver code 
      public static void main(String[] args) 
      { 
    
          // Get the Strings 
          String originalString = "GeeksGeeks"; 
          String stringToBeInserted = "For"; 
          int index = 4; 
    
          System.out.println("Original String: "
                             + originalString); 
          System.out.println("String to be inserted: "
                             + stringToBeInserted); 
          System.out.println("String to be inserted at index: "
                             + index); 
    
          // Insert the String 
          System.out.println("Modified String: "
                             + insertString(originalString, 
                                            stringToBeInserted, 
                                            index)); 
      } 
  } 
  Output:

  Original String: GeeksGeeks
  String to be inserted: For
  String to be inserted at index: 4
  Modified String: GeeksForGeeks





}
