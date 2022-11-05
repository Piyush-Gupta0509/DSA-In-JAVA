package BackTracking;
 import java.util.*;
public class GoldMine2 {
	public static class Main {
		static int max = 0;
		public static void getMaxGold(int[][] arr){
		    boolean[][] visited=new boolean[arr.length][arr[0].length];
			for(int i=0 ;i<arr.length ;i++){
			    for(int j=0; j<arr[i].length ;j++){
			        int sum=0;
			        ArrayList<Integer> bag=new ArrayList<>();
			        travelandcollect(arr,i,j,visited,bag);
			    
	    		    for(int val:bag){
	    		        sum+=val;
	    		    }
	    		    if(sum>max){
			        max=sum;
			        }
			    }
			    
			}
			
		}
		
		public static void travelandcollect(int[][] arr, int i, int j, boolean[][] visited, ArrayList<Integer> bag){
		    if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]==0 || visited[i][j]==true){
		        return;
		    }
		    visited[i][j]=true;
		    bag.add(arr[i][j]);
		    travelandcollect(arr, i-1, j, visited,bag);
		    travelandcollect(arr, i, j+1, visited,bag);
		    travelandcollect(arr, i, j-1, visited,bag);
		    travelandcollect(arr, i+1, j, visited,bag);
		}
		
		public void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[][] arr = new int[m][n];
			for(int i = 0; i < arr.length; i++){
				for(int j = 0 ; j  < arr[0].length; j++){
					arr[i][j] = scn.nextInt();
				}
			}
			getMaxGold(arr);
			System.out.println(max);
		}
}
}
