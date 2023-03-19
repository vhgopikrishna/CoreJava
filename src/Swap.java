package CoreJava;

import java.util.Scanner;
public class Swap
{

	public static void main(String args[])
	{

		int a;
		int b;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Second Number");
		b = sc2.nextInt();

		a = a+b;
		b = a>b?a-b:b-a;
		a = a>b?a-b:b-a;
		System.out.println("After Swapping...");
		System.out.println("First Number Value is "+ a);
		System.out.println("Second Number Value is "+ b);

		

		
		

	}	

}