package Tree;

public class N_aryTreePreorderTraversal {
	
	//----------------------RECURSIVE SOLUTION----------------------------------------------------------
	
//	public List<Integer> preorder(Node root) {
//	       ArrayList<Integer> list=new ArrayList<>();
//	        if(root==null){ return list;}
//	        helper(root,list);
//	        return list;
//	    }
//	    
//	    public void helper(Node node, ArrayList<Integer> list){
//	        if(node.children==null) return ;
//	        list.add(node.val);
//	        for(Node child:node.children){
//	            helper(child,list);
//	        }
//	    }
	
	//-------------------------------------------------------------------------------------------------------
	
	//--------------------ITERATIVE SOLUTION--------------------------------------------------------------
	
//	public List<Integer> preorder(Node root) {
//	       ArrayList<Integer> list=new ArrayList<>();
//	        if(root==null){ return list;}
//	        Stack<Node> st=new Stack<>();
//	        st.push(root);
//	        while(st.size()>0){
//	            Node temp=st.pop();
//	            list.add(temp.val);
//	            for(int i=temp.children.size()-1;i>=0;i--){
//	                st.push(temp.children.get(i));
//	            }
//	        }
//	        return list;
//	    }
}
