package dynamiclist;

public class LinkedList {
    public Node head;
    public static class Node {
        private int data;
        private Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
        public Node getNextNode (){
            return this.next;
        }
        public void setNextNode (Node next){
            this.next = next;
        }
        public int getData (){
            return this.data;
        }
        public void setData (int data){
            this.data = data;
        }
        public void toPrint (Node head){
            Node pointer = head;
            System.out.print("[");
            while (pointer != null){
                System.out.print(pointer.data +"  ");
                // pointer = pointer.getNode();
                pointer = pointer.next;
            }
            System.out.println("]");
        }
        // reverse LinkedList
        public void toReverse (){
            // tao ra 3 node prev, curr va next
//         Node prev de cap nhat Node o phia truoc , Node cur de duy tri vong lap, Node next de luu Node tiep theo theo thu tu ban dau
//        sau do Node tiep theo ma cur.next phai tro den se duoc gan cho prev (curr.next = prev )
//        (day la buoc hinh thanh dao nguoc Node)
//        sau do cap nhat prev Node thanh current Node ( prev = curr ) de lam preNode cho Node tiep theo tro NGUOC LAI
//        Node curr se duoc cap nhat theo Node next da luu truoc do ( curr = next )
            Node prev = null, curr = this, next = null;
            while ( curr != null ){
                next = curr.next;  // store the actual next Node (thu tu ban dau Node nay se la NOde tiep theo)
                curr.next = prev; // point nguoc lai vao Node dang truoc no bang cach gan curr.next = prev
                prev = curr;    // cap nhat lai Node prev, truoc khi tiep tuc viec point next Node
                curr = next;    //  tro den Node tiep theo (theo thu tu ban dau)
            }
            // At line, curr = null
            curr = prev;
            toPrint(curr);
        }
    }
}
