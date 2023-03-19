package CoreJava;

import java.util.Scanner;

public class Feb042023_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		int max=0;
		int sum=0;
		int i=0;

		System.out.println("Enter minimum number value");
		Scanner scmin = new Scanner(System.in);
		min = scmin.nextInt();
		
		System.out.println("Enter minimum number value");
		Scanner scmax = new Scanner(System.in);
		max = scmax.nextInt();
		
		for (i=min;i<=max;i++)
		{
			sum = sum+i;
		}
		System.out.println("Total sum is: "+sum);
	}

}
