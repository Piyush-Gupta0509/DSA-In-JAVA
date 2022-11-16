package Arrays;


public class SortColors {
    
    public static int[] sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        
        while(k<=j) {
            if(k<i) {
                k=i;
            }
           if(nums[k]==1) {
               k++;
           }else if(nums[k]==0) {
               int temp=nums[i];
               nums[i]=nums[k];
               nums[k]=temp;
               i++;
           }else {
               int temp=nums[j];
               nums[j]=nums[k];
               nums[k]=temp;
               j--;
           }
        }
        return nums;
        
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 1, 1, 0, 0, 1, 1, 2 };
        int[] ans = sortColors(arr);
        for(int val: ans) {
            System.out.print(val+" ");
        }
    }

}
