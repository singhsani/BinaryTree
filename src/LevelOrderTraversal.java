/**
 * level order traversal
 *              4
 *             / \
 *            5   1
 *           / \
 *          7   9
 *        output -: 4 5 1 7 9
 */
public class LevelOrderTraversal {
    public static void levelOrderTraversal(Node root,int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.data+" ");
        }
        if(level>1){
            levelOrderTraversal(root.left,level-1);
            levelOrderTraversal(root.right,level-1);
        }
    }
}
