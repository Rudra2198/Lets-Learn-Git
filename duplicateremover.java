import java.util.*;

public class duplicateremover {
    int a,b,c,d,e,f,g,h,i,j;

    Scanner sc = new Scanner (System.in);

    public void input() {
        System.out.println("Enter a number : ");
        a = sc.nextInt();
        System.out.println("Enter a number : ");
        b = sc.nextInt();
        System.out.println("Enter a number : ");
        c = sc.nextInt();
        System.out.println("Enter a number : ");
        d = sc.nextInt();
        System.out.println("Enter a number : ");
        e = sc.nextInt();
        System.out.println("Enter a number : ");
        f = sc.nextInt();
        System.out.println("Enter a number : ");
        g = sc.nextInt();
        System.out.println("Enter a number : ");
        h = sc.nextInt();
        System.out.println("Enter a number : ");
        i = sc.nextInt();
        System.out.println("Enter a number : ");
        j = sc.nextInt();
    }

    public void remove() {
        int[] arr = {a,b,c,d,e,f,g,h,i,j};
        int[] arr2 = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                arr2[i] = arr[i];
            }
            count = 0;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static void main(String[] args) {
        duplicateremover dr = new duplicateremover();
        dr.input();
        dr.remove();
    }

}
