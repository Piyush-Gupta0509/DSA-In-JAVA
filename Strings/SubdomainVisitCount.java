package Strings;

import java.util.*;

public class SubdomainVisitCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] cpd = new String[n];
		for (int i = 0; i < cpd.length; i++) {
			cpd[i] = s.nextLine();
		}
		List<String> ans = subdomainVisits(cpd);
		Collections.sort(ans);
		System.out.println(ans);

	}

	public static List<String> subdomainVisits(String[] cpdomains) {
		HashMap<String,Integer> map=new HashMap<>();
		for(String domain:cpdomains){
			String temp[]=domain.split(" ");
			int visited=Integer.parseInt(temp[0]);
			String words[]=temp[1].split("\\.");
			
			StringBuilder sb=new StringBuilder();
			
			for(int idx=words.length-1;idx>=0;idx--){
				
				if(idx==words.length-1) {
					sb.append(words[idx]);
				}
				else {
					sb.insert(0, ".");
					sb.insert(0, words[idx]);
				}
				
				String subdomain=sb.toString();
				map.put(subdomain, map.getOrDefault(subdomain, 0)+visited);
			}
			
		}
		ArrayList<String> res=new ArrayList<>();
		for(String subdomain: map.keySet()) {
			StringBuilder sb=new StringBuilder();
			sb.append(map.get(subdomain));
			sb.append(" ");
			sb.append(subdomain);
			res.add(sb.toString());
		}
		

		return res;
	}

}
