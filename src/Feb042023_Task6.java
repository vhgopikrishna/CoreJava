package CoreJava;

import java.util.Scanner;

public class Feb042023_Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nmbr;
		int fact=1;
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		nmbr = sc.nextInt();
		for(int i= nmbr;i>0;i--)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+nmbr+": "+fact);

	}

}
