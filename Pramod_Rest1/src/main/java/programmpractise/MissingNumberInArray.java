package programmpractise;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,5};
		int sum1=0,sum2=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of array is: "+sum1);

		
		for(int j=1;j<=5;j++)
		{
			sum2=sum2+j;
		}
		
		System.out.println("Sum of order in array is: "+sum2);
		
		System.out.println("Missing number in Array is :"+(sum2-sum1));
	}

}
