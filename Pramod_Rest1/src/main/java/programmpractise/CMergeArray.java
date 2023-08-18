package programmpractise;

import java.util.Arrays;

public class CMergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		     public static void arraycopy(Object source, int source_position,   
    Object destination, int destination_position, int length)  
    
    
    source: It is a source array.
    source_position: Starting point in the source array.
    destination: It is a destination array.
    destination_position: Starting position in the destination array.
    length: The number of array elements to be copied

		 */
		
		int[] firstArray = {23,45,12,78,4,90,1};        //source array  
		int[] secondArray = {77,11,45,88,32,56,3};  //destination array  
		int fal = firstArray.length;        //determines length of firstArray  
		int sal = secondArray.length;   //determines length of secondArray  
		int[] result = new int[fal + sal];  //resultant array of size first array and second array  
		System.arraycopy(firstArray, 0, result, 0, fal);  
		System.arraycopy(secondArray, 0, result, fal, sal);  
		System.out.println(Arrays.toString(result));    //prints the resultant array  

	}

}
