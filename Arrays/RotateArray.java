package Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { -1};
		int k=2;
		if(k>nums.length) {
			k=k%nums.length;
		}
		swap(0,nums.length-1,nums);
		swap(0,k-1,nums);
		swap(k,nums.length-1,nums);
		for (int n : nums) {
			System.out.print(n+" ");
		}
		
	}
	
	public static void swap(int st,int end,int[] nums) {
		while(st<end) {
			int temp=nums[st];
			nums[st]=nums[end];
			nums[end]=temp;
			st++;
			end--;
		}
	}

}
