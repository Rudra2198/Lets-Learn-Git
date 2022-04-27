import java.util.*;


public class revdigit {
    public static void main(String[] args) {
        
        //wrtite a program to reverse the digits of a number

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        while(num != 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("The reverse of the number is " + rev);


    }
    
}
