package practise1;

public class CountingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "#GeeKs 01 fOr @ gEEks 07";
		int lower=0,upper=0,num=0,special=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch >='a' && ch <= 'z')
				lower++;
			else 
				if(ch>='A' && ch<= 'Z')
					upper++;
				else if(ch>='0' && ch<= '9')
					num++;
					else if(ch=='@')
						special++;
				
		}
		System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("total Number in string : " + num); 
        System.out.println("Special characters : " + special);

        String str1= str.replaceAll("\\s", "");
        System.out.println("String is:" +str1 );
        
        
	}
	
	

}
