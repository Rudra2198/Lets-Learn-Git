import java.util.*;
import java.util.Arrays;

public class LargestOA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the capacity of array ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            System.out.print("Enter " + i + " index number : ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        System.out.println("");
        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            if (largest < num) {
                largest = num;
            }
        }

        System.out.println("");
        System.out.println("The largest element in the array is " + largest);
        sc.close();
    }
}
