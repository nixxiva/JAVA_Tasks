import static java.lang.Math.*;

public class Task9{
    
    public static void main(String[] args){
        
        // ADD
        System.out.println("ADDITION:");
        System.out.println(add(1,2));

        // SUBTRACT
        System.out.println("SUBTRACTION:");
        System.out.println(subtract(10, 7));

        // MULTIPLY
        System.out.println("MULTIPLICATION:");
        System.out.println(subtract(34, 35));

        // DIVIDE
        System.out.println("DIVISION:");
        System.out.println(divide(13, 5));
        
    }

    // Static methods
    public static int add(int a, int b){
        return addExact(a, b);
    }
    
    public static int subtract(int a, int b){
         return subtractExact(a, b);
    }
    
    public static int multiply(int a, int b){
        return multiplyExact(a, b);
    }
    
    public static float divide(int a, int b){
        return divideExact(a, b);
    }

}