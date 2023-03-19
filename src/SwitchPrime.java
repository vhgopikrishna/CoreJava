package CoreJava;

import java.util.Scanner;
public class SwitchPrime
{

	public static void main(String args[])
	{

		int a;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		switch (a)
		{
		case 1: System.out.print("Neither prime nor composite"); break;
		case 2: System.out.print("Given number is prime"); break;
		case 4: System.out.print("Given number is composite"); break;
		default: System.out.print("Others"); break;
		}	

	}

}