import java.util.*;

public class divi {
    // write a program to take two numbers as input and print the quotient and
    // remainder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the first number: ");
        int a = sc.nextInt();

        System.out.print(" Enter the second number: ");
        int b = sc.nextInt();
        int c = a / b;
        int d = a % b;

        System.out.println("");
        System.out.println(" Quotient of two numbers is " + c);
        System.out.println(" Remainder of two numbers is " + d);

        sc.close();
    }
}
