package programmpractise;

public class CountingLetters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GeeKs 01 fOr @ gEEks 075";
		int upper=0, lower=0, number=0, special=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z')
				upper++;
			else if (ch>='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
				number++;
			else if(str.charAt(i)=='@')
				special++;
		}
		 System.out.println("Lower case letters : " + lower); 
	        System.out.println("Upper case letters : " + upper); 
	        System.out.println("total Number in string : " + number); 
	        System.out.println("Special characters : " + special); 
	        
	        String str1=str.replaceAll("\\s", "");
	        
	        System.out.println("Updated string is: "+str1);
	        

	}

}
