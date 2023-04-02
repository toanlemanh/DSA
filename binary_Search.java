package Sap_xep;
import java.util.Scanner;

public class binary_Search {

    public static int bin_Searching (int arr[], int n){
//        binary search algorithm means split a half after each time searching
//        return the index of search key
//          repeat till low = high
//

        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low <= high){
             mid = (low + high)/2;
            if (n == arr[mid]){
                return mid;
            }
            else if ( n < arr[mid]){
                 high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
          return -1;  // not founding

    }
    public static void main(String[] args) {
         int arr [] = {4,5,6,10,34,67,68,456,610,700};
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

        System.out.println(bin_Searching (arr,n)) ;



    }
}
