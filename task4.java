import java.util.Scanner;

public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the word to check palindrome : ");
    String word = s.nextLine();

    StringBuilder w = new StringBuilder(word);

    // if (word.equalsIgnoreCase(w.reverse().toString()))
    //     System.out.println("The input string is a palindrome.");
    // else 
    //     System.out.println("The input string is not a palindrome.");

    System.out.println(word.equalsIgnoreCase(w.reverse().toString()) ?
        "The input string is a palindrome." : "The input string is not a palindrome.");

    s.close();
}