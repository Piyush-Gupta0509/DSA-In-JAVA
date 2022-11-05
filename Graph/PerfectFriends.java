package Graph;
import java.io.*;
import java.util.*;

public class PerfectFriends {
	public static void main(String[] args) throws Exception {
	    Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
	    int k=scn.nextInt();
	    
	    ArrayList<Integer>[] graph=new ArrayList[n];
	    for(int i=0;i<n;i++){
	        graph[i]=new ArrayList<>();
	    }
	    for(int i=0;i<k;i++){
	        int v1=scn.nextInt();
	        int v2=scn.nextInt();
	        graph[v1].add(v2);
	        graph[v2].add(v1);
	    }
	    //System.out.println(graph);
	    
	    boolean[] visited=new boolean[n];
	    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        if(!visited[i]){
	            ArrayList<Integer> temp=new ArrayList<>();
	            DFS(graph,i,visited,temp);
	            res.add(temp);
	        }
	    }
	    
	    int ans=0;
	    for(int i=0;i<res.size();i++){
	        for(int j=i+1;j<res.size();j++){
	            ans=ans + (res.get(i).size()*res.get(j).size());
	        }
	    }
	    System.out.println(ans);
	      
	   }
	   
	   public static void DFS(ArrayList<Integer>[] graph, int src, boolean[] visited, ArrayList<Integer> temp ){
	       visited[src]=true;
	       temp.add(src);
	       for(int val:graph[src]){
	           if(!visited[val]){
	               DFS(graph,val,visited,temp);
	           }
	       }
	   }
}
