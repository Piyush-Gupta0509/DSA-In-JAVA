package Arrays;

public class ContainerWithMostWater {
    
    
    public static int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;

        int maxArea=0;
        
        while(l<r){
            int width =r-l;
            int area= width * Math.min(height[l], height[r]);
            if(area > maxArea){
                maxArea=area;
            }
            if(height[l] <= height[r]) l++;
            else r--;

        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }

}
