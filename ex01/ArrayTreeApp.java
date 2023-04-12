package tut09.ex01;

public class ArrayTreeApp {
    public static void main(String[] args) {
        ArrayTree t = new ArrayTree();
        t.addNode("A",-1);
        t.addNode("B",0);
        t.addNode("D",0);
        t.addNode("E",2);
        t.addNode("G",2);
        t.addNode("F",1);
        t.addNode("k",0);

        t.displayAll();
        System.out.println( t.getNodeLabel(t.leftMostChild(2))); //leftMost child of D is E
        System.out.println( t.nearestRightSibling(3)); // nó là thằng tận cùng bên phải rồi => không có nearestRightChild


    }
}
