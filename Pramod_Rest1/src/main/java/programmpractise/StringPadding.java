package programmpractise;

public class StringPadding {

	
	
    Input: str = “Geeksforgeeks”, ch =’-‘, L = 20
    Output:
    Left Padding: ————GeeksForGeeks
    Center Padding: ——GeeksForGeeks——
    Right Padding: GeeksForGeeks————

    Input: str = “GfG”, ch =’#’, L = 5
    Output:
    Left Padding: ##GfG
    Center Padding: #GfG#
    Right Padding: GfG## 

Recommended: Please try your approach on {IDE} first, before moving on to the solution.

There are many methods to pad a String:

    Using String format() method: This method is used to return a formatted string using the given locale, specified format string and arguments.

    Note: This method can be used to do only left and right padding.

    Approach:
        Get the string in which padding is done.
        Use the String.format() method to pad the string with spaces on left and right, and then replace these spaces with the given character using String.replace() method.
        For left padding, the syntax to use the String.format() method is:

        String.format("%[L]s", str).replace(' ', ch);

        For right padding, the syntax to use the String.format() method is:

        String.format("%-[L]s", str).replace(' ', ch);

        If the length ‘L’ is less than initial length of the string, then the same string is returned unaltered.

    Below is the implementation of the above approach:

    Example:
    filter_none

    edit

    play_arrow

    brightness_4
    // Java implementation to pad a String 
      
    import java.lang.*; 
    import java.io.*; 
      
    public class GFG { 
      
        // Function to perform left padding 
        public static String 
        leftPadding(String input, char ch, int L) 
        { 
      
            String result 
                = String 
      
                      // First left pad the string 
                      // with space up to length L 
                      .format("%" + L + "s", input) 
      
                      // Then replace all the spaces 
                      // with the given character ch 
                      .replace(' ', ch); 
      
            // Return the resultant string 
            return result; 
        } 
      
        // Function to perform right padding 
        public static String 
        rightPadding(String input, char ch, int L) 
        { 
      
            String result 
                = String 
      
                      // First right pad the string 
                      // with space up to length L 
                      .format("%" + (-L) + "s", input) 
      
                      // Then replace all the spaces 
                      // with the given character ch 
                      .replace(' ', ch); 
      
            // Return the resultant string 
            return result; 
        } 
      
        // Driver code 
        public static void main(String[] args) 
        { 
      
            String str = "GeeksForGeeks"; 
            char ch = '-'; 
            int L = 20; 
      
            System.out.println( 
                leftPadding(str, ch, L)); 
            System.out.println( 
                rightPadding(str, ch, L)); 
        } 
    } 
    Output:

    -------GeeksForGeeks
    GeeksForGeeks-------

    Using Apache Common Lang: Apache Commons Lang package programmpractise the StringUtils class, which contains the leftPad(), center() and rightPad() method to easily left pad, center pad and right pad a String respectively.

    Note: This module has to be installed before running of the code. Hence this code won’t run on Online compilers.

    Approach:
        Get the string in which padding is done.
        For left padding, the syntax to use the StringUtils.leftPad() method is:

        StringUtils.leftPad(str, L, ch);

        For center padding, the syntax to use the StringUtils.center() method is:

        StringUtils.center(str, L, ch);

        For right padding, the syntax to use the StringUtils.rightPad() method is:

        StringUtils.rightPad(str, L, ch);

        If the length ‘L’ is less than initial length of the string, then the same string is returned unaltered.

    Below is the implementation of the above approach:

    Example:
    filter_none

    brightness_4
    // Java implementation to pad a String 
      
    import java.lang.*; 
    import java.io.*; 
      
    public class GFG { 
      
        // Function to perform left padding 
        public static String 
        leftPadding(String input, char ch, int L) 
        { 
      
            // Left pad the string 
            String result 
                = StringUtils.leftPad(str, L, ch); 
      
            // Return the resultant string 
            return result; 
        } 
      
        // Function to perform center padding 
        public static String 
        centerPadding(String input, char ch, int L) 
        { 
      
            // Center pad the string 
            String result 
                = StringUtils.center(str, L, ch); 
      
            // Return the resultant string 
            return result; 
        } 
      
        // Function to perform right padding 
        public static String 
        rightPadding(String input, char ch, int L) 
        { 
      
            // Right pad the string 
            String result 
                = StringUtils.rightPad(str, L, ch); 
      
            // Return the resultant string 
            return result; 
        } 
      
        // Driver code 
        public static void main(String[] args) 
        { 
      
            String str = "GeeksForGeeks"; 
            char ch = '-'; 
            int L = 20; 
      
            System.out.println( 
                leftPadding(str, ch, L)); 
            System.out.println( 
                centerPadding(str, ch, L)); 
            System.out.println( 
                rightPadding(str, ch, L)); 
        } 
    } 
    Output:

    -------GeeksForGeeks
    ---GeeksForGeeks----
    GeeksForGeeks-------




}
