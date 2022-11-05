package Tree;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
//--------------------------------------------------------------------------------------------------------------------------------------
			//	 public static int idx;
			//	    public static HashMap<Integer,Integer> map;
			//	    public TreeNode buildTree(int[] preorder, int[] inorder) {
			//	        idx=0;
			//	        map=new HashMap<>();
			//	        for(int i=0; i<inorder.length;i++){
			//	            map.put(inorder[i],i);
			//	        }
			//	        return treeBuilder(preorder,0,inorder.length-1);
			//	    }
			//	    
			//	    public static TreeNode treeBuilder(int[] preorder, int left, int right){
			//	        if(left>right) return null;
			//	        
			//	        int val=preorder[idx++];
			//	        TreeNode node=new TreeNode(val);
			//	        int nodeIdx=map.get(val);
			//	        
			//	        node.left=treeBuilder(preorder,left,nodeIdx-1);
			//	        node.right=treeBuilder(preorder,nodeIdx+1,right);
			//	        return node;
			//	        
			//	    }	
//--------------------------------------------------------------------------------------------------------------------------------------
}
