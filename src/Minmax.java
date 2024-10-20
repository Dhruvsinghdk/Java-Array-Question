
import java.util.*;

public class Minmax {
    public static void main(String[] args) {
        int arr[] = { 11, 45, 10, 10, 76, 32,76};
        Arrays.sort(arr);

        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = arr.length-1 ; i > 0; i--) {
            if (arr[i] < arr[arr.length - 3])
            {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println(secondLargest);
    }
}
