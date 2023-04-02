package Sap_xep;

import java.util.Scanner;

public class space_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for (int i=0; i<str.length()-1; i++){
            if ( str.charAt(i)== ' '){
                count++;
            }
        }
        System.out.println(count);

//        for (int i=0; i<str.length()-1; i++){
//            String n = Character.toString(str.charAt(i));
//            if  (n.equals(" ")){
//                count++;
//            }
//        }
//        System.out.println(count);

    }
}
