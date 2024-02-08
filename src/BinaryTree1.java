/**
 *                 4
 *  *             / \
 *  *            3   5
 *  *           / \
 *  *          2   8
 *  *         /\
 *  *        2  1
 *  output for in order -: 2 2 1 3 8 4 5
 *  output for preOrder -: 4 3 2 2 1 8 5
 *  output for postOrder -: 2 1 2 8 3 5 4
 */

public class BinaryTree1 {
    public static void main(String[] args) {
        Node root=createNewTree();
        printPostOrder(root);
        printInOrder(root);
    }

    private static void printInOrder(Node root) {
        if(root ==null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    private static void printPostOrder(Node root) {
        if(root == null){
            return ;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static Node createNewTree() {
        Node root=null;
        System.out.println("enter the data-: ");
        int data=BinaryTree.sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("enter the left data : ");
        root.left=createNewTree();
        System.out.println("enter the right data : ");
        root.right=createNewTree();
        return root;

    }
}
