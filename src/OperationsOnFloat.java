package CoreJava;

public class OperationsOnFloat
{
	public static void main(String args[])
		{
			
			float var1;
			float var2;
			float res;
			
			var1 = 10.25f;
			var2 = 2.25f;
			
			res = var1 + var2;
			System.out.println("Addition: "+ res);
			
			res = var1 - var2;
			System.out.println("Difference: "+ res);

			res = var1*var2;	
			System.out.println("Product: "+ res);

			res = var1/var2;
			System.out.println("Division: "+ res);

		}

}