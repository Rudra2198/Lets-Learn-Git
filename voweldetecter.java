import java.util.*;

public class voweldetecter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int vowelCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                vowelCounter++;
            }
        }

        System.out.println("");
        System.out.println("Number of vowels: " + vowelCounter);
        sc.close();
    }
}
