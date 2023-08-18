package stringProgramms;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        String a = "AVATAR";
		        String b = "avatar";

		        if(a.equals(b)){
		            System.out.println("Both strings are equal.");
		        } else {
		            System.out.println("Both strings are not equal.");
		        }

		        if(a.equalsIgnoreCase(b)){
		            System.out.println("Both strings are equal.");
		        } else {
		            System.out.println("Both strings are not equal.");
		        }
		    }
		

	}



Example 1: Compare two strings

public class CompareStrings {

    public static void main(String[] args) {

        String style = "Bold";
        String style2 = "Bold";

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

When you run the program, the output will be:

Equal

In the above program, we've two strings style and style2. We simply use equality operator (==) to compare the two strings, which compares the value Bold to Bold and prints Equal.
Example 2: Compare two strings using equals()

public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

When you run the program, the output will be:

Equal

In the above program, we have two strings style and style2 both containing the same world Bold.

However, we've used String constructor to create the strings. To compare these strings in Java, we need to use the equals() method of the string.

You should not use == (equality operator) to compare these strings because they compare the reference of the string, i.e. whether they are the same object or not.

On the other hand, equals() method compares whether the value of the strings are equal, and not the object itself.

If you instead change the program to use equality operator, you'll get Not Equal as shown in the program below.
Example 3: Compare two string objects using == (Doesn't work)

public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        if(style == style2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}

When you run the program, the output will be:

Not Equal

Example 4: Different ways to compare two strings

Here are the string comparison which are possible in Java.

public class CompareStrings {

    public static void main(String[] args) {

        String style = new String("Bold");
        String style2 = new String("Bold");

        boolean result = style.equals("Bold"); // true
        System.out.println(result);

        result = style2 == "Bold"; // false
        System.out.println(result);

        result = style == style2; // false
        System.out.println(result);

        result = "Bold" == "Bold"; // true
        System.out.println(result);
    }
}

When you run the program, the output will be:

true
false
false
true

