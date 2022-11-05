package Tree;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
//---------------------------------------------------------------------------------------------------------------------------------------
			//	 public static int idx;
			//	    public static HashMap<Integer,Integer> map;
			//	    public TreeNode buildTree(int[] inorder, int[] postorder) {
			//	        idx=inorder.length-1;
			//	        map=new HashMap<>();
			//	        for(int i=0; i<inorder.length;i++){
			//	            map.put(inorder[i],i);
			//	        }
			//	        return treeBuilder(postorder,0,inorder.length-1);
			//	    }
			//	    
			//	    public static TreeNode treeBuilder(int[] postorder, int left, int right){
			//	        if(left>right) return null;
			//	        
			//	        int val=postorder[idx--];
			//	        TreeNode node=new TreeNode(val);
			//	        int nodeIdx=map.get(val);
			//	        
			//	        node.right=treeBuilder(postorder,nodeIdx+1,right);
			//	        node.left=treeBuilder(postorder,left,nodeIdx-1);
			//	        
			//	        return node;
			//	        
			//	    }	
//---------------------------------------------------------------------------------------------------------------------------------------
}
