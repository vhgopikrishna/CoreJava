package CoreJava;

import java.util.Scanner;
public class EvenOddNumber
{

	public static void main(String args[])
	{

	 int num;
	 String res;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your number!");
	 num = sc.nextInt();
	 res = num%2==0?"Even":"Odd";
	 System.out.print("Given number is an "+ res + "number");
	
		
	}

}