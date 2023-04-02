package Sap_xep;

public class Insertion_sorting {
    public static void main(String[] args) {
        // for loop from [1]
        //  compare the value of [i] and [i-1]
        int[] arr = {12, 11, 13, 5, 6, 10, 9, 7, 6};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

             int j = i-1;   // the last element of sorted list or the left of temp
             while ( j>=0 && arr[j]>temp){
                 arr[j + 1] = arr[j]; // stored the value of previous number at the right (shiftRight)
                 j--;                 // check the descending index from the current position

            }
             arr[j+1] = temp; // j=0 =>  arr[1] = temp  if the while-loop come to zero

        }

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    public void insertion_sort (int arr[]){
          for (int i = 1; i < arr.length; i++){
              int temp = arr[i];
              int j = i - 1;    // the left-handed index of temp

//              compare the value of temp with the left-handed values until
              while ( j >= 0 && arr[j] > temp){
                  arr [j + 1] = arr [j];  // shift the satisfied values to the right
                  j--;
              }

//              insert the value of temp
              arr [j+1] = temp;
          }
    }
}
