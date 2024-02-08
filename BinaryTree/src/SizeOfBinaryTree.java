/**
 * size of binary tree = length of left sub tree + lenght of right sub tree +1
 *              4
 *             / \
 *            3   5
 *           / \
 *          2   8
 *         /\
 *        2  1
 */
public class SizeOfBinaryTree {
    public static int sizOfBinaryTree(Node root){
        if(root==null)
            return 0;
        return (sizOfBinaryTree(root.left)+sizOfBinaryTree(root.right)) +1;
    }
}
