package Tree;

public class BinaryTreeToDoublyLinkedList {
//--------------------------------------------------------------------------------------------------------------------------------------
					//	Node getTail(Node root){
					//        while(root.right!=null){
					//            root=root.right;
					//        }
					//        return root;
					//    }
					//    
					//    
					//    Node bToDLL(Node root)
					//    {
					//	if(root==null){
					//	    return root;
					//	}
					//	
					//	Node lres= bToDLL(root.left);
					//	Node rres= bToDLL(root.right);
					//	
					//	if(lres==null && rres==null){
					//	    return root;
					//	}
					//	
					//	else if(lres==null){
					//	    root.right=rres;
					//	    rres.left=root;
					//	    lres=root;
					//	}
					//	
					//	else{
					//	    Node tnode=getTail(lres);
					//	    tnode.right=root;
					//	    root.left=tnode;
					//	    
					//	    if(rres!=null){
					//	        root.right=rres;
					//	    rres.left=root;
					//	    }
					//	}
					//	return lres;
					//    }
//--------------------------------------------------------------------------------------------------------------------------------------
}
