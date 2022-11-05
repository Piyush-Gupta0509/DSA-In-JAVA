package Tree;
import java.util.*;

public class SerializeandDeserializeBinaryTree {
	
//	public String serialize(TreeNode root) {
//        StringBuilder sb=new StringBuilder();
//        serializehelper(root,sb);
//        return sb.toString();
//    }
//    
//    private void serializehelper(TreeNode root,StringBuilder sb){
//        if(root==null){
//            sb.append("null ");
//            return;
//        }
//        sb.append(root.val+" ");
//        serializehelper(root.left,sb);
//        serializehelper(root.right,sb);
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        String[] str=data.split(" ");
//        this.idx=0;
//        return deserializehelper(str);
//    }
//    
//    static int idx;
//    private TreeNode deserializehelper(String[] str){
//        if(idx==str.length){
//            return null;
//        }
//        if(str[idx].equals("null")){
//            return null;
//        }
//        TreeNode node=new TreeNode(Integer.parseInt(str[idx]));
//        idx++;
//        node.left=deserializehelper(str);
//        idx++;
//        node.right=deserializehelper(str);
//        
//        return node;
//
//    }
}
