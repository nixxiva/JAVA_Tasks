import java.util.Scanner;        
    
public class TaskSeven{
    public static void main(String[] args) {
        TaskSeven t = new TaskSeven();

        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int firstNum = s.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int secondNum = s.nextInt();
        
        System.out.println();
        
        System.out.print(firstNum + " + " + secondNum + " = " );
        System.out.println(t.sum(firstNum, secondNum));
        
        System.out.print(firstNum + " - " + secondNum + " = " );
        System.out.println(t.difference(firstNum, secondNum));
        
        System.out.print(firstNum + " * " + secondNum + " = " );
        System.out.println(t.product(firstNum, secondNum));
        
        System.out.print(firstNum + " / " + secondNum + " = " );
        System.out.println(t.quotient(firstNum, secondNum));

        s.close();
    }
    
    public int sum(int firstNum, int secondNum){

       return firstNum + secondNum;

    }

    public int difference(int firstNum, int secondNum){

       return firstNum - secondNum;

    }

    public int product(int firstNum, int secondNum){

       return firstNum * secondNum;

    }

    public double quotient(double firstNum, double secondNum){

       return firstNum / secondNum;

    }
}
