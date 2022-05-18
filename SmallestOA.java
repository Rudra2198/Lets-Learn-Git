import java.util.*;
import java.util.Arrays;

public class SmallestOA {
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

        int Smallest = arr[0];

        System.out.println("");
        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            if (Smallest > num) {
                Smallest = num;
            }
        }

        System.out.println("");
        System.out.println("The Smallest element in the array is " + Smallest);
        sc.close();
    }
}
