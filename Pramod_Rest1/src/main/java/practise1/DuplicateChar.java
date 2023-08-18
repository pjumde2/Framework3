package practise1;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Automation is future of Tester";
		
		String str1=str.toLowerCase();
		
		char [] ch =str1.toCharArray();
		int count=1, total=0;
		
		for(int i=0;i<=ch.length-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
				   count++;
				}
				
			}
			if(ch[i]!=' ')
			{
				System.out.println(ch[i]+"-----"+count);
				total=total+count;
			}
			count=1;
		
		}
		

	System.out.println("Total car are: "+total);
	}
}

