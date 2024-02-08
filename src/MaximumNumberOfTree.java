/**
 * find the max value from (root data ,max(left child,right child))
 *                 4
 *  *             / \
 *  *            3   5
 *  *           / \
 *  *          2   8
 *  *         /\
 *  *        2  1
 */

import static java.lang.Integer.MIN_VALUE;

public class MaximumNumberOfTree {
    public static Integer maxNumberOfTree(Node root){
        if(root == null){
            return  MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maxNumberOfTree(root.left),maxNumberOfTree(root.right)));
    }
}
