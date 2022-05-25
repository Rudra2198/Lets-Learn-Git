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
        int ageInMiniute = (age * 365 * 24 * 60);
        int ageInHour = (age * 365 * 24);
        int ageInDay = (age * 365);

        if (currentMonth < birthMonth) {
            age--;
        } else if (currentMonth == birthMonth) {
            if (currentDay < birthDay) {
                age--;
            }
        }

        System.out.println("Your age is: " + age);
        System.out.println("Your age in minute is: " + ageInMiniute);
        System.out.println("Your age in hour is: " + ageInHour);
        System.out.println("Your age in day is: " + ageInDay);

    }
}
