
/**
 * Class SLList implement a linked-list data structure. Each element of the list is a string.
 * Please refer to Lecture 6 for the detail Linked-List ADT.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package dsa.tut.tut06.linkedlist;

public class SLList
{
    private SLNode head;

    /**
     * Constructor for objects of class SLList.
     * This constructor will create an empty list.
     */
    public SLList()
    {
        head=null;
    }

    /**
     * This operation returns true if the list is empty, otherwise it returns false
     */

    public boolean isEmpty()
    {
        return true;
    }

    /**
     * This operation adds a newNode into the beginning of the list
     */

    public void add(SLNode newNode)
    {
    	
        
    }

    /**
     * This is a private operation (supplementary operation). It returns the node at the pos position of the list.
     */    
    private SLNode traversing(int pos)
    {
        return null;
    }

    /**
     * This operation adds a newNode right at the pos position of the list.
     */

    public void addAt(int pos, SLNode newNode)//addAt(3, node ABC)
    {
        
    }

    /**
     * This operation delete the node at the pos postition of the list.
     */    
  
    public void remove(int pos)//remove(2)
    {
                
      
    }

    /**
     * This operation remove all nodes from the list.
     */    
    public void removeAll()
    {
        
    }

    /**
     * This operation returns the node at the pos position of the list.
     */    
    public SLNode get(int pos)
    {
        return null;
    }

    /**
     * This operation returns the current length of the list. 
     */    
  
    public int getLength()
    {
        return 0;
    }
    
    /**
     * This operation search for a string in the list. 
     * If found the operation returns the position of the node contain this string, otherwise it returns -1. 
     */    
    public int search(String data)
    {
    	 return  0;
    }
}