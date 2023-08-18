package programmpractise;

import java.util.HashMap;

public class CharacterFrequencyEachLetter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aasdfggjk";
		
		HashMap<Character,Integer>map=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			Integer val=map.get(c);
			
			 if (val == null)
			{
				map.put(c, 1);
			}
			else
			
				map.put(c, new Integer(val+1));
					
		}
	
		
		

	}

}
