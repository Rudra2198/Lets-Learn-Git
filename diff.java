import java.util.*;

public class diff {
    // write a program that takes two numbers as input and prints the difference
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the first number: ");
        int a = sc.nextInt();

        System.out.print(" Enter the second number: ");
        int b = sc.nextInt();
        int c = a - b;

        System.out.println("");
        System.out.println(" Difference of two numbers is " + c);

        sc.close();

        System.out.println("bye");
    }

}
