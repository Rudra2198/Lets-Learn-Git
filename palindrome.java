import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        String reversedText = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = sc.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }

        System.out.println("");

        if (text.equals(reversedText)) {
            System.out.println("The text is a palindrome");
        } else {
            System.out.println("The text is not a palindrome");
        }

        sc.close();
    }
}
