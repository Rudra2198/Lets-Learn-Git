import java.util.*;

public class agecalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = sc.nextInt();

        System.out.println("Enter your birth month: ");
        int birthMonth = sc.nextInt();

        System.out.println("Enter your birth day: ");
        int birthDay = sc.nextInt();

        System.out.println("Enter your current year: ");
        int currentYear = sc.nextInt();

        System.out.println("Enter your current month: ");
        int currentMonth = sc.nextInt();

        System.out.println("Enter your current day: ");
        int currentDay = sc.nextInt();

        int age = currentYear - birthYear;

        if (currentMonth < birthMonth) {
            age--;
        } else if (currentMonth == birthMonth) {
            if (currentDay < birthDay) {
                age--;
            }
        }

        System.out.println("Your age is: " + age);
        sc.close();
    }
}
