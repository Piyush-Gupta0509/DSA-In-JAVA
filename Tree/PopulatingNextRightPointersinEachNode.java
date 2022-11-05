package Tree;

public class PopulatingNextRightPointersinEachNode {
	/*
	// Definition for a Node.
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
	*/

	
//	    public Node connect(Node root) {
//	        if(root==null){ return root;}
//	        Queue<Node> q=new ArrayDeque<>();
//	        q.add(root);
//	        
//	        while(q.size()>0){
//	            
//	            int s=q.size();
//	            while(s>0){
//	                if(s==1){
//	                    Node temp=q.remove();
//	                    if(temp.left!=null){
//	                        q.add(temp.left);
//	                    }
//	                    if(temp.right!=null){
//	                        q.add(temp.right);
//	                    }
//	                    temp.next=null;
//	                }
//	                else{
//	                    Node temp=q.remove();
//	                    if(temp.left!=null){
//	                        q.add(temp.left);
//	                    }
//	                    if(temp.right!=null){
//	                        q.add(temp.right);
//	                    }
//	                    temp.next=q.peek();
//	                    
//	                }
//	                s--;
//	                
//	            }
//	        }
//	        return root;
//	    }
//	
}
