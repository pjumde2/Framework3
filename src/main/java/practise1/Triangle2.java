package practise1;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number: ");
		num=scan.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i+j)%2);
			}
			System.out.println();
		}

	}

}
