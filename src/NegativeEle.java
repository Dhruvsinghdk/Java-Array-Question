


public class NegativeEle {
    public static void main(String[] args) {
        int arr[] = {1,2,-2,3,-3,4,-4,5,-5,6,-6,7,-78,-8,9};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}
