import java.util.*;

public class avg {
    // write a program that takes three numbers as input and prints the average of
    // the numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the first number: ");
        int a = sc.nextInt();

        System.out.print(" Enter the second number: ");
        int b = sc.nextInt();

        System.out.print(" Enter the third number: ");
        int c = sc.nextInt();
        int d = (a + b + c) / 3;

        System.out.println("");
        System.out.println(" Average of three numbers is " + d);

        sc.close();
    }
}
