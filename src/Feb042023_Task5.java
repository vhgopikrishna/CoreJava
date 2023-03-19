package CoreJava;

import java.util.Scanner;

public class Feb042023_Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length=0;
		int breadth=0;
		
		System.out.println("Enter length");
		Scanner sl = new Scanner(System.in);
		length = sl.nextInt();
		
		System.out.println("Enter breadth");
		Scanner sb = new Scanner(System.in);
		breadth = sb.nextInt();
		
		if (length == breadth)
		{
			System.out.println("Given polygon is a square");
			System.out.println("Area of given square is: "+(4*length));
		}
		else
		{
			System.out.println("Given polygon is a rectangle");
			System.out.println("Perimeter of given rectangle is: "+(2*(length+breadth)));
		}
	}

}
