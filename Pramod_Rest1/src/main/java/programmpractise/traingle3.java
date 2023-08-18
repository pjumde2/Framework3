package programmpractise;

import java.util.Scanner;

public class traingle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		System.out.println("Please enter number: ");
		
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}

	}

}
