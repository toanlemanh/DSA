package dynamiclist;
import dynamiclist.LinkedList.Node;
public class Main {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.head = new Node(1);
        Node p1 = new Node (3);
        Node p2 = new Node (4);
        link.head.setNextNode(p1);
        p1.setNextNode(p2);
        p2.setNextNode(new Node(23));
        link.head.toPrint(link.head);
        link.head.toReverse();
    }
}
