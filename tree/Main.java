package implementations.tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree t3 = new BinaryTree();
        t3.buildTreeByValue("2",null,null);



        BinaryTree t4 = new BinaryTree();
        t4.buildTreeByValue("6","5","11");

        BinaryTree t2 = new BinaryTree();
        t2.buildTree("0",t3,t4);
//        t4.postOrderTree(t2);
        t4.inOrderTree(t2);

        BinaryTree t0 = new BinaryTree();
        BinaryTree t1 = new BinaryTree();
        t1.buildTreeByValue("100","200","300");
        t0.buildTree("-1",t2,t1);
//        System.out.println(  t0.toString());

        BinaryTree t5 = new BinaryTree();
        t5.buildTreeByValue("999",null,null);
        t5.buildTree("3",t0,new BinaryTree());
        //       t5.buildTree("3",t0,null);

   //    t0.preOrderTree(t5);

//        int depth = t0.getDepth(t4);
//        System.out.println("The depth of tree t4: "+depth);
//       System.out.println("The number of leaves of tree t0: "+ t0.countLeaves(t0));
//        System.out.println(t3.isLeaf());
//        System.out.println(t1.isLeaf());
  //      int depth = t3.getDepth(t3);

    }
}
