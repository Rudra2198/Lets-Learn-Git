import java.util.*;

public class wordcounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int wordCounter = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                wordCounter++;
            }
        }

        System.out.println("");
        System.out.println("Number of words: " + wordCounter);
        sc.close();
    }
}
