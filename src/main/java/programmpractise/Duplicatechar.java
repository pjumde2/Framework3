package programmpractise;

public class Duplicatechar {

	public static void main(String[] args) {
		
		String str1="Automation is future of Tester";    
		
		String str =str1.toLowerCase();
		//String str="Automation is future of Tester";      
		int count=1;
		int total=0;
		
		char [] ch=str.toCharArray();
		
		for(int y=0;y<=ch.length-1;y++)
		{
			for(int z=y+1;z<=ch.length-1;z++)
			{
				if(ch[y]==ch[z])
				{
					
					ch[z]=' ';
					count++;
										
				}
			}
			if(ch[y]!=' ')
			{
				System.out.println(ch[y]+"------"+count);
				total=total+count;
			}
			count=1;
			
		
		}
		System.out.println("Total characters are: "+total);

	}

}
