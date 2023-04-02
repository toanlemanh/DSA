package Sap_xep;

import java.util.Scanner;

public class Binary_Convert {
    public static int to_Binary(int n) {
        if (n > 0) {
            to_Binary(n / 2);  // implement the binary division until the result gets zero
            System.out.println(n % 2);
        }
//        base case remainder = 0
        return -1;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = 7;
        to_Binary(n);

    }
}
