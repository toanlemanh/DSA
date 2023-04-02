package Sap_xep;

public class binary_search_recursive {
    /**
     *   base case:
     *   out of array length or find the required number (x)
     *   operation :   parameter x
     *                mid = (start + end) / 2
     *                if x < mid => end = mid - 1
     *                else x > mid => start = mid + 1
     */
    private static int binarySearch (int x,int arr[],int start,int end){
        int mid = (start + end)/2;
        while (start <= end) {
            if (arr[mid] > x) {
                return binarySearch(x, arr, start, mid-1);
            }
            else if (arr[mid] < x) {
                return binarySearch(x, arr, mid+1, end);
            }
            else {
                return mid;
            }
        }
//        if you dont find the required value in array until out of length
        return -1;
    }
    public static void main(String[] args) {
        int sorted_array [] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(3,sorted_array,0,sorted_array.length-1));


    }
}
