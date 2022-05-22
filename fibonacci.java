import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int no1 = 0, no2 = 1, no3;

        System.out.println("Enter number up till you want to find fibonacci series : ");
        int count = sc.nextInt();

        System.out.print(no1 + " " + no2);

        for (int i = 0; i < count; ++i) {
            no3 = no1 + no2;
            System.out.print(" " + no3);

            no1 = no2;
            no2 = no3;
        }

        sc.close();
    }

}
