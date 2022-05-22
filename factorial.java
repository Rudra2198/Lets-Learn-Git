import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }

        System.out.println("");
        System.out.println("The factorial of " + a + " is : " + fact);

        s.close();
    }
}
