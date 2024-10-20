
//Java Program to count total number of negative elements in an array.

public class Negative {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = {1,2,-2,3,-3,4,-4,5,-5,6,-6,7,-78,-8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                count++;
            }
        }
        System.out.println(count);

    }
}
