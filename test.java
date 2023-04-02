package Sap_xep;

import java.util.Scanner;

/**
 *     call draw (3)
 *         base case : x<=0 then terminates recursive call
 *         else  call itself with x-1 and come back line 1
 *               Lastly, printf # (After return the base case, the rest of recursion is implemented reversely
 *      Like this, draw (3)
 *                     draw (2)
 *                         draw (1)
 *                             draw (0) --> return
 *                             compile the rest of code (printf)
 *                         draw (1)
 *                             compile the rest of code (printf)
 *                     draw (2)
 *                             compile the rest of code (printf)
 *                 draw (3)
 *                            compile the rest of code (printf)
 *
 */
public class test {
//    private static void draw (int height){
//        if (height <= 0){
//            return;
//        }
//        draw (height - 1);
//        for (int i=0; i< height; i++){
//            System.out.print("#");
//        }
//        System.out.println();
//
//    }
    private static void selectionSort (int [] arr){
        for (int i=0; i<arr.length-1; i++){
            int min = i;
            for ( int j = i+1; j<arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
    private static void insertionSort (int [] arr){

        for (int i = 1; i< arr.length; i++){
            int temp = arr[i]; // store the value of current check
            int j = i-1;  // examine the left-handed side values

            while (j>=0 && arr[j] > temp){
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int height = sc.nextInt();
//        draw(height);

        int [] arr = { 7,5,2,1,6,8,4,0,3};
//        insertionSort (arr);
        selectionSort(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }

    }
}
