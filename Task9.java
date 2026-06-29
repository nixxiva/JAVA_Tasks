import static java.lang.Math.*;

public class Task9{
    
    public static void main(String[] args){
        
        // ADD
        System.out.println("ADDITION:");
        System.out.println(add(1,2)); //static
        System.out.println(Math.addExact(10, 23)); //import method

        // SUBTRACT
        System.out.println("SUBTRACTION:");
        System.out.println(subtract(10, 7));
        System.out.println(Math.subtractExact(24, 2));

        // MULTIPLY
        System.out.println("MULTIPLICATION:");
        System.out.println(subtract(34, 35));
        System.out.println(Math.multiplyExact(24, 24));

        // DIVIDE
        System.out.println("DIVISION:");
        System.out.println(divide(13, 5));
        System.out.println(Math.divideExact(9, 4));
        
    }

    // Static methods
    public static int add(int a, int b){
        return a + b;
    }
    
    public static int subtract(int a, int b){
         return a - b;
    }
    
    public static int multiply(int a, int b){
        return a * b;
    }
    
    public static float divide(int a, int b){
        return a / b;
    }

}