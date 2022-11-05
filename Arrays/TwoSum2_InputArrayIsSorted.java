package Arrays;

public class TwoSum2_InputArrayIsSorted {

	public static void main(String[] args) {
		int[] nums = { 3, 9, 14, 18, 51, 56, 64 };
		int tar = 27;
		int[] ans = twoSum(nums, tar);
		for (int n : ans) {
			System.out.print(n + " ");
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[]ans=new int[2];
		int s=0;
		int l=numbers.length-1;
		while(s<l) {
			int sum=numbers[s]+numbers[l];
			if(sum==target) {
				ans[0]=s;
				ans[1]=l;
				break;
			}
			else if(sum>target) {
				l--;
			}
			else {
				s++;
			}
		}
		return ans;
	}

}
