package CoreJava;

public class Feb042023_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		int temp;
		System.out.print(n1+" "+n2);
		for (int i=2;i<11;i++)
		{	
		temp=n1+n2;
		System.out.print(" "+temp);	
		n1=n2;
		n2=temp;
		}
	}

}
