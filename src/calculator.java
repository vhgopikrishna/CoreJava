package CoreJava;

import java.util.Scanner;
public class calculator
{

	public static void main(String args[])
	{

	  int a;
	  int b;
	  int opr;
	  int res = 0;
        System.out.print("****************************************");
	  System.out.print("\n");
        System.out.print("************Select Operation************");
	  System.out.print("\n");
        System.out.print("*          1. Addition                 *");
	  System.out.print("\n");
	  System.out.print("*          2. Substraction             *");
	  System.out.print("\n");
	  System.out.print("*          3. Multiplication           *");
	  System.out.print("\n");
	  System.out.print("*          4. Division                 *");
	  System.out.print("\n");
        System.out.print("****************************************");
	  System.out.print("\n");
	  Scanner sca = new Scanner(System.in);
	  Scanner scb = new Scanner(System.in);
	  Scanner sco = new Scanner(System.in);
	  
	  System.out.println("Select number based on operation list above..");
	  opr = sco.nextInt();

	  if (opr < 1 || opr > 4)
	 {
	  System.out.print("Invalid Option!");
	  return;
	 }	  

	  System.out.println("Enter first number");
	  a = sca.nextInt();
	  System.out.println("Enter second number");
	  b = scb.nextInt();
	
	
	 if (b == 0 && opr == 4)
	 {
		System.out.print("Cannot divide with zero"); 
		return;
	 }



	  switch (opr)
	  {

		case 1: res = a+b;break;
	      case 2: res = a-b;break;
		case 3: res = a*b;break;
		case 4: res = a/b;break;
	  }

		System.out.print("Result is "+res);

	}


}