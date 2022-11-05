package HashMap;
import java.util.*;
public class FindItineraryFromTickets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}
		
		HashMap<String,Boolean> psrc=new HashMap<>();
		for(String s:map.keySet()) {
			String source=s;
			String dest=map.get(s);
			psrc.put(dest, false);
			if(psrc.containsKey(source)) {
				psrc.put(source, false);
			}else {
				psrc.put(source, true);
			}
		}
		
		String potentialsrc="";
		for(String s:psrc.keySet()) {
			if(psrc.get(s)) {
				potentialsrc=s;
			}
		}
		
		System.out.print(potentialsrc);
		while(true) {
			if(map.get(potentialsrc)==null) break;
			System.out.print("->"+map.get(potentialsrc));
			potentialsrc=map.get(potentialsrc);
		}

	}

}
