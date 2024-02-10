import java.util.LinkedList;
import java.util.Queue;

/**
 * level order traversal
 *              4
 *             / \
 *            5   1
 *           / \
 *          7   9
 *        output -: 4
 *                  5 1
 *                  7 9
 */
public class LevelOrderPrintLineByLine {
    public static void printLevelLineByLine(Node root){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        if(root==null){
            return;
        }
        while (!queue.isEmpty()){
            Node curr=queue.poll();
            if(curr == null){
                if(queue.isEmpty())
                     return;
                queue.add(null);
                System.out.println();
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                queue.add(curr.left);
            if(curr.right!=null)
                queue.add(curr.right);
        }
    }
}
