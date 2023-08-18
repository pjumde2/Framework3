package stringProgramms;

public class MoveUppercaseChar1 {
	
static String s="Hellow World";
	

 public static void main(String[] args) {
		
		
	MoveUppercaseChar1 obj=new MoveUppercaseChar1();
	String Result=obj.upper(s);
	
	System.out.println("Result is:"+Result);

	}


	private String upper(String s2) {
		
		String cap="";
		String lower="";
			char ch;
			
		for(int i=0;i<=s2.length()-1;i++)
		{
			ch=s2.charAt(i);
			if(ch>=65 && ch<=90)
			
				cap=cap+ch;
			else
				lower=lower+ch;
					
		}
			
		String s4= lower+cap;
		
		String s5=s4.replaceAll("\\s", "");
		
		return s5;
	}

}
