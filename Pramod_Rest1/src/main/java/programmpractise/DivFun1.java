package programmpractise;

public class DivFun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DivFun1 div=new DivFun1();
		div.rem(17,5);
		

	}

	private void rem(int divident, int divisor) {
		// TODO Auto-generated method stub
		
		int count=0;
		int rem=0;
		
		while(divident>=divisor)
		{
			rem=divident-divisor;
			count++;
			divident=divident-divisor;
			
		}
		
		System.out.println("Divider is: "+count+" and reminder is: "+rem);
		
	}

}
