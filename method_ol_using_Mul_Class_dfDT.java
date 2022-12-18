class Adder{
     static int sum (int a , int b)
     {
         return a+b;
     }
     static double sum (double a , double b )
     {
         return a+b;
     }
}

public class method_ol_using_Mul_Class_dfDT {
    public static void main(String[] args) {
        
        System.out.println(Adder.sum(10, 20));
        System.out.println(Adder.sum(12.3, 12.6));

    }
    
}
