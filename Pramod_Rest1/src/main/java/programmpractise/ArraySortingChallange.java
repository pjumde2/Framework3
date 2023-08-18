package programmpractise;
import java.util.ArrayList;
import java.util.Collections;

public class ArraySortingChallange {

	public static void main(String[] args) {
		
		int array1[] = {-1,-6,45,5,25,-18};
		
		
		ArrayList<Integer> lower=new ArrayList<Integer>();
		
		ArrayList<Integer> greater=new ArrayList<Integer>();
		
		for (int counter:array1)
		{
			if(counter<0)
			{
				lower.add(counter);
			}
			else
			{
				greater.add(counter);
			}
		}
		System.out.println("===="+lower.toString());
		System.out.println("===="+greater.toString());
		
	//	Collections.sort(lower);
	//	System.out.println("===="+lower.toString());		
		
		Collections.sort(lower);
		System.out.println("===="+lower.toString());
		
		Collections.sort(greater, Collections.reverseOrder());
		
		lower.addAll(greater);
		System.out.println("The whole sorted list: "+lower.toString());
		
	      }

	}
