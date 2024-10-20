
//Java Program to print minimum and maximum element in an array.

import java.util.*;

public class Minandmax {
    public static void main(String[] args) {

        int arr[] = {1,4,1,2,7,5,6,9,8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
