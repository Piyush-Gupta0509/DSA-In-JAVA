package BackTracking;

import java.util.*;

public class Permutations {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> ans = permute(nums);
		System.out.println(ans);

	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		boolean[] visited = new boolean[nums.length];
		List<Integer> asf = new ArrayList<>();
		backtrack(visited, nums, asf,res);
		return res;
	}

	public static void backtrack(boolean[] visited, int[] nums, List<Integer> asf,List<List<Integer>> res) {
		if (asf.size() == nums.length) {
			res.add(new ArrayList(asf));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if(visited[i]) {
				continue;
			}
			asf.add(nums[i]);
			visited[i]=true;
			backtrack(visited,nums, asf,res);
			asf.remove(asf.size()-1);
			visited[i]=false;

		}
	}

}
