import java.util.*;

class keyRemover {

    public static int[] removeElements(int[] arr, int key) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[index++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, index);
    }
}

public class elementRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Array = new int[10];

        for (int i = 0; i != Array.length; i++) {

            System.out.print("Enter " + i + " index number : ");
            Array[i] = sc.nextInt();
        }

        System.out.println("");
        System.out.println(Arrays.toString(Array));

        System.out.println("");
        System.out.print("Enter occurrence to remove : ");
        int o = sc.nextInt();
        System.out.println("");

        System.out.println("Occurrences removed! ");
        int[] obtainer = keyRemover.removeElements(Array, o);
        System.out.println(Arrays.toString(obtainer));

        sc.close();
    }
}
