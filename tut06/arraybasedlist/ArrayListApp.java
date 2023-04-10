/**
 * Write a description of class ArrayListApp here.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package dsa.tut.tut06.arraybasedlist;

import java.util.Arrays;

public class ArrayListApp
{

    /**
     * Constructor for objects of class ArrayListApp
     */
    public ArrayListApp()
    {
    }

    public static void printList(ArrayList list)
    {
       for (int i = 1; i <= list.getLength() ; i++){
           System.out.print( list.get(i) + " ");
       }
    }

    public static void main(String[]args)
    {
        ArrayList myList=new ArrayList();
        myList.add(1,100);  
        myList.add(2,200);
        myList.add(2,300);
        myList.add(4,400);
        printList(myList);
        //remove the 2nd item in the list
   //     myList.remove(2);     					System.out.println(myList.getLength());
  //      printList(myList);
        System.out.println("Is the list empty? " + myList.isEmpty());
        myList.removeAll();
        System.out.println("Is the list empty? " + myList.isEmpty());        
        myList.add(1,1000);
        myList.add(2,2000);
        printList(myList);
    }    
}
