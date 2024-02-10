import java.util.ArrayList;


/**
 * level order traversal
 *              4
 *             / \
 *            5   1
 *           / \
 *          7   9
 *        left view-: 4 5 7
 */
public class PrintLeftView {
    public static void printLeft(Node root){
        ArrayList<Node> list=new ArrayList<>();
        printLeftViewUtile(root,list,0);
        for(Node curr:list)
            if(curr!=null)
               System.out.print(curr.data + " ");
    }

    private static void printLeftViewUtile(Node root, ArrayList list, int i) {
        if(root==null)
            return;
        list.add(null);
        if(list.get(i)==null){
            list.set(i,root);
        }
        printLeftViewUtile(root.left,list,i+1);
        printLeftViewUtile(root.right,list,i+1);
    }
}
