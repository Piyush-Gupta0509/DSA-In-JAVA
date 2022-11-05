package Graph;

class DSU{
    private int[] par;
    private int[] rank;
    
    DSU(int vtces){
        par = new int[vtces];
        rank = new int[vtces];
        
        for(int i=0;i<vtces;i++){
            par[i]=i;
            rank[i]=1;
        }
    }
    
    public int find(int num){
        if(num == par[num]){
            return num;
        }
        
        int leader=find(par[num]);
        par[num]=leader;
        return leader;
    }
    
    public void union(int x, int y){
        int xl=find(x);
        int yl=find(y);
        
        if(xl != yl){
            if(rank[xl] > rank[yl]) par[yl]=xl;
            else if(rank[xl] < rank[yl]) par[xl]=yl;
            else{
                par[xl]=yl;
                rank[yl]++;
            }
        }
    }
}


public class FindifPathExistsinGraphUsingDSU {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DSU dsu=new DSU(n);
        for(int i=0; i<edges.length ; i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            dsu.union(v1,v2);
            
        }
        return dsu.find(source)==dsu.find(destination);
    }
}
