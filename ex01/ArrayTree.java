package tut09.ex01;

import utils.NotPossibleException;

import java.util.Arrays;

public class ArrayTree {
    /**
     * @overview Tree is an abstract model of a hierarchical structure
     *            A tree consists of branches and nodes with a parent-child relation
     * @attributes
     *
     * @object A typical ArrayTree
     *
     * @abstracr_properties
     *
     *
     */
    private final int maxSize = 100;
    private static int realSize = 0;  //nothing node
    private int [] parentArray ;
    private String [] labels;
    // parent array to store the index of parent of that node in tree Ex: Each node has only parents except root (-1)


    public ArrayTree() {
         parentArray = new int [maxSize];
         labels = new String [maxSize];
        parentArray[0] = -1;
    }

    //Children of the same parentare indexed from
    //left to right
    public void addNode (String label, int parent) throws NotPossibleException{
        if ( parent == -1 ){
//            parentArray[0] = -1;
            labels [0] = label;
            realSize++;
        }
        else {
            if ( parent <= realSize && parent > -1 ) {

//                shift to the right to make room for new node (match with the left node(same parent stay together))
                int i = realSize-1;

                while ( parentArray[i] != parent && parentArray[i] > parent ){
                    labels[i+1] = labels[i];
                    parentArray[i+1] = parentArray[i];
                    i--;
                }
                labels[i+1] = label;
                parentArray[i+1] = parent;
                realSize++;
            }
            else throw new NotPossibleException("Invalid parent");
        }

    }
    public int getParent (int node){
        return parentArray [node];
    }
//     public int leftMostChild (int parent){
// //        C1:
//         for (int i = 0; i < realSize; i++){
//             if ( parentArray[i] == parent )
//                 return i;
//              }
//         return -1;
//     }
     public int leftMostChild (int parent) {
        if (parent == -1)
            return 0;
        if (parent <= realSize && parent > -1) {
                int index = findExact(parentArray, parent);
                return index;
            }
        throw new NotPossibleException("Invalid parent");
    }


    //    Whether another solution with effective time-complexity ???
//
//     C2: Binary search
//
     public static int binarySearch (int [] array, int left, int right, int target){
        
         int mid = (left + right) / 2;
         while ( left <= right ) {

             if (array[mid] == target) return mid;
             else if (array[mid] < target) {
                return binarySearch(array, mid + 1, right, target);
             } else {
                return binarySearch(array, left, mid - 1, target);
             }
         }
         return -1; //not found
    }
    public static int findExact (int [] parentArray, int parent){
       
            int i = binarySearch(parentArray, 0, realSize - 1, parent);
            if (i == -1)
                return -1;// not found
            else
                while (parentArray[i] == parentArray[parent]) {
                    i--;
                }
            return i;
      
    }
//   //  C2: Binary search  public int binarySearch (int [] array, int left, int right, int target){
//         int mid = (left + right) / 2;
//         if ( array[mid] == target )  return mid;
//         else if ( array[mid] < target )
//
//             else
//    }
    public void displayAll(){
        for (int i = 0; i < realSize; i++){
            System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println(Arrays.toString(labels));
        System.out.println(Arrays.toString(parentArray));
    }

    /**isFull() : boolean – returns true if the current Tree is full, otherwise returns false.
     - isEmpty() : boolean – returns true if the current Tree is empty, otherwise returns false.
     - addNode(String label, int parent) : void – Adds a new node into the current Tree as the
     child of the node parent. The argument label contains the new node’s label.
     - getParent(int node) : int – returns the parent of node .
     - getNodeLabel(int node) : String – returns the label of node.
     - setNodeLabel(String label, int node) : void – set node’s label to the new label argument.
     - leftMostChild(int node) : int – returns the left most child of the node. Returns -1 if the
     node has no children.
     - nearestRightSibling(int node) : int – returns the nearest right sibling node of the node.
     Returns -1 if the node has no right sibling
*/
    public boolean isFull (){
        return (realSize == 100);
    }
    public boolean isEmpty (){
        return (realSize == 0);
    }
    public String getNodeLabel(int node){
        return labels[node];
    }
    public void setNodeLabel (String label, int node){
       if (label == null || node < -1 || node >= realSize)
           throw new NotPossibleException("Invalid node");
        labels [node] = label;
    }
    public int nearestRightSibling (int node){

        // neu khong co node phai (khong co con or chi co node trai) thi tra ve -1
         if ( node < realSize && node > 0) {
               if ( parentArray[node + 1] == parentArray[node] && labels [node+1] != null )
                   return node+1;
//               else if ( parentArray[node - 1] == parentArray[node] && parentArray[node+1] != parentArray[node])// chính nó là node phải {
//               {
//                   return node;
//               }
               else // nếu node bên phải không bằng node này => ckhông có node phải
                   return -1;
         }
        //nguoc lai, tra ve node phai
        throw new NotPossibleException("Invalid node");
    }


}
