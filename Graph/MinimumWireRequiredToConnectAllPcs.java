package Graph;
import java.io.*;
import java.util.*;


public class MinimumWireRequiredToConnectAllPcs {
	static class Edge {
	      int src;
	      int nbr;
	      int wt;

	      Edge(int src, int nbr, int wt) {
	         this.src = src;
	         this.nbr = nbr;
	         this.wt = wt;
	      }
	   }
	   
	   public static class Pair implements Comparable<Pair>{
			int vtx;
			int par;
			int wt;

			Pair(int vtx, int par, int wt) {
				this.vtx = vtx;
				this.par = par;
				this.wt = wt;
			}
			
			public int compareTo(Pair o) {
				return this.wt-o.wt;
			}
		}

	   public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int vtces = Integer.parseInt(br.readLine());
	      ArrayList<Edge>[] graph = new ArrayList[vtces];
	      for (int i = 0; i < vtces; i++) {
	         graph[i] = new ArrayList<>();
	      }

	      int edges = Integer.parseInt(br.readLine());
	      for (int i = 0; i < edges; i++) {
	         String[] parts = br.readLine().split(" ");
	         int v1 = Integer.parseInt(parts[0]);
	         int v2 = Integer.parseInt(parts[1]);
	         int wt = Integer.parseInt(parts[2]);
	         graph[v1].add(new Edge(v1, v2, wt));
	         graph[v2].add(new Edge(v2, v1, wt));
	      }

	      MST(graph);
	   }
	   
	   public static void MST(ArrayList<Edge>[] graph) {

			boolean[] visited = new boolean[graph.length];
			PriorityQueue<Pair> pq = new PriorityQueue<>();
			pq.add(new Pair(0, -1, 0));
			while (pq.size() > 0) {
				Pair temp = pq.remove();
				if (!visited[temp.vtx]) {
					visited[temp.vtx] = true;
					
					if(temp.par!=-1){
					    System.out.println("["+ temp.vtx + "-" + temp.par + "@" + temp.wt + "]");
					}
					

					ArrayList<Edge> edges = graph[temp.vtx];
					for(Edge edge:edges) {
						pq.add(new Pair(edge.nbr, temp.vtx, edge.wt));
					}
				}
			}

			
		}
}
