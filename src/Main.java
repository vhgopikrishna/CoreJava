package CoreJava;

public class Main {

    static float pi = (float)21/11;
    
   
    float radius = 5, area = 0;

    public void calculateArea(){

    pi = 22/7;
    area = pi * radius * radius;
    System.out.println("Area of circle is: " + area);
}

public static void main(String[] args) {
	 System.out.print("pi = "+pi);
    Main obj = new Main();
    System.out.println("value of pi is: "+pi);
    obj.calculateArea();

}
}