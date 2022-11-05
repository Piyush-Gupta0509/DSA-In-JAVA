package Graph;

import java.util.*;

public class PrismAlgorithm {

	public static class Edge {
		int u;
		int v;
		int wt;

		Edge(int u, int v, int wt) {
			this.u = u;
			this.v = v;
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

	public static int MST(ArrayList<Edge>[] graph) {
		int cost = 0;

		boolean[] visited = new boolean[graph.length];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(0, -1, 0));
		while (pq.size() > 0) {
			Pair temp = pq.remove();
			if (!visited[temp.vtx]) {
				visited[temp.vtx] = true;
				cost += temp.wt;

				ArrayList<Edge> edges = graph[temp.vtx];
				for(Edge edge:edges) {
					pq.add(new Pair(edge.v, temp.vtx, edge.wt));
				}
			}
		}

		return cost;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int vtces = scn.nextInt();
		int nedges = scn.nextInt();

		ArrayList<Edge>[] graph = new ArrayList[vtces];
		for (int i = 0; i < vtces; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		while (nedges-- > 0) {
			int v1 = scn.nextInt();
			int v2 = scn.nextInt();
			int wt = scn.nextInt();
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}

		System.out.println(MST(graph));

	}

}
