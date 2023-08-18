package programmpractise;

public class CountingLetters {

	public static void main(String[] args) {
		
		
		String str = "#GeeKs 01 fOr @ gEEks 07"; 
        int upper = 0, lower = 0, number = 0, special = 0; 
  
        for(int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else if(str.charAt(i)=='@' || str.charAt(i)=='#')    
            	//  Its boolean OR operator ||
            	
                special++; 
        } 
  
        System.out.println("Lower case letters : " + lower); 
        System.out.println("Upper case letters : " + upper); 
        System.out.println("total Number in string : " + number); 
        System.out.println("Special characters : " + special); 
        
      String str1= str.replaceAll("\\s", "");
        //  \\s - means single whitespace character 
        //   \\s+ - matches sequence of one or more whitespace characters.
        System.out.println("String with Removed spaces: "+str1);

	}

}
