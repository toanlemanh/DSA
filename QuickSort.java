package Sap_xep;

import java.util.Arrays;

/**
 * @author: TheBrownBox
 */
public class QuickSort {
    /**  @requires
     * @modifies: array, left, right
     * @effects:   partition and divide super array into the sub ranges to implementing partition for each one.
     *            Do this process until the range is 1
     *            {@link {partition( int [], int, int )}}
     *            {@link {quickSort (int [], int , int )}}
     */
    private static void quickSort (int [] array , int left, int right){
//  Big O (log n)
        if (left >= right) return; // base case
        // vi tri cua index de lam khoa
// partition : phan bo lai mang sao cho dung vi tri
//        bien key de luu vi tri can phai cat (index cua pivot hien tai)
          int key = partition (array, left, right); // tra ve gia tri cua iLeft

//        divide into 2 parts again  (abstract division)
//        Buoc nay khong thuc su chia mang cha thanh cac mang con vat ly, ma chi don gia gioi han range cua cac mang con de tien cho viec phan bo lai mang
//        Vd :       [  3   0   6   5   2    7    4]   =>   partition [  3  0  4  2   5     7  6 ]  => divide :    [  3  0  4  2  5 ]   va  [    7   6 ]
          quickSort (array, left, key - 1);   // => phan bo lai mang theo key
          quickSort (array, key, right);
        }

    /**
     *
     * @param array
     * @param left
     * @param right
     * @requires: left <= right
     * @modifies:  array, left, right
     * @effects:   choose the pivot index (middle)
     *             if the left elements of pivot are larger than it and the right elements of pivot are less than it,
     *               then swap them until no element sit wrong index.
     * @return
     */
    public static int partition (int [] array , int left,   int right ){
//          Big O (n)
        int mid = ( left + right ) / 2;
        int iLeft = left, iRight = right, iPivot = mid;
//  Dung 2 con tro dich tu dau mang va dich tu cuoi mang de tim cac phan tu nam sai vi tri vap vi tri thích hop
        while ( iLeft <= iRight ){
             if ( array [iLeft] >= array [iPivot] && array [iRight] <= array [iPivot] ){
                  swap ( array, iLeft, iRight);  // chi swap khi ca left va right nam sai vi tri
                 iLeft ++;
                 iRight --;
              }
              else if ( array [iLeft] < array [iPivot] ){ // left o dung vi tri
                    iLeft ++;
              }
              else if ( array [iRight] > array [iPivot] ){ // right da o dung vi tri
                   iRight --;
             }
        }
         return iLeft;  // tra ve index cua pivot sau khi di chuyen |  <  | pivot |  >  |  sao cho hop ly
    }
    private static void swap (int [] array, int source, int destination ){
           int temp = array [source];
           array [source] = array [destination];
           array [destination] = temp;

    }
    public static void main(String[] args) {
         int [] array = {5,8,1,7,3,6,2,4,0};
//           int [] array = {0,2,1,3};
//        int [] array = {7,5};
           int n = array.length - 1;
           int mid = n / 2;
        quickSort( array, 0, n);
        System.out.println( Arrays.toString( array ));
    }
    // Thuat toan co do phuc tap O(n log n)
}
