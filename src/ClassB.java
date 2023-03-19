package CoreJava;

class ClassAA {  

    ClassAA(int x) {

        System.out.print(" Constructor called " + x);

    }

}

  

// This class contains an instance of ClassA

class ClassB {   

    ClassAA obj1 = new ClassAA(10);  

  

    ClassB(int i) { obj1 = new ClassAA(i); }

  

    public static void main(String[] args) {   

         ClassB obj2 = new ClassB(5);

    }

}