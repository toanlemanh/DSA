package Sap_xep;


// coded by Bro Code
public class Merge_sort {
    private static void mergeSort (int arr[]){
//        Split the array into single arrays
        if (arr.length <= 1){
            return;
        }
        int mid = arr.length/2;
        int left_arr [] = new int [mid];
        int right_arr [] = new int [arr.length-mid];
        for (int i=0; i<arr.length; i++){
            if (i< mid){
                left_arr [i] = arr [i];
            }
            else {
                right_arr [i-mid] = arr[i];
            }
        }
//        for (int x : left_arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        for (int x : right_arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();

        mergeSort(left_arr);
        mergeSort(right_arr);

//        Sort and merge them back into one
        mergeBack(left_arr,right_arr,arr);

    }
    private static void mergeBack (int left_arr [], int right_arr [], int arr []){
          int leftSize = arr.length/2;  // first left_arr
          int rightSize = arr.length - leftSize;  // first right_arr
          int i = 0,l = 0,r = 0; // indices

//        check for the conditions for merging back
        while (l < leftSize && r < rightSize){
            if (left_arr[l] < right_arr[r]){
                arr[i] = left_arr[l]; // copy smaller values
                l++;
            }
            else {
                arr[i] = right_arr [r];// copy smaller values
                r++;
            }
            i++; // index i always gets a raise
        }
//   Right array is null while the left array includes single element so we cannot compare
        while (l < leftSize){
                arr[i] = left_arr[l];
                l++;
                i++;
            }
//   Left array is null and so on
        while (r < rightSize){
              arr [i] = right_arr[r];
              r++;
              i++;
         }
    }
    public static void main(String[] args) {
        int arr [] = {7,2,5,1,4,3,6,0};
        mergeSort(arr);
        for (int j : arr){
            System.out.print(j+" ");
        }
    }
}
