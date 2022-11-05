package Arrays;
import java.util.*;

public class ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int l = i+1;
                int r = nums.length-1;
                while(l < r){
                    int sum = nums[i] + nums[l] + nums[r];
                    if(sum == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[l]);
                        triplet.add(nums[r]);
                        ans.add(triplet);
                        //System.out.println(triplet);
                        
                    }
                    
                    while(sum <= 0 && (l<r && nums[l] == nums[++l])){}
                    while(sum >= 0 && (l<r && nums[r] == nums[--r])){}
                   
                }
                
            }
        } 
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        List<List<Integer>> ans=threeSum(nums);
        System.out.println(ans);

    }

}
