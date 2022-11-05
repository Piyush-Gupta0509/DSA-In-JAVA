package BackTracking;

public class FloodFill {

	public static void main(String[] args) {
		int[][] image = { { 0,0,0, }, { 0,0, 0 } };
		int sr = 0;
		int sc = 0;
		int color = 0;

		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
		int[][] ans=floodFill(image,sr,sc,color);
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

		

	}
	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if(image[sr][sc]==color) return image;
        int bcolor=image[sr][sc];
        int[][]helper =image;
        return helperfn(image,sr,sc,color,bcolor);
    }
	
	public static int[][] helperfn(int[][] helper, int sr, int sc, int color,int bcolor){
		if(sr<0 || sc<0 || sr==helper.length || sc==helper[0].length ||helper[sr][sc]!=bcolor) {
			return helper;
		}
		helper[sr][sc]=color;
		
		helperfn(helper,sr,sc+1,color,bcolor);
		helperfn(helper,sr-1,sc,color,bcolor);
		helperfn(helper,sr,sc-1,color,bcolor);
		helperfn(helper,sr+1,sc,color,bcolor);
		return helper;
	}

}
