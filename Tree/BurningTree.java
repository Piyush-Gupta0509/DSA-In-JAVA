package Tree;

public class BurningTree {
//------------------------------------------------------------------------------------------------------------------------------------
			//	public static int getHeight(Node node, Node blocker){
			//        if(node==null || node==blocker){
			//            return 0;
			//        }
			//        int lh=getHeight(node.left,blocker);
			//        int rh=getHeight(node.right,blocker);
			//        
			//        if(lh>rh){
			//            return lh+1;
			//        }
			//        return rh+1;
			//    }
			//    
			//    public static ArrayList<Node> ntrp(Node node, int target){
			//        if(node==null){
			//            return new ArrayList<Node>();
			//        }
			//        
			//        if(node.data==target){
			//            ArrayList<Node> ans=new ArrayList<Node>();
			//            ans.add(node);
			//            return ans;
			//        }
			//        
			//        ArrayList<Node> lans=ntrp(node.left,target);
			//        ArrayList<Node> rans=ntrp(node.right,target);
			//        
			//        if(lans.size()>0){
			//            lans.add(node);
			//            return lans;
			//        }
			//        
			//        if(rans.size()>0){
			//            rans.add(node);
			//            return rans;
			//        }
			//        
			//         return new ArrayList<Node>();
			//    } 
			//    
			//    public static int time;
			//    
			//    public static int minTime(Node root, int target) 
			//    {
			//        time=0;
			//        ArrayList<Node> ntrpList=ntrp(root,target);
			//        for(int i=0; i<ntrpList.size(); i++){
			//            if(i==0){
			//                int temptime=i+getHeight(ntrpList.get(i),null)-1;
			//                if(temptime>time){
			//                    time=temptime;
			//                }
			//            }else{
			//                int temptime=i+getHeight(ntrpList.get(i),ntrpList.get(i-1))-1;
			//                if(temptime>time){
			//                    time=temptime;
			//                }
			//            }
			//        }
			//        return time;
			//        
			//    }
//------------------------------------------------------------------------------------------------------------------------------------
}
