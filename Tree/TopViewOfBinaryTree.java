package Tree;

public class TopViewOfBinaryTree {
//-----------------------------------------------------------------------------------------------------------------------------------------
					//	static ArrayList<Integer> topView(Node root)
					//    {
					//        Queue<Pair> q=new ArrayDeque<>();
					//        HashMap<Integer,Pair> map=new HashMap<>();
					//        ArrayList<Integer> ans=new ArrayList<>();
					//        int maxlevel=0;
					//        int minlevel=0;
					//        if(root==null) return ans;
					//        
					//        
					//        q.add(new Pair(0,root));
					//        
					//        while(q.size()>0){
					//            Pair temp=q.remove();
					//            int tlevel=temp.level;
					//            Node tnode=temp.node;
					//            
					//            maxlevel=Math.max(maxlevel,tlevel);
					//            minlevel=Math.min(minlevel,tlevel);
					//            
					//            if(!map.containsKey(tlevel)){
					//               map.put(tlevel,new Pair(tlevel,tnode)); 
					//            }
					//            if(tnode.left!=null){
					//                q.add(new Pair(tlevel-1,tnode.left));
					//            }
					//            if(tnode.right!=null){
					//                q.add(new Pair(tlevel+1,tnode.right));
					//            }
					//        }
					//        
					//        while(minlevel<=maxlevel){
					//            ans.add(map.get(minlevel).node.data);
					//            minlevel++;
					//        }
					//        
					//        return ans;
					//        
					//    }
//-----------------------------------------------------------------------------------------------------------------------------------------
}
