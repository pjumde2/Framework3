package stringProgramms;

public class StringLengthWithoutLenghtMethod {

	public static void main(String[] args) {
		
		
		String str = "sampleString";
	      int count = 0;
	    /*  for(char c: str.toCharArray()) {
	         count++;
	      }*/
	      
	      for (int i = 0; i < str.length(); i++) 
	        { 
	            count++; 
	        } 

	      System.out.println("Length of the given string ::"+count);

	}

}
