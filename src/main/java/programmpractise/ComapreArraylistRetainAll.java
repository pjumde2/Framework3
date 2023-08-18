package programmpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComapreArraylistRetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first arraylist  
		ArrayList<String> firstList=new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T"));  
		System.out.println("First arraylist: ");  
		System.out.println(firstList);  
		//second arraylist      
		List<String> secondList=new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));  
		System.out.println("Second arraylist: ");  
		System.out.println(secondList);  
		//returns the common elements in both list  
		secondList.retainAll(firstList);        
		System.out.println("Common elements in both list: ");  
		System.out.println(secondList);  
	}

}
