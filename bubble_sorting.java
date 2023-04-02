package Sap_xep;

/**
 *    bubble sort : Bubble sort is another sorting algorithm that works by
 *    repeatedly swapping elements to “bubble” larger elements to the end.
 *
 *    pseudocode:
 *    Repeat n-1 times
 *   For i from 0 to n–2
 *       If numbers[i] and numbers[i+1] out of order
 *           Swap them
 *
 *    O(n^2)
 *    the best case is n-1 steps
 */
public class bubble_sorting {
    public static void main(String[] args) {
        int arr[] = {7,9,4,5,1,2,4,4,2,10,0};

        for (int i=0; i<arr.length -1; i++){
            for (int j =i+1; j<arr.length; j++){
                  if ( arr[j] < arr[i]){
                      int temp = arr[j];
                      arr[j] = arr[i];
                      arr[i] = temp;
                  }
            }
        }
        for (int i: arr){
            System.out.print(i+"\t");
        }
    }
}
