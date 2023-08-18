package practise1;

public class CountingLetters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "#GeeKs 01 fOr @ & gEEks 07";
		int lower=0,upper=0,num=0,special=0;
		
		String str1=str.replaceAll("\\s", "");
		System.out.println(" New string is:" +str1);
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			char ch=str1.charAt(i);
			if(ch>='a'&& ch<='z')
				lower++;
			else
				
			if(ch>='A'&& ch<='Z')
				upper++;
			else
				
			if(ch>='0'&&ch<='9')
				num++;
			else
				special++;
					
			}
		System.out.println("Lower case letters :" +lower);
		System.out.println("Upper case Letters: " +upper);
		System.out.println("Numbers are :" +num);
		System.out.println("Special char are: " +special);
		
		
		}

}
