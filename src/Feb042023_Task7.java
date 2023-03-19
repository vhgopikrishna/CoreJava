package CoreJava;

import java.util.Scanner;

public class Feb042023_Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	---------------------------------------------------------------------------------------------
	|										Televisions											|
	---------------------------------------------------------------------------------------------
	|			Type			|			Size			|				Cost				|
	---------------------------------------------------------------------------------------------
	|	1. Black & White		|		14 inch.			|			$300					|
	---------------------------------------------------------------------------------------------
	|	2. Black & White		|		20 inch.			|			$400					|
	---------------------------------------------------------------------------------------------
	|	3. Color				|		14 inch.			|			$1000					|
	---------------------------------------------------------------------------------------------
	|	4. Color				|		20 inch.			|			$1150					|
	---------------------------------------------------------------------------------------------
	*/
	
	
	int tvtype=0;
	int tvsize=0;
	
	System.out.println("Select Television type(0->B&W 1->Color)");
	Scanner sct = new Scanner(System.in);
	tvtype = sct.nextInt();
	
	System.out.println("Select screen size(0->14 inch. 1->20 inch.)");
	Scanner scs = new Scanner(System.in);
	tvsize = scs.nextInt();
	
	if (tvtype == 0)
	{
		if(tvsize == 0)
		{
			System.out.println("Discount applicable is: 8%");
		}
		else if (tvsize == 1)
		{
			System.out.println("Discount applicable is: 12%");
		}
		else
		{
			System.out.println("Invalid selection. Please try again..");
		}
	}
	else if(tvtype == 1)
	{
		if(tvsize == 0)
		{
			System.out.println("Discount applicable is: 10%");
		}
		else if (tvsize == 1)
		{
			System.out.println("Discount applicable is: 14%");
		}
		else
		{
			System.out.println("Invalid selection. Please try again..");
		}
	}
	else
	{
		System.out.println("Invalid selection. Please try again..");
	}
	}

}
