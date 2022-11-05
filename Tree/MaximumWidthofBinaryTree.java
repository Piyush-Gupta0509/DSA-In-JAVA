package Tree;

public class MaximumWidthofBinaryTree {
//----------------------------------------------------------------------------------------------------------------------------------------
//	public static class Pair{
//        TreeNode node;
//        int idx;
//        Pair(TreeNode node,int idx){
//            this.node=node;
//            this.idx=idx;
//        }
//    }
//    public int widthOfBinaryTree(TreeNode root) {
//        if(root==null) return 0;
//        
//        Queue<Pair> q=new ArrayDeque<>();
//        int max=0;
//        q.add(new Pair(root,0));
//        
//        while(q.size()>0){
//            int s=q.size();
//            int left=q.peek().idx;
//            int right=q.peek().idx;
//            while(s-->0){
//                Pair temp=q.remove();
//                right=temp.idx;
//                if(temp.node.left!=null){
//                    q.add(new Pair(temp.node.left,2*temp.idx+1));
//                }
//                if(temp.node.right!=null){
//                    q.add(new Pair(temp.node.right,2*temp.idx+2));
//                }
//            }
//            max=Math.max(max,right-left+1);
//        }
//        return max;
//    }	
//----------------------------------------------------------------------------------------------------------------------------------------
}
