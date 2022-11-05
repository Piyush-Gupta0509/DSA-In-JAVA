package HashMap;

import java.util.*;

public class NumberOfEmployeesUnderEveryManager {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String CEO = "";

		HashMap<String, HashSet<String>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String emp = scn.next();
			String manager = scn.next();
			if (emp.equals(manager)) {
				CEO = emp;
				continue;
			}
			HashSet<String> hs = map.get(manager);
			if (hs == null) {
				hs = new HashSet<>();
				hs.add(emp);
				map.put(manager, hs);
			} else {
				hs.add(emp);
			}

			

		}
		
		HashMap<String,Integer> ans=new HashMap<>();
		getEmployeeCount(map,CEO,ans);
		System.out.println(ans);

	}
	
	public static int getEmployeeCount(HashMap<String,HashSet<String>> map, String manager, HashMap<String,Integer> ans) {
		HashSet<String> emplist=map.get(manager);
		
		if(emplist==null) {
			ans.put(manager, 0);
			return 1;
		}
		
		int size=0;
		for(String e:emplist) {
			size+=getEmployeeCount(map,e,ans);
		}
		
		ans.put(manager, size);
		return size+1;
	}
	
	
}
