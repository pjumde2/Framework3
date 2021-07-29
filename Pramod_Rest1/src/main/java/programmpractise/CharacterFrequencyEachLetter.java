package programmpractise;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharacterFrequencyEachLetter {

	public static void main(String[] args) {
	
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "aasjjikkk";
		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    Integer val = map.get(c);
		    if (val != null) {
		        map.put(c, new Integer(val + 1));
		    }
		    else {
		       map.put(c, 1);
		   }
		    
		    
		    
		}
		
	/*	for (Character name: map.keySet()){
            String key = name.toString();
            String value = map.get(name).toString();  
            System.out.println(key + " " + value);  
} 
		*/
		
		for (Entry<Character, Integer> entry : map.entrySet()) 
		{
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());  
		}
			
		

	}

}

/*
 * The get() method of Map interface in Java is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. 
 * It returns NULL when the map contains no such mapping for the key.
 * */
