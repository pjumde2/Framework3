package stringProgramms;

public class StringEvenLength1 {
	

	public void main(String[] args) {
				
		String s="i am Geeks for Geeks and a Geek";
		StringEvenLength1 obj= new StringEvenLength1();
		
		obj.print(s);
		

	}

	private void print(String s) {
		
		for (String word : s.split(" ")) 
				
			if( word.length() %2==0)
				
				System.out.println(word);
				
					
		
	}

	

}
