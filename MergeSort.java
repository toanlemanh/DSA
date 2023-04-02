package Sap_xep;

public class MergeSort {
    public static void toPrint (int [] array){
        for (int i : array)
            System.out.print(i + " ");
    }
    public static int [] mergeSort (int [] array, int left, int right){
        if (left > right){
            return null;  // exception: wrong input
        }
       //  0 - 4   5 - 9
        // 0 - 2  3 - 4
        // 0 - 1  2   3   4
        if (left == right) {
            int[] single = {array[left]}; // store tha value
            return single;  // base case : only has an element
        }
//        divide array into 2 subarrays
        int mid = (left + right) / 2;
        System.out.println(left +" " + mid);
          int [] L = mergeSort(array, left, mid);
        System.out.println("da tra ve L");


        System.out.println((mid + 1) +" " + right);
         int [] R = mergeSort(array, mid + 1, right);
        System.out.println("da tra ve R");

//         Then sort and merge them into one
         int [] sortedArray = toMergeAndSort(R,L);
         return sortedArray;
    }
//    Create an array that is combined from 2 subs
//    => This array contains the sum of length of 2 subs and sequential numbers
    public static int [] toMergeAndSort(int[] R, int[] L){
        int len = R.length + L.length;
        int [] mergedArray = new int [len];
        int i = 0, r = 0, l = 0;
        while (i < len) {
            if (r < R.length && l < L.length) {
                if (R[r] <= L[l]) {
                    mergedArray[i] = R[r];
                    r++;
                } else {
                    mergedArray[i] = L[l];
                    l++;
                }
                i++;
            }

            else {
                if (r < R.length){
                    mergedArray [i] = R[r];
                    r++;
                }
                else if (l < L.length){
                    mergedArray [i] = L[l];
                    l++;
                }
                i++;
            }
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        int [] array ={3,4,6,8,0,2,7,9,5,1};

        toPrint( mergeSort(array,0,9));



    }
}
