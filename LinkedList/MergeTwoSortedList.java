package LinkedList;

import java.util.*;

public class MergeTwoSortedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        
        ListNode c1=list1;
        ListNode c2=list2;
        
        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                pre.next=c1;
                c1=c1.next;
            }else{
                pre.next=c2;
                c2=c2.next;
            }
            pre=pre.next;
        }
        pre.next=(c1!=null)?c1:c2;
        return dummy.next;	
		}
}


