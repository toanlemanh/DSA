/**
 * Class ArrayList implements an array-based list data structure. Each element of the list is an integer.
 * Please refer to Lecture 6 for the array-based list ADT in detail. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package dsa.tut.tut06.arraybasedlist;
public class ArrayList
{
    private int[] items;
    private static final int maxSize=100;
    private int length;
    /**
     * Constructor for objects of class ArrayList.
     * This constructor creates an empty list.
     */
    public ArrayList()
    {
        items=new int[maxSize];
        length=0;
    }

    /**
     * This operation returns true if the list is empty, otherwise it returns false
     */    
    public boolean isEmpty()
    {
        return ( length == 0);
    }

    /**
     * This operation returns the current length of the list. 
     */        
    public int getLength()
    {
      return length;
    }

    /**
     * This operation adds a newNode at the pos position of the list.
     */

    public void add(int pos, int newItem)
    {
//        if ( pos <= 1 ){
//            add (2, newItem);
//        }
        int i = length;
        while (i >= pos){
            items[i] = items [i-1];
            i--;
        }
        items [pos-1] = newItem ;
        length++;
       // neu khong co hat nao, length = 0
        // them mot hat vao ntn
        // day het hat tai vi tri pos sang ben phai de tao khoang trong

    }

    /**
     * This operation delete the node at the pos postition of the list.
     */  
   
    public void remove(int pos) {
        if (pos <= 0)
            remove(0);
        int i = pos-1;
        //shift to the right until pos-1 th index
        while ( i < length-1 ){
            items[i] = items[i+1]; // phan tu cuoi cung co index =  length - 1
            i++;
        }
        length--;
    }
    
    /**
     * This operation remove all nodes from the list.
     */        
    public void removeAll()
    {
        length = 0;
    }

    /**
     * This operation returns the node at the pos position of the list.
     */        
    public int get(int pos)
    {
        return items [pos-1];
    }
}