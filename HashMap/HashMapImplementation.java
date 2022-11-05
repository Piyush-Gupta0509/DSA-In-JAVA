package HashMap;

public class HashMapImplementation {
//	    public class HMNode{
//	        int key;
//	        int value;
//	        HMNode(int key, int value){
//	            this.key=key;
//	            this.value=value;
//	        }
//	    }
//	    
//	    LinkedList<HMNode>[] buckets;
//	    int size;
//
//	    public MyHashMap() {
//	        buckets=new LinkedList[5];
//	        for(int i=0;i<buckets.length;i++){
//	            buckets[i]=new LinkedList<>();
//	        }
//	    }
//	    
//	    private int HashFuction(int key){
//	        Integer i = new Integer(key);
//	        int hval= i.hashCode();
//	        int abshval= Math.abs(hval);
//	        int bi=abshval%buckets.length;
//	        return bi;
//	    }
//	    
//	    public HMNode Find(LinkedList<HMNode> ll,int key){
//	        for(HMNode node:ll){
//	            if(node.key==key){
//	                return node;
//	            }
//	        }
//	        return null;
//	    }
//	    
//	    public void put(int key, int value) {
//	        int bi=HashFuction(key);
//	        HMNode node = Find(buckets[bi],key);
//	        
//	        if(node!=null){
//	            node.value=value;
//	        }
//	        else{
//	            HMNode nnode= new HMNode(key,value);
//	            buckets[bi].addLast(nnode);
//	            size++;
//	        }
//	        
//	        double lambda=((size*1.0)/buckets.length);
//	        if(lambda>2){
//	            LinkedList<HMNode>[] oldbuckets=buckets;
//	            buckets=new LinkedList[2*oldbuckets.length];
//	            for(int i=0;i<buckets.length;i++){
//	            buckets[i]=new LinkedList<>();
//	            }
//	            
//	            for(LinkedList<HMNode> ll:oldbuckets){
//	                for(HMNode n:ll){
//	                    put(n.key,n.value);
//	                }
//	            }
//	        }
//	        
//	    }
//	    
//	    public int get(int key) {
//	        int bi=HashFuction(key);
//	        HMNode node = Find(buckets[bi],key);
//	        
//	        if(node!=null){
//	            return node.value;
//	        }else{
//	           return -1; 
//	        }
//	        
//	    }
//	    
//	    public void remove(int key) {
//	        int bi=HashFuction(key);
//	        HMNode node = Find(buckets[bi],key);
//	        
//	        if(node!=null){
//	            buckets[bi].remove(node);
//	            size--;
//	        }
//	        
//	    }
//	}

	/**
	 * Your MyHashMap object will be instantiated and called as such:
	 * MyHashMap obj = new MyHashMap();
	 * obj.put(key,value);
	 * int param_2 = obj.get(key);
	 * obj.remove(key);
	 */
}
