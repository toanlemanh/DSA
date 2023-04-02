package Sap_xep;

import java.util.Arrays;

public class HeapSort {
    //***** Chua hoan thien *****//
    public static void heapSort (int [] array, int length) {
        int nonleaves = (length/2) - 1;

          buildMaxHeap( array, nonleaves ); // trickle down all nonleaf nodes to obtain max heap
//       once build max heap then swap new root with the last leaf, and reduces the range max heap
//         sau khi day het cac max heap len dau mang roi moi swap
          for ( int i = length - 1; i >= 0; i-- ) {
//               sau khi i giam mot don vi, param thu 2 cua trickledown cung se bi gioi han lai de khong lam thay doi gia tri cua last node truoc do ( cai ma duoc luu vao i )
              swap( array, 0, i );

//              and the new root may be less than 2 left right nodes => so trickle all nodes down from root index to the temp nonleaf layer.
//           ( trickle down from zero to ith (temp) nonleaf node because the ith( after temp ) node is considered as sorted elements ( last leaves were sorted ( reduced))
              trickleDown( array, i,0 );  /** => trickle down the reduced size */
          }

//   trickle down tât ca cac non leaf node de bien tu heap binh thuong sang max heap
//
//


    }
    private static void swap (int [] array, int source, int destination){
           int temp = array [destination];
           array [destination] = array [source];
           array [source] = temp;
    }

    private static void buildMaxHeap (int [] array, int nonleaves ) {
            for ( int i = nonleaves; i >= 0; i-- ){
//                trickle down all nonleaf nodes
                trickleDown( array, array.length, i);
            }
    }
        private static void trickleDown ( int [] array, int n, int i ) {
            // trickle down the leaf node
//            with param i, we can refer exactly the index of both (left and right) children (maybe)
//            to keep the trickle down
            int max = i;
            int leftNode = 2 * i + 1;
            int rightNode = leftNode + 1;
            int lastNode = n - 1;
            if (leftNode <= lastNode) {
                if (array[leftNode] > array[max]) {
                    max = leftNode;
                }
            }
                if (rightNode <= lastNode) {
                    if (array[rightNode] > array[max]) {
                        max = rightNode;
                    }
                }
//         after trickle down at index i, then swap to push the new node up (becoming a max heap sub tree)

//         after swapping (maybe), we continue to trickle down at largest node ( vi tri da hoan doi voi i de dam bao no cung tao ra mot max heap sub tree )
                if (max != i) {
                    swap(array, max, i);
                    trickleDown(array, n, max); // trickleDown tai vi tri Node vua duoc boc len lam Node largest
                }
            }
            /**
             * @author:
             *  using Binary tree to visualize the tree from an array
             *
             *  Step1: Build a max/min heap each iteration ( TrickleDown )
             *  Step2.0: Swap root (index: 0) and the last leaf (index: n-1) and reduce the length of array
             *  Step2.1: Trickle Down from the root down to the temp leaf node (because the new root maybe crack/destroy the max heap tree structure )
             *  Step3: Do this process until the length = 1
             *
             *  In a max-heap, each sub-tree must be a max-heap too.
             * • Except leaf nodes, all other subtrees may not fulfill the
             * requirement for a max-heap.
             *
             *  parent(i)  :  i/2 - 1
             *  left Child : 2*i + 1
             *  right Child : 2*i + 2
             *
             *
             */


    public static void main(String[] args) {
        int [] array = {3,4,0,8,5,1,9,7,2,10,6};
        int n = array.length ;
       heapSort(array, n);
        System.out.println( Arrays.toString( array ));

    }
}
