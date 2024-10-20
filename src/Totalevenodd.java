
//Java Program to count total number of even and odd elements in an array.

public class Totalevenodd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int arr[] = {1,2,3,4,5,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
               even++;
            }
            if(arr[i]%2!=0){
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
