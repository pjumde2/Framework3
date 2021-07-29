package stringProgramms;

public class MoveUppercasechar2 {

	public static void main(String[] args) {
	
		
		String s="Hellow World";
		
		MoveUppercasechar2 obj=new MoveUppercasechar2();
		String s4=obj.upper(s);
		System.out.println("Result is: "+s4);
		

	}

	private String upper(String s) {
		// TODO Auto-generated method stub
		
		String cap="";
		String low="";
		
		
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			
				cap=cap+ch;
			
			else
				low=low+ch;
			
			
		}
		
		String s3=low+cap;
		
		String s5=s3.replaceAll("\\s", "");
		return s5;
		
		
	}

}
