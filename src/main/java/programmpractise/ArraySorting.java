package programmpractise;
import java.util.Arrays;


public class ArraySorting {

	public static void main(String[] args) {
		
		int num[] = {5, -3, -9, -18, 1, 2};

	    int temp = 0;
	    boolean finished = false;

	    do{
	        finished = true; // This will stay true if nothing needs to be changed in your array.
	        for (int i = 0 ; i < num.length - 1 ; i++){
	            if (num[i] > num[i+1]){
	                finished = false; // Can not go off the loop if it is not sorted yet.
	                temp = num[i]; // Interchanging of array's indexes
	                num[i] = num[i+1];
	                num[i+1] = temp;
	            }
	        }
	    } while(!finished);

	    System.out.println(Arrays.toString(num));
		
	  }
	}

