package Sap_xep;

/**  SelectionSort :
 *          search through the array and keep track of the min value during each iteration.
 *          At the end of each iteration, we swap the variables.
 *
 *   pseudocode :
 *       For i from 0 to n–1
 *       Find the smallest number between numbers[i] and numbers[i+1] (the rest of array)
 *       Swap the smallest number with numbers[i]
 *
 *      O(n^2)
 *      the best case is (n-1)(n-1 + 1)/2  (n^2)
 */


public class Selection_sorting {

    public static void cach2 (int arr[]){
        for( int i=0; i<arr.length-1; i++){
            int min = i;  // vị trí i đang xét coi là min
              for (int j=i+1; j<arr.length; j++){  //so sánh với phần tử bên cạnh nó cho đến cuối VÌ những cái trước nó đã xếp rồi
                    if( arr[j] < arr[min]){
                        min = j; // cập nhật lại index của min = j sau mỗi vòng duyệt
                    }
              }
              int temp = arr[i];
              arr[i] = arr[min];    // Đẩy min lên đầu mảng unsorted list ( vị trí i đang xét)
              arr[min] = temp;        // Đẩy temp
        }
        for (int i: arr){
            System.out.print(i+"\t");
        }
    }
    public static void main(String[] args) {

        int arr [] = {9,4,5,2,1,7,12,13,10};
        cach2(arr);
        /*
        xet vi tri 0 :
            Tim min va vi tri chua min trong mang
            Hoan doi vi tri dau tien voi vi tri chua min

         */
//        for (int i=0; i<arr.length; i++){
//            int min = arr[i];
//            for (int j=i+1; j<arr.length; j++){
//                 if (min > arr[j]){ // tim min nho nhat tinh tu phan tu sau i den cuoi mang
//                     min = arr[j];
//                 }
//            }
//            int temp = arr[i]; // temp la phan tu trung gian de luu gia tri cua phan tu i
//            for (int j=0; j<arr.length; j++){
//                if ( arr[j] == min){
//                     arr[j] = temp; // hoan doi gia tri cua phan tu thu j
//                }
//            }
//            arr[i] = min;
//        }
//
//        for(int i : arr){
//            System.out.print(i+"\t");
//        }
    }
}
