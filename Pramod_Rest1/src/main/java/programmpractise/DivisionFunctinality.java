package programmpractise;

public class DivisionFunctinality {

	public static void main(String[] args) {
		
		DivisionFunctinality div=new DivisionFunctinality();
		
		div.getReminder(17,5);
	}


	
	private void getReminder(int dividend, int diviser) {
		
		int count=0;
		int reminder=0;
		
		while(dividend>=diviser)
		{
			reminder=dividend-diviser;
			count++;
			dividend=dividend-diviser;
		}
		
		System.out.println("Divider is: "+count+" and reminder is: "+reminder);
		
	}

}
