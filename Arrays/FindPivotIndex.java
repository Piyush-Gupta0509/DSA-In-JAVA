package Arrays;

public class FindPivotIndex {

	public static void main(String[] args) {
		int[] nums = { 2,1,-1 };
		int n = nums.length;
		int lsum = 0;
		int rsum = 0;
		for (int i = 0; i < n; i++) {
			rsum += nums[i];
		}
		boolean flag=false;
		int i = 0;
		while (i < n) {
			rsum-=nums[i];
			if(lsum==rsum) {
				flag=true;
				break;
			}
			lsum+=nums[i];
			
			i++;
		}
		if(flag==true) {
			System.out.println(i);
		}else {
			System.out.println(-1);
		}

	}

}
