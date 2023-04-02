package Sap_xep;

import java.util.Arrays;

// coded by Brown Box
public class mergeSort_byBrownBox {

    public static void displayArray (int [] sortMerged){
        System.out.println(Arrays.toString(sortMerged));
    }

    public static int [] mergeSort (int arr[],int left, int right){
//        Special cases:
        if (left > right){  // Unnecessary
            return new int [0]; // null
        }
       //Base case: single-element array
        if (left == right){
            int [] single = {arr[left]};
            return single;
        }
//        Split original array into 2 ones consecutively until it comes out single arrays
//        1st division:  [0]________[mid]   +    [mid+1]_____[length-1]
        System.out.printf("Chia ra %d - %d %n",left,right);
        int mid = (left+right)/2;
        int a1[] = mergeSort(arr,left,mid);
        int a2[] = mergeSort(arr,mid+1,right);


//        Sort and Merge the single-element arrays into one
        int [] merged = merge (a1,a2);

      return merged;
    }
    public static int [] merge (int [] a1, int [] a2){
        int len = a1.length + a2.length; // the length of array that is merged from 2 subs
        int [] sortMerged = new int [len];
        int i = 0, i1 = 0, i2 = 0;
        while (i<len){
//            both of left and right array have elements to sort
            if (i1 < a1.length && i2 < a2.length){  // make sure there is any element that is checked
                  if (a1[i1] <= a2[i2]){
                      sortMerged [i] = a1 [i1];
                      i++;
                      i1++;
                  }
                  else {
                      sortMerged [i] = a2 [i2];
                      i++;
                      i2++;
                  }
            }
//            There may exist a null array when the length is odd that is indivisible by 2 and results in
//                    an oddly single element
//                          while the other is null
            else {
//                 Mang 1 co 3 phan tu da gan het phan tu, trong khi mang 2 co 4 phan tu van chua gan het
//                 i2 da di den cuoi mang a2, a1 con phan tu  => just copy each element sequentially
                if (i1 < a1.length){
                    sortMerged [i] = a1 [i1];
                    i++;
                    i1++;
                }
                // So on
                else{
                    sortMerged [i] = a2 [i2];
                    i++;
                    i2++;
                }
            }
        }

        return sortMerged;
    }
    public static void main(String[] args) {
        int arr [] = {7,2,5,1,4,3,6,0};
        int sortedArray [] =  mergeSort(arr,0, arr.length-1);
        displayArray(sortedArray);



    }
}
