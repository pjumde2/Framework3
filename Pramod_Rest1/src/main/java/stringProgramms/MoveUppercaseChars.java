package stringProgramms;


//java program to Move all Uppercase char to the end of string

public class MoveUppercaseChars {   

static String testcase1 = "Hello World";

public static void main(String args[]){
    MoveUppercaseChars testInstance = new MoveUppercaseChars();
    String result = testInstance.move(testcase1);
    System.out.println("Result : "+result);
}

public String move(String str){
    int len = str.length();
    String low = "";
    String cap = "";
    char ch;
    for(int i=0; i<len; i++)
    {
        ch = str.charAt(i);
        if(((int)ch >= 65) && ((int)ch <= 90))
        {
            cap  += ch;
        }   
        else {
            low += ch;
        }
    }
    return low + cap;
}   
}

/*
*******************************************************
public String move(String str){
    char ch;
    int len = str.length();
    // we initialize the buffers with the size so they won't have to be increased
    StringBuffer sbUpperCase = new StringBuffer(len+1);
    StringBuffer sbLowerCase = new StringBuffer(len+1);

    for(int i=0; i<len; i++)
    {
        ch = str.charAt(i);

        //if it is an upperCase letter (but only of the normal ones
        if(Character.isUpperCase(ch))
        {
            sbUpperCase.append(ch);
        }   else {
            sbLowerCase.append(ch);
        }        
    }
    return sbLowerCase.append(sbUpperCase).toString();
} 

*/


