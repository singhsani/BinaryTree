import java.util.ArrayList;

/**
 * level order traversal
 *              4
 *             / \
 *            5   1
 *           / \
 *          7   9
 *        left view-: 4 1 9
 */
public class PrintRightViewTree {
    public static void printRigthView(Node root){
        ArrayList<Node> list =new ArrayList<>();
        printRightViewUtil(root,list,0);
        for(Node curr:list){
            if(curr!=null)
                 System.out.print(curr.data + " ");
        }
    }

    private static void printRightViewUtil(Node root, ArrayList<Node> list, int i) {
        if(root == null)
            return;
        list.add(null);
        if(list.get(i) == null)
               list.set(i,root);
        printRightViewUtil(root.right,list,i+1);
        printRightViewUtil(root.left,list,i+1);
    }
}
