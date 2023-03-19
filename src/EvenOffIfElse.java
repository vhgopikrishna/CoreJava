package CoreJava;

import java.util.Scanner;
public class EvenOffIfElse
{

	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number!");
		num = sc.nextInt();
		if (num%2==0)
		{
			System.out.print("This is an Even Number");	
		}
		else
		{
			System.out.print("This is an Odd Number");
		}

	}

}
