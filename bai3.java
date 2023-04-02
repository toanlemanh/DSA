package Sap_xep;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Get a binary code");
        String bin = sc.nextLine();

        int n = bin.length();
        int sum = 0;
        int bin_arr [] = new int [n];

        for (int i=0; i<n; i++){
            bin_arr [i] = Integer.parseInt(bin.charAt(i)+"");
            sum = (int) (Math.pow(2,n-1-i)* bin_arr[i]) + sum; // type cast : put the name of type in the parentheses
            // Be careful with Math operations
        }
        System.out.println("Decimal number :" + sum);

//        Integer arr = Integer.valueOf("01");
//        can use Integer.valueOf(String) to convert a string into Integer Object
//        System.out.println(arr);

        String str = String.valueOf(bin.charAt(3));
        System.out.println(str);



    }
}
