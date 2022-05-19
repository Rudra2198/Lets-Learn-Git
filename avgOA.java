import java.util.*;
import java.util.Arrays;

public class avgOA {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print(" Enter capacity of array ");
        int n = inp.nextInt();

        Double[] arr = new Double[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            System.out.print("Enter " + i + " index number : ");
            arr[i] = inp.nextDouble();
        }

        System.out.println("");
        System.out.println(Arrays.toString(arr));

        Double sum = 0.0;

        for (Double num : arr) {
            sum += num;
        }

        System.out.println("");
        Double avg = sum / arr.length;
        System.out.println(" The average is : " + avg);
        inp.close();
    }
}
