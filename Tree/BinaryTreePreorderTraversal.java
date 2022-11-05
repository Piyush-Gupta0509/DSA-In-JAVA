package Tree;

public class BinaryTreePreorderTraversal {
// Here we will use Morris Algorithm as it is the best algorithm and it uses O(1)space complexity
	
	
	public static void main(String[] args) {
//		public List<Integer> preorderTraversal(TreeNode root) {
//	        List<Integer> res=new ArrayList<Integer>();
//	        
//	        while(root!=null){
//	            if(root.left==null){
//	                res.add(root.val);
//	                root = root.right;
//	                    
//	            }else{
//	                TreeNode node=root.left;
//	                while(node.right!=null && node.right!=root){
//	                    node=node.right;
//	                }
//	                if(node.right==null){
//	                    res.add(root.val);
//	                    node.right = root; // connect
//	                    root = root.left;
//	                    
//	                }else if(node.right==root){
//	                    node.right=null;
//	                    root=root.right;
//	                    
//	                }
//	            }
//	        }
//	        return res;
//	    }
//	    
//	    public static TreeNode findlastRightNode(TreeNode node){
//	        if(node==null){
//	            return node;
//	        }
//	        return node.right;
//	    }
	}

}
