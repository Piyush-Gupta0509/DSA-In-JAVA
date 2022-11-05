package Tree;

public class AllNodesDistanceKinBinaryTree {
//-------------------------------------------------------------------------------------------------------------------------------------------
//	/**
//	 * Definition for a binary tree node.
//	 * public class TreeNode {
//	 *     int val;
//	 *     TreeNode left;
//	 *     TreeNode right;
//	 *     TreeNode(int x) { val = x; }
//	 * }
//	 */
//	class Solution {
//	    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//	       ArrayList<TreeNode> ntrp = nodeToRootPath(root,target.val);
//	       ArrayList<Integer> ans=new ArrayList<>();
//	        
//	       for(int i=0; i<ntrp.size(); i++){
//	           if(i==0){
//	               printKlevelDown(ntrp.get(i),k-i,ans,null);
//	           }else{
//	              printKlevelDown(ntrp.get(i),k-i,ans,ntrp.get(i-1)); 
//	           }
//	       }
//	        return ans;
//	        
//	    }
//	    
//	    public ArrayList<Integer> printKlevelDown(TreeNode root, int k, ArrayList<Integer> ans, TreeNode Blocker){
//	        if( root==null ||k<0 || root==Blocker){
//	            return ans;
//	        }
//	        
//	        if(k==0){
//	            ans.add(root.val);
//	            return ans;
//	        }
//	        
//	        printKlevelDown(root.left,k-1,ans, Blocker);
//	        printKlevelDown(root.right,k-1,ans, Blocker); 
//	        return ans;
//	    }
//	    
//	    public ArrayList<TreeNode> nodeToRootPath (TreeNode root, int target){
//	        if(root==null){
//	            return new ArrayList<TreeNode>();
//	        }
//	        
//	        if(root.val==target){
//	            ArrayList<TreeNode> ans=new ArrayList<>();
//	            ans.add(root);
//	            return ans;
//	        }
//	        
//	        ArrayList<TreeNode> Lans = nodeToRootPath(root.left,target);
//	        ArrayList<TreeNode> Rans = nodeToRootPath(root.right,target);
//	        
//	        if(Lans.size()>0){
//	            Lans.add(root);
//	            return Lans;
//	        }
//	        if(Rans.size()>0){
//	            Rans.add(root);
//	            return Rans;
//	        }
//	        
//	        return new ArrayList<TreeNode>();
//	    }
//	    
//	    
//	}
	
	
//------------------------------------------------------------------------------------------------------------------------------------------	
	
}
