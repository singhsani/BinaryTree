import java.util.LinkedList;
import java.util.Queue;

/**
 * level order traversal using Queue
 *              4
 *             / \
 *            5   1
 *           / \
 *          7   9
 *        output -: 4 5 1 7 9
 */
public class LevelOrderUsingQueue {
    public static void levelOrderUsingQueue(Node root){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        if(root==null){
            return;
        }
        while (!queue.isEmpty()){
            Node curr=queue.poll();
            System.out.print(curr.data+" ");
            if(curr.left !=null){
                queue.add(curr.left);
            }
            if(curr.right !=null){
                queue.add(curr.right);
            }
        }

    }
}
