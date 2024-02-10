/**
 *                 4
 *  *             / \
 *  *            3   5
 *  *           / \
 *  *          2   8
 *  *         /\
 *  *        2  1
 */

import java.util.Scanner;
public class BinaryTree {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
      Node root=createTree();
     // printPreOrder(root);

        /**
         * print data in level order
         * O(n^2)
         */
//      HightOfBinaryTree h=new HightOfBinaryTree();
//      for(int i=1;i<=h.hightOfBinaryTree(root);i++){
//          LevelOrderTraversal.levelOrderTraversal(root,i);
//      }
        /**
         * print data in level order using queue data structer
         * O(n)
         */
//        LevelOrderUsingQueue UsingQueue=new LevelOrderUsingQueue();
//        UsingQueue.levelOrderUsingQueue(root);
//        LevelOrderPrintLineByLine lineByLine=new LevelOrderPrintLineByLine();
//        lineByLine.printLevelLineByLine(root);
//        PrintLeftView printLeftView=new PrintLeftView();
//        printLeftView.printLeft(root);
        PrintRightViewTree printRightViewTree=new PrintRightViewTree();
        printRightViewTree.printRigthView(root);
    }

    private static void printPreOrder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static Node createTree() {
        Node root=null;
        System.out.println("enter data-:");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("enter the left childe : ");
        root.left=createTree();
        System.out.println("enter the right child -:");
        root.right=createTree();
        return root;
    }
}
