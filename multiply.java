import java.util.*;

public class multiply {
    // write a program that takes two numbers as input and prints the product
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the first number: ");
        int a = sc.nextInt();

        System.out.print(" Enter the second number: ");
        int b = sc.nextInt();
        int c = a * b;

        System.out.println("");
        System.out.println(" Product of two numbers is " + c);

        sc.close();
    }
}
