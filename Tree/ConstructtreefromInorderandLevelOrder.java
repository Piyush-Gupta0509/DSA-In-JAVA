package Tree;

public class ConstructtreefromInorderandLevelOrder {
//-----------------------------------------------------------------------------------------------------------------------------------
			//	 Node buildTree(int inOrder[], int level[])
			//	    {
			//	        ArrayList<Integer> levelOrder=new ArrayList<>();
			//	        for(int val : level){
			//	            levelOrder.add(val);
			//	        }
			//	        
			//	        return treeBuilder(inOrder,levelOrder,0,inOrder.length-1);
			//	    }
			//	    
			//	    Node treeBuilder(int[] inOrder, ArrayList<Integer> levelOrder, int left, int right){
			//	        if(levelOrder.size()==0) return null;
			//	        
			//	        Node root=new Node(levelOrder.get(0));
			//	        if(levelOrder.size()==1) return root;
			//	        
			//	        HashSet<Integer> leftSideElement=new HashSet<>();
			//	        
			//	        int idx=left;
			//	        while(inOrder[idx]!=levelOrder.get(0)){
			//	            leftSideElement.add(inOrder[idx]);
			//	            idx++;
			//	        }
			//	        
			//	        ArrayList<Integer> leftSideLevelOrder=new ArrayList<>();
			//	        ArrayList<Integer> rightSideLevelOrder=new ArrayList<>();
			//	        
			//	        for(int j=1;j<levelOrder.size();j++){
			//	            if(leftSideElement.contains(levelOrder.get(j))){
			//	                leftSideLevelOrder.add(levelOrder.get(j));
			//	            }else{
			//	                rightSideLevelOrder.add(levelOrder.get(j));
			//	            }
			//	        }
			//	        
			//	        root.left=treeBuilder(inOrder,leftSideLevelOrder, left, idx-1);
			//	        root.right=treeBuilder(inOrder,rightSideLevelOrder, idx+1, right);
			//	        
			//	        return root;
			//	    }
			//	    	

//-----------------------------------------------------------------------------------------------------------------------------------
}
