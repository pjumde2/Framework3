
Convert a String to Character array in Java

Given a string, the task is to convert this string into a character array in Java.

Examples:


Input:  Hello World
Output:  [H, e, l, l, o,, W, o, r, l, d]

Input:  GeeksForGeeks
Output:  [G, e, e, k, s, F, o, r, G, e, e, k, s]

    Method 1: Naive Approach

        Step 1: Get the string.
        Step 2: Create a character array of the same length as of string.
        Step 3: Traverse over the string to copy character at the i’th index of string to i’th index in the array.
        Step 4: Return or perform the operation on the character array.

    Below is the implementation of the above approach:
    filter_none

    edit

    play_arrow

    brightness_4
    // Java program to Convert a String 
    // to a Character array using Naive Approach 
      
    import java.util.*; 
      
    public class GFG { 
      
        public static void main(String args[]) 
        { 
            String str = "GeeksForGeeks"; 
      
            // Creating array of string length 
            char[] ch = new char[str.length()]; 
      
            // Copy character by character into array 
            for (int i = 0; i < str.length(); i++) { 
                ch[i] = str.charAt(i); 
            } 
      
            // Printing content of array 
            for (char c : ch) { 
                System.out.println(c); 
            } 
        } 
    } 
    Output:

    G
    e
    e
    k
    s
    F
    o
    r
    G
    e
    e
    k
    s

    Method 2: Using toCharArray() Method
        Step 1:Get the string.
        Step 2:Create a character array of same length as of string.
        Step 3:Store the array return by toCharArray() method.
        Step 4:Return or perform operation on character array.
    filter_none

    edit

    play_arrow

    brightness_4
    // Java program to Convert a String 
    // to a Character array using toCharArray() 
      
    import java.util.*; 
      
    public class GFG { 
      
        public static void main(String args[]) 
        { 
      
            String str = "GeeksForGeeks"; 
      
            // Creating array and Storing the array 
            // returned by toCharArray() 
            char[] ch = str.toCharArray(); 
      
            // Printing array 
            for (char c : ch) { 
                System.out.println(c); 
            } 
        } 
    } 
    Output:

    G
    e
    e
    k
    s
    F
    o
    r
    G
    e
    e
    k
    s

