package Tree;

public class LCAOfBT {
//----------------------------------------------------------------------------------------------------------------------------------
			//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			//        ArrayList<TreeNode> pntrp=ntrp(root,p);
			//        ArrayList<TreeNode> qntrp=ntrp(root,q);
			//        
			//        while(pntrp.size()>0 && qntrp.size()>0 && pntrp.size() != qntrp.size()){
			//            if(pntrp.size() > qntrp.size()){
			//                pntrp.remove(0);
			//            }else{
			//                qntrp.remove(0);
			//            }
			//        }
			//        
			//        if(pntrp.size()==0 && qntrp.size()==0){
			//            return null;
			//        }
			//        
			//        while(pntrp.size()>0 && qntrp.size()>0 && pntrp.get(0).val != qntrp.get(0).val){
			//            pntrp.remove(0);
			//            qntrp.remove(0);
			//        }
			//        
			//        if(pntrp.size()==0 && qntrp.size()==0){
			//            return null;
			//        }
			//        
			//        return pntrp.get(0);
			//        
			//        
			//    }
			//    
			//    public ArrayList<TreeNode> ntrp(TreeNode root,TreeNode node){
			//        if(root==null){
			//            return new ArrayList<TreeNode>();
			//        }
			//        
			//        if(root.val==node.val){
			//            ArrayList<TreeNode> ans=new ArrayList<TreeNode>();
			//            ans.add(root);
			//            return ans;
			//        }
			//        
			//        ArrayList<TreeNode> lans=ntrp(root.left,node);
			//        if(lans.size()>0){
			//            lans.add(root);
			//            return lans;
			//        }
			//        ArrayList<TreeNode> rans=ntrp(root.right,node);
			//        if(rans.size()>0){
			//            rans.add(root);
			//            return rans;
			//        }
			//        return new ArrayList<TreeNode>();
			//    }	
//----------------------------------------------------------------------------------------------------------------------------------
}
