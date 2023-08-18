package stringProgramms;

public class MoveUppercasechar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hellow World";
		
		MoveUppercasechar3 obj= new MoveUppercasechar3();
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
			if(ch>='A'  && ch<='Z')
				cap=cap+ch;
			else
				low=low+ch;
			
		}
		
		String s2=low+cap;
		String s3=s2.replaceAll("\\s", "");
		
		return s3;
		
		
		
		
	}

}
