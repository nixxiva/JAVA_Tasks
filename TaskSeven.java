import java.util.Scanner;        
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int firstNum = s.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int secondNum = s.nextInt();
        
        System.out.println();
        
        System.out.print(firstNum + " + " + secondNum + " = " );
        System.out.println(sum(firstNum, secondNum));
        
        System.out.print(firstNum + " - " + secondNum + " = " );
        System.out.println(difference(firstNum, secondNum));
        
        System.out.print(firstNum + " * " + secondNum + " = " );
        System.out.println(product(firstNum, secondNum));
        
        System.out.print(firstNum + " / " + secondNum + " = " );
        System.out.println(quotient(firstNum, secondNum));
        
        s.close();
    }
    
    public static int sum(int firstNum, int secondNum){

       return firstNum + secondNum;

    }

    public static int difference(int firstNum, int secondNum){

       return firstNum - secondNum;

    }

    public static int product(int firstNum, int secondNum){

       return firstNum * secondNum;

    }

    public static int quotient(int firstNum, int secondNum){

       return firstNum / secondNum;

    }
