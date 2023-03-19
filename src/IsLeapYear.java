package CoreJava;

import java.util.Scanner;
public class IsLeapYear
{
	public static void main(String args[])
	{
	int year;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Year");
	year = sc.nextInt();
	if (year%400==0 && (year%4==0 && year%100 != 0))
	{
	 System.out.println("It's a Leap Year!");
	}
	else
	{
	 System.out.println("It's not a Leap Year!");
	}
	}
	

}