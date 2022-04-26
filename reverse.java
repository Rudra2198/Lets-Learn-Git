import java.util.*;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String rev = " ";

        String text;

        System.out.println(" ");

        System.out.println("Enter text you want to reverse: ");
        text = sc.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }

        System.out.println("Reversed text: " + rev);

    }
}
