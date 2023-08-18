package practise1;

public class ReversString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverse="";
		String org="The world is round";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			reverse=reverse+org.charAt(i);
		}
		
		System.out.println("Reverse string: "+reverse);

	}

}
