import java.util.Arrays;

public class MergeSort {
    private static int [] mergeSort ( int [] array, int left, int right ){
        if (left > right)
            return new int [0];
        if (left == right) {
//            create a one-element array and return
            int [] single = { array [left] };
            return single;
        }


//        divide array into 2 parts gradually. At the end, return each element in turn.
        int mid = ( left + right ) / 2;
        int Left [] = mergeSort(array, left, mid);
        int Right [] = mergeSort(array, mid + 1, right);

//        At the end, sorting and merging them into one
        int [] sortedArray =  mergeArray ( Left, Right);
           return sortedArray;
    }
    private static int [] mergeArray ( int [] left, int [] right){
        int index = 0, lIndex = 0, rIndex = 0;
        int n = left.length + right.length;
        int [] mergedArray = new int [n];
//        create leftIndex and RightIndex for left and right array
//        TO-DO: compare and copy element into one array
//        the number of two sub arrays:   ca hai cai deu khac rong /\ mot trong hai cai rong

        while (index < mergedArray.length){ // con so sanh va dua cac gai tri cua sub arrray cho den khi day mang moi (merged)
            if ( lIndex < left.length && rIndex < right.length) {  // khi ca hai mang sub arrray chua duoc xep het len mang
                if (left[lIndex] <= right[rIndex]) {
                    mergedArray[index] = left[lIndex];
                    lIndex++;
                } else {
                    mergedArray[index] = right[rIndex];
                    rIndex++;
                }
                index++;
            }
            else if (lIndex < left.length){  // cai right array duoc xep het truoc vao mang moi
                mergedArray[index] = left[lIndex];
                index++;
                lIndex++;
            }
            else if (rIndex < right.length){ // cai left array duoc xep truoc vao mang moi
                mergedArray[index] = right[rIndex];
                index++;
                rIndex++;
            }
        }
        return mergedArray;
    }

    public static void main(String[] args) {

        int [] array = {7,4,5,3,0,9,1,8,2,6};
        System.out.println(Arrays.toString(array));
        System.out.println("After sorting: " + Arrays.toString( mergeSort (array,0, array.length - 1 ) ) );
    }
}
