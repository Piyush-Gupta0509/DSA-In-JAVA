package Tree;

public class LeftViewOfABinaryTree {
//-------------------------------------------------------------------------------------------------------------------------------------
                                     //Using BFS/Level-order traversal
	
								//	ArrayList<Integer> leftView(Node root)
								//    {
								//      ArrayList<Integer> ans=new ArrayList<>();
								//      if(root==null) return ans;
								//      Queue<Node> q=new ArrayDeque<>();
								//      
								//      q.add(root);
								//      while(q.size()>0){
								//          int s=q.size();
								//          int k=q.size();
								//          while(s>0){
								//              Node temp=q.remove();
								//              if(s==k){
								//                  ans.add(temp.data);
								//              }
								//              if(temp.left!=null){
								//                  q.add(temp.left);
								//              }
								//              if(temp.right!=null){
								//                  q.add(temp.right);
								//              }
								//              s--;
								//          }
								//      }
								//      return ans;
								//    }
	
//-------------------------------------------------------------------------------------------------------------------------------------
	                                			// Using DFS
	
								//	ArrayList<Integer> leftView(Node root)
								//    {
								//	ArrayList<Integer> ans=new ArrayList<>();
								//    helper(root,0,ans);
								//    return ans;
								//    }
								//    
								//    public static void helper(Node root, int level, ArrayList<Integer>ans){
								//        if(root==null) return;
								//        if(level==ans.size()){
								//            ans.add(root.data);
								//        }
								//        helper(root.left,level+1,ans);
								//        helper(root.right,level+1,ans);
								//    }
//----------------------------------------------------------------------------------------------------------------------------------------
}
