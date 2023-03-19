package CoreJava;

import java.util.Scanner;

public class Feb042023_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min=0;
		int max=0;
		int oddcount=0;
		int eventcount=0;
		int totalcount=0;
		int i=0;
		
		System.out.println("Enter min range value");
		Scanner scmin = new Scanner(System.in);
		min = scmin.nextInt();
		
		System.out.println("Enter max range value");
		Scanner scmax = new Scanner(System.in);
		max = scmax.nextInt();
		
		for (i=min;i<=max;i++)
		{
			if (i%2==0)
			{
				eventcount++;
			}
			else
			{
			oddcount++;	
			}
			totalcount++;
		}
		System.out.println("Even number count of given range is: "+eventcount);
		System.out.println("Odd number count of given range is: "+oddcount);
		System.out.println("Total number count of given range is: "+totalcount);
	}

}
