package Graph;

public class TopologicalSortUsingDFS {
//---------------------------------------------------------------------------------------------------------------------
//	  static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
//	    {
//	        boolean[] visited=new boolean[V];
//	        Stack<Integer> st=new Stack<>();
//	        
//	        for(int i=0;i<V;i++){
//	            if(visited[i]==false){
//	                DFS(adj,i,st,visited,V);
//	            }
//	        }
//	        
//	        int idx=0;
//	        int[] ans=new int[V];
//	        while(st.size()>0){
//	            ans[idx]=st.pop();
//	            idx++;
//	        }
//	        return ans;
//	    }
//	    
//	    static void DFS(ArrayList<ArrayList<Integer>> adj, int src, Stack<Integer> st, boolean[] visited, int V){
//	        visited[src]=true;
//	        for(int val: adj.get(src)){
//	            if(visited[val]==false){
//	                DFS(adj,val,st,visited,V);
//	            }
//	            
//	        }
//	        st.push(src);
//	        
//	    }
//-----------------------------------------------------------------------------------------------------------------------
}
