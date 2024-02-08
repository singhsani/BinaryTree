/**
 *  find the max number between left sub tree and right sub tree +1
 *                 4
 *  *             / \
 *  *            3   5
 *  *           / \
 *  *          2   8
 *  *         /\
 *  *        2  1
 */
public class HightOfBinaryTree {
    public static void main(String[] args) {
        Node root=BinaryTree.createTree();
        System.out.println(hightOfBinaryTree(root));
    }

    private static int hightOfBinaryTree(Node root) {
        if(root==null)
            return 0;
        return Math.max(hightOfBinaryTree(root.left),hightOfBinaryTree(root.right))+1;
    }
}
