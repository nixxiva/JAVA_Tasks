import java.util.Scanner;
public static void main(String[] args){

    Scanner s = new Scanner(System.in);

    List<Integer> arr = new ArrayList<>();

    System.out.print("Enter 1st number : ");
    arr.add(s.nextInt());
    
    System.out.print("Enter 2nd number : ");
    arr.add(s.nextInt());

    System.out.print("Enter 3rd number : ");
    arr.add(s.nextInt());

    System.out.println();

    if (arr.get(0) == arr.get(1) && arr.get(1) == arr.get(2)) {
        System.out.println("All numbers are equal.");
    }else {
        Collections.sort(arr);
        System.out.println("The largest number is " + arr.get(2));
    }

}
