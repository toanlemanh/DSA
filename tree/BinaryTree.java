package implementations.tree;

import utils.NotPossibleException;

public class BinaryTree {
    private Node root;
    private BinaryTree leftTree;
    private BinaryTree rightTree;

    /** @Note
     *    Nếu một đối tượng được tạo ra nhưng không gán giá trị, nó vẫn được cấp phát một ô nhớ trong heap, tuy nhiên nội dung cuả nó bằng null
     *   Nếu sử dụng == để so sánh nó sẽ so sánh địa chỉ ô nhớ (reference) hai object đó
     *   Nếu sử dụng equals () nó sẽ so sánh giá trị mà hai object giữ
     *   => Trong trường hợp này, ta sử dụng hàm equals ()
     *   Tuy nhiên nếu object ta nghi ngờ là null mà gọi hàm equals ra thì sẽ bị nullpointer
     *
     *   *Trường hợp nếu người dung truyền một hàm khởi tạo, tuy nhiên giá trị của nó mặc định là null, đồng thời cũng ko thể dùng hàm equals lẫn ==
     *
     *
     *   => SOLUTION: Đối với trường hợp được khởi tạo mà không được gán giá trị; ta vẫn có thể invoke thuộc tính của nó
     *
     *    Khi một biến reference không trỏ đến đổi tượng nào, (hoặc được gán giá trị null) sẽ hiểu là giá trị của nó là null
     *          => và sẽ được Garbage Collector quản lý và xóa
     *    HIỂU LẦM : Khi một đối tượng được tạo ra mà không được gán giá trị thì nó sẽ  nhận giá trị null
     *
     *    => HIỂU ĐÚNG: Các thuộc tính của nó sẽ được gán giá trị mặc định chứ không phải bản thân đối tượng đó được gán là null
     */
    public void buildTree (String label, BinaryTree leftTree, BinaryTree rightTree) throws NotPossibleException {
        if (label != null) {
            root = new Node(label);
            BinaryTree lClone = leftTree;
            BinaryTree rClone = rightTree;
//            if (rightTree != null){
//                this.rightTree = rightTree;
//            }

//            if ( lClone != null ){
//                this.leftTree = leftTree;
//            }
//            if ( rClone != null ){
//                this.rightTree = rightTree;
//            }
            if ( (lClone instanceof  BinaryTree) && leftTree.root != null)
                this.leftTree = leftTree;
            if ( ( rClone instanceof BinaryTree) && rightTree.root != null)
                this.rightTree = rightTree;
        }
        else throw new NotPossibleException("Invalid Tree");


    }
    public void buildTreeByValue (String label, String left, String right) throws NotPossibleException{
        // BinaryTree tree = new BinaryTree();
//
//        tree.root =new Node (label);
//        BinaryTree subLeftTree = tree.leftTree;
//        BinaryTree subRightTree = tree.rightTree;
//        subLeftTree.root = new Node (left);
//        subRightTree.root = new Node (right);   => NulPointerException
//          return tree;

//      if we enable users to input 'null' as a string, it means that the node contains the exact value ("null") as not similar as NULL (as object has no reference)
// check the valid value of left, right or root node
        if (label != null) {
            this.root = new Node (label);
        }
        else throw new NotPossibleException("Invalid Tree");

        if (left != null) {
            Node leftChild = new Node(left);
            BinaryTree subLeftTree = new BinaryTree(); // In case, it doesn't contain any subtrees, so the left and right tree is null
            subLeftTree.setRoot(leftChild);
            this.leftTree = subLeftTree;
        }

        if (right != null ){
            Node rightChild = new Node(right);
            BinaryTree subRightTree = new BinaryTree();
            subRightTree.setRoot(rightChild);
            this.rightTree = subRightTree;
        }

    }
    public String getTreeValue() throws NotPossibleException{
        if ( root != null)
        return root.getLabel();
        else throw new NotPossibleException("Null");
    }

    public void setTreeValue(String value) {
        this.root.setLabel(value);
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    public BinaryTree getLeftTree() {
        return leftTree;
    }

    public BinaryTree getRightTree() {
        return rightTree;
    }



    public static int  i = 0;

    /**
     *
     * @effect return the label of node following  Root |  Left | Right with all subtrees
     */
    public void preOrderTree(BinaryTree root){
        if (  (root != null ) ){

            System.out.println( (i++) + " : "+root.getTreeValue());
            preOrderTree(root.getLeftTree());
            preOrderTree(root.getRightTree());
        }
    }

/**
 *  Both postOrder and inOrder traverse child node until getting a leaf
 *    The traverse order is bottom-up printed
  */
    /**
     *
     * @effect return the label of node following   Left | Right | Root with all subtrees
     */

     public void postOrderTree (BinaryTree root){
           if ( !root.isLeaf() ){
              postOrderTree( root.getLeftTree());
              postOrderTree( root.getRightTree());
           }
           //base case:root is leaf

         System.out.println( root.getTreeValue() );

    }

    /**
     *
     * @effect return the label of node following  Left | Root | Right  with all subtrees
     */

    public void inOrderTree (BinaryTree root){
        if ( !root.isLeaf() ){
            inOrderTree( root.getLeftTree() );
        }

        System.out.println( root.getTreeValue());

        if ( !root.isLeaf()) {
            inOrderTree(root.getRightTree());
        }
    }
    public Node getRoot() {
        return root;
    }

    public boolean isLeaf (){
//        return ( this.getLeftTree().isNull(this.getLeftTree()) && this.getRightTree().isNull(this.getRightTree()));
//        return (this.getLeftTree().getRoot().equals(null) && this.getRightTree().getRoot().equals(null) );
//        return (this.isNull());
       return ( this.getLeftTree()== null && this.getRightTree() == null);

    }

    public int getDepth (BinaryTree any){
        if ( any == null) return 0;
        boolean check =  any.isLeaf();
         if (check ) return 0;
        else {
            int depth = Math.max ( getDepth( any.getLeftTree()) + 1, getDepth( any.getRightTree() ) + 1);
            return depth;
        }
    }

    public int countLeaves (BinaryTree any){
        int leaf = 0;
        if ( any == null ) return 0;
        else if ( any.isLeaf()) return 1;
        else {
             leaf = leaf + countLeaves( any.getLeftTree()) + countLeaves( any.getRightTree());
        }
        return leaf;
    }
}
