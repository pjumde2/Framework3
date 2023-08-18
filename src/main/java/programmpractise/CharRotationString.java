package programmpractise;

public class CharRotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abcd";  
        String str2 = "bcda";  
        
       if(str1.length()!=str2.length())
       {
    	   System.out.println("Strings are not rotational");
       }
       else
       {
    	 String  str3=str1+str1;
    	 
    	 if(str3.contains(str2))
    		 System.out.println("Strings are rotational");
    	 else
    		 System.out.println("Strings are not rotational");
    	   
       }

	}

}
